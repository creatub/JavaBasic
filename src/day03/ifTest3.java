package day03;

import java.util.Scanner;

//국어 영어 점수를 받아서, 총합계 점수, 평균 점수, 학점을 출력하는 프로그램을 작성하세요
// 평균점수를 이용한 학점
/* 100 ~90 : A
 * 89 ~ 80 : B
 * 79 ~ 70 : C
 * 69 ~ 60 : D
 * 그 외: F
 * 
 * */
//성적 테이블표 형태로 출력
/*-------------------------
 * 국어		영어
 * ----------------------
 * 85.3		92.5
 * -----------------------
 * 합계점수: xx 점
 * 평균점수: 
 * 학   점: B
 * -----------------------
 * */

public class ifTest3 {
	double x; //인스턴스 변수
	static double y; // 클래스 변수(전역 변수)
	static boolean z;
	static String str; //참조형
	/* 기본값
	 * byte : 0
	 * short: 0
	 * char : '\u0000' 
	 * int : 0
	 * long: 0L
	 * float: 0.0f
	 * double: 0.0
	 * boolean: false
	 * 참조형: null
	 * */
	public static void main(String[] args) {
		System.out.println("y= "+y);
		System.out.println("z= "+z);
		System.out.println("str= "+str);
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요 : ");
		float korScore = sc.nextFloat();
		System.out.println("영어 점수를 입력하세요 : ");
		float engScore = sc.nextFloat();
		
		System.out.println("-------------------");
		System.out.println("국어\t영어");
		System.out.println("-------------------");
		System.out.printf("%.1f\t%.1f\n",korScore,engScore);
		System.out.println("-------------------");
		float sum = (korScore+engScore);
		System.out.printf("합계 점수: %.1f점\n", sum);
		System.out.println("sum: "+ String.format("%.1f", sum));

		float avg = sum/2.0f;
		System.out.printf("평균 점수: %.1f점\n", avg);
		System.out.println("avg: "+ String.format("%.1f", avg));
		char gpa =' ';// 지역변수(local variable)은 초기화하지 않고 사용하면 에러 발생
		// if-else 문
		if(avg>=90) {
			gpa = 'A';
		}else if(avg>=80){
			gpa = 'B';
		}else if(avg>=70){
			gpa = 'C';
		}else if(avg>=60){
			gpa = 'D';
		}else {
			gpa = 'F';
		}
		System.out.printf("학점: %c\n", gpa);
		//switch 문
		
		switch((int)avg/10) {
		case 10:
		case 9:
			gpa = 'A';
			break;
		case 8:
			gpa = 'B';
			break;
		case 7:
			gpa = 'C';
			break;
		case 6:
			gpa = 'D';
			break;
		default:
			gpa = 'F';
			
		}
		System.out.printf("학점: %c\n", gpa);

		System.out.println("-------------------");
		
		
		
	}
}
