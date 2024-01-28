package day03;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) throws Exception { // in.read를 위한 Exception
		System.out.println("정수를 입력하세요=>");
//		int n = System.in.read(); // java는 입력값을 받으려면 처리해줘야 하는 게 많다 int를 넣으면 ASCII코드가 들어옴
//		System.out.println("n: "+n);
		// System.in.read()는 한 자리만 받기 때문에 두 자릿수 이상 받기 위해서는 코드 추가로 짜야함
		// => jdk3부터 나온 Scanner라는 게 있음
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("n= "+n);
		System.out.println("키를 입력=> ");//185.3
		double height=sc.nextDouble();
		System.out.println("당신의 키는 " +height);
		
		System.out.println("아침을 먹었는 지 입력(true/false)=>");
		boolean food= sc.nextBoolean();
		System.out.println("아침 식사 여부: "+food);
		
		System.out.println("올해의 목표는? =>");
		String str=sc.next(); // nextLine은 줄단위로 입력받는 것
		System.out.println("당신의 목표: "+str);
		
		System.out.println("올해의 목표를 문장으로 작성 =>");
//		sc.nextLine();
		sc.skip("\r\n");
		String str2=sc.nextLine(); // 개행문자가 오기 전까지 입력을 받음
		System.out.println("당신의 목표: "+str2);
	}
}
