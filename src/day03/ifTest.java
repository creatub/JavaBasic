package day03;

import java.util.Scanner;

public class ifTest {
	/*
	 * if(조건식){
	 * 	실행문1;
	 * }
	 * 실행문2;
	 * 조건 식이 true면 실행문 1을 실행
	 */
	public static void main(String[] args) {
		System.out.println("정수를 입력하세요=> ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("입력값: "+num);
		if(num>0) {
			System.out.printf("%d는 양수입니다~\n",num);
		}
		System.out.println("*****************");
		
		//[문제1] 입력받은 값이 짝수면 "Even"을 출력하고, 홀수면 "Odd"를 출력하세요
		// 1) if문
		if(num%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
		
		// 2) 삼항연산자
		String isEven = num%2==0?"Even":"Odd";
		System.out.println(isEven);
	}
}
