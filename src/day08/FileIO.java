package day08;

import javax.swing.*;
import java.io.*;
//파일을 읽어서 콘솔에 출력해보자
//C:\multicampus\java-workspace\JavaBasic\src\day08\Polymorphism.java
//FileInputStream(1byte) 또는 FileReader(2byte-char) : 파일을 읽기 위한 클래스
//FileOutputStream(1byte) 또는 FileWriter(2byte-char) : 파일에 쓰기 위한 클래스
public class FileIO {

	public static void main(String[] args) {
		String fileName=JOptionPane.showInputDialog("읽을 파일명을 입력하세요");
		if(fileName==null) return;
		System.out.println("파일명: "+fileName);
		String content=reading(fileName); // 파일 내용을 반환
		System.out.println(content);
		
	}
	/* 		Object
	 * 			|
	 * 		Throwable		
	 * 		|		|
	 * Exception	Error
	 * 		|
	 * 	IOException
	 * 		|
	 *  FileNotFoundException
	 * 
	 * */
	public static String reading(String fileName) {
		String str="";
		FileReader fr = null;
		char[] data=new char[1000];//파일 내용을 담을 배열
		
		//읽을 파일과 노드 연결
		try {
			fr=new FileReader(fileName); // FileNotFoundException이 발생됨
			
			int n =0;
			while((n=fr.read(data))!=-1) {//파일 끝에 도달하면 -1을 반환 IOException 발생
				//파일 내용은 data배열에 담긴다.
				String content=new String(data,0,n);//n: 읽은 바이트수
				str+=content;
			}//while-----
			//중요한 코드
			if(fr!=null) {
				fr.close(); // IOException 발생
			}
		}catch(FileNotFoundException e) {
			str=fileName+"이란 파일은 없습니다.";
//			JOptionPane.showMessageDialog(str, e);
			System.out.println("그런 파일은 없습니다.");
		}catch(IOException e) {
			System.out.println("{0}: The write operation could not " +
			        "be performed because the specified " +
			        "part of the file is locked.");
		}
		catch(Exception e) {
			System.out.println("Error");
		}
		return str;
	}

}
