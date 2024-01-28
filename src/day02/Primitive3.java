package day02;

public class Primitive3 {
	public static void main(String[] args) {
		System.out.println("3. 문자형(char)----------");
		//char (2byte. 0~65535) : java는 유니코드 체계를 사용(모든 국가 언어 표현 가능)
		char 변수1 = '가'; // C언어는 이렇게 절대 불가 - 영어만 가능
		char 家 = '가';
		
		System.out.println("가=" +변수1);
		System.out.println("한자=" +家);
		
		char c1 = '최';
		char c2 = '\uff57'; // 역슬래시u하고 16진수로 쓰면 문자 하나가 출력됨
		
		System.out.println(c1);
		System.out.println(c2);
		char c3='A';
		System.out.println(c3);
		System.out.println(c3+1); 
		// char + int ==> 큰 자료형으로 자동 형변환 (promotion, upcasting)
		
		// c3+1 ==> int ==> char유형으로 변환하려면 강제 형변환(casting, downcasting)
		System.out.println((char)(c3+1));
		// char 차입이 연산에 사용되면 자동으로 int형변환 된다.
		// char+char = int
		
		String str = "최길동"; //문자열 ==> Reference Type(참조형)
		System.out.printf("str=%s\n\n",str);
		
		System.out.println("4. 논리형 (boolean)-------------");
		//boolean (1byte) : True와 False값만 가짐
		boolean bool1 = true;
		boolean bool2 = 2>5;
		System.out.println("bool1="+bool1);
		System.out.println("bool2="+bool2);
		// java는 javaScript에 비해서 정적인 언어이다. 값을 미리 선언하는 언어
		// javaScript는 값을 입력할 때 형태가 결정되므로 동적인 언어
		
		
	}//-----------------------
}////////////////////////////////
