package day05;

import java.util.*;
public class ArrayTest {

	public void testArray() {
		System.out.println("1차원 배열----------");
		int []a; // 1. 선언
		boolean b[];
		
		a = new int[3];// 2. 메모리 할당
		b = new boolean[3];
		System.out.println(a[0]);
		System.out.println(b[0]);
		// 3. 초기화
		a[0]=100;
		a[1]=017;//8진수
		a[2]=0x16;//16진수
		for(int i =0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		b[0]=true;
		b[1]=false;
		b[2]=1>0;
		for(int i =0; i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		//for-each루프문. 확장 for루프문
		/*
		 * for(변수선언문: 자료구조(배열)){
		 * 	실행문;
		 * }
		 */
		for(int x:a) {
			System.out.println("x= "+x);
		}
		
		for(boolean x:b) {
			System.out.println("x= "+x);
		}
	}
	public static void testArray2() {
		System.out.println("2. 참조형 배열----------------");
		String str[]; 
		str = new String[4];
		str[0]="Hi";
		str[1]="Hello";
		str[2]="Good";
		str[3]="Morning";
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		for(String i:str) {
			System.out.println(i);
		}
		/*
		 * String s1 = "Good";
		 * String s2 = new String("Morning");
		 * String[] str = {"Hi", new String("Hello"), s1, s2};
		 * String str2[] = {"Hi", "Hello", "Good", "Morning"};
		 * 
		 * str이라는 지역변수가 Stack이라는 영역에 올라감
		 * 4개의 stack을 차지하고 있다가 값을 쓰면 "Hi"를 가리키는 식으로 값 입력
		 */
	}
	
	public static void prob1() {
		Random rand=new Random(50);
		int score[];
		score= new int[10000];
		for(int i=0; i<score.length;i++) {
			int randScore = rand.nextInt(451);
			score[i] = randScore;
		}
		// 1.만점자 몇 명인지?
		int perfectCount=0;
		int zeroCount=0;
		int sum = 0;
		System.out.print("만점자 (index) : ");
		for(int i=0;i<score.length;i++) {
			if(score[i]==450) {
				System.out.print(i+" ");
				perfectCount++;
			} // 1번 if
			if(score[i]==0) {
				zeroCount++;
			} // 2번 if
			sum+=score[i];
		}
		System.out.println("\n만점자 수: " + perfectCount +"명");
		// 2.0점 몇 명인지?
		System.out.println("0점자 수: " + zeroCount +"명");
		// 3. 평균은 어떻게 되었는지? 
		float avg=(float)sum/score.length;
		System.out.println("평균: "+avg);
		// 4. 평균보다 +- 50점인 학생들 카운드(포함)
		int avg50Count=0;
		for(int i:score) {
			if(i>=avg+50||i<=avg-50) {
				avg50Count++;
			}
		}
		System.out.println("평균보다 50점 이상 차이나는 사람의 수: "+avg50Count+"명");
	}
	
	public static void main(String[] args) {
//		ArrayTest obj = new ArrayTest(); // static이 아닌 함수에 대해서는 객체를 먼저 생성해야한다.
//		ArrayTest at = new ArrayTest(); // static이 아닌 함수에 대해서는 객체를 먼저 생성해야한다.
//		obj.testArray();
//		//testArray() 호출하기 // => 인스턴스 메서드
//		
//		//testArray2() 호출하기// static 메서드 => 클래스 메서드
//		ArrayTest.testArray2();
		ArrayTest.prob1();

	}
}
