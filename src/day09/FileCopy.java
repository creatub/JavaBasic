package day09;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

// FileInputStream (1byte) ==> read(byte[] data)
// FileOutputStream(1byte) ==> write(byte[] data, int off, int len)
public class FileCopy {
	// src파일을 읽어서 dest파일로 내보내자
	public static void imageCopy(String src, String dest) throws IOException { //FileNotFoundException이 자식임
		// 1. 노드 연결
		FileInputStream fis = new FileInputStream(src);// 예외 발생
		FileOutputStream fos = new FileOutputStream(dest);// 예외 발생
		
		byte[] data = new byte[1024];//1KB => 파일 데이터를 담을 배열
		int n =0;//읽은 바이트 수
		int total=0;//읽은 바이트 수를 누적=>파일 크기
		
		while((n=fis.read(data))!= -1) { // data를 안 넣어주면 1byte씩 읽음 => 예외 발생 IOException
			fos.write(data, 0, n); // data를 내보낼 건데 index 0 부터 n까지만
			fos.flush();
			System.out.println("n: "+n);//읽은 바이트 수
			total+=n;//파일 크기
		}//while----------
		System.out.println(total+"byte 카피 완료!!!");
		if(fis!=null) fis.close();
		if(fos!=null) fos.close();
	}

	public static void main(String[] args) {
		// 원본파일: C:\Users\rlatk\Pictures\Screenshots\Diary.png
		// 목적파일: src/day09/copy.png
		Scanner sc = new Scanner(System.in);
		// Ctrl+Shift+O : 자동 import

		System.out.println("원본 파일명 입력: ");
		String file1 = sc.nextLine();

		System.out.println("목적 파일명 입력: ");
		String file2 = sc.nextLine();

		System.out.println(file1 + "파일을 " + file2 + "파일로 카피합니다.");

		try {
			FileCopy.imageCopy(file1, file2);
			System.out.println("파일 카피 완료!");
		} catch (IOException e) {
			System.out.println("파일 카피 중 에러: "+e.getMessage());
		}
	}

}
