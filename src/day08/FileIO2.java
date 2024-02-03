package day08;

import javax.swing.*;
import java.io.*;
//파일을 읽어서 콘솔에 출력해보자
//C:\multicampus\java-workspace\JavaBasic\src\day08\Polymorphism.java
//FileInputStream(1byte) 또는 FileReader(2byte-char) : 파일을 읽기 위한 클래스
//FileOutputStream(1byte) 또는 FileWriter(2byte-char) : 파일에 쓰기 위한 클래스

//throws는 background에서 발생한 에러를 back에서 처리하면 console로 밖에 보여줄 수 없기 때문에
//GUI를 사용하는 상황에서 사용자에게 정보를 보여주기 위해 사용한다.
public class FileIO2 {

	public static void main(String[] args) { //throws IOException로 JVM에 넘기는 것도 가능함
		String fileName=JOptionPane.showInputDialog("읽을 파일명을 입력하세요");
		if(fileName==null) return;
		System.out.println("파일명: "+fileName);
		try {
			String content=reading(fileName); // 파일 내용을 반환
			System.out.println(content);
		}catch(FileNotFoundException e) {
			
		}catch(IOException e) {
			System.out.println("reading error occured.");
		}
		
		
	}
	public static String reading(String fileName) throws FileNotFoundException, IOException{
		String str="";
		FileReader fr = null;
		char[] data=new char[1000];//파일 내용을 담을 배열
		
		//읽을 파일과 노드 연결
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
		return str;
	}

}
