package day04;

import java.util.*;

public class DoWhileTest {
	public static void main(String[] args) throws Exception {
		/*
		 * 변수 선언문 및 초기화식
		 * do{
		 * 	실행문
		 * 	증감식
		 * }while(조건식);
		 * 
		 * while문의 경우 조건 체크를 먼저 함
		 * do ~while문의 경우 실행문을 먼저 실행한 뒤 조건 체크를 함
		 */
		// Hello문자열을 5번 출력하세요
		int i = 10;
		do {
			System.out.println("Hello");
			i++;
		}while(i<5);
		System.out.println("The End ----" + i);

		int num=0;
		do {
			System.out.println("0~9사이의 정수값을 입력하세요 [종료:X]");
			num = System.in.read()-'0'; // throws Exception 안하면 오류남
			// 한 바이트만 입력을 받음. & ASCII 코드 값이 들어감 (0:48~9:57)
			System.in.skip(2); // 2byte를 건너뜀.
			System.out.println("num: "+num); // \r, \n까지 2개 더 나와서 13, 10도 출력됨
		}while(num!='X');
		
	}
}
