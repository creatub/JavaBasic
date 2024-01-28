package day02;

import java.lang.System; // java.lang 패키지 import문은 생략해도 됨
import java.util.Date;

public class Primitive {
	public static void main(String[] args){
		System.out.println("----기본 자료형(Primitive Type)-----");
		Date date = new Date();
		System.out.println("오늘 날짜: "+date);
		System.out.println("1. 정수형 (byte < short < [int] < long)----------");
		byte bt1 = -128; // 1byte (-128~127)
		byte bt2 = 127;
		System.out.println("bt1= "+bt1);
		// sysout + Ctrl+스페이스바
		System.out.println("bt2= "+bt2);
		short st1 = -3000;
		short st2 = 5000;
		System.out.println("st1= "+st1);
		System.out.println("st2= "+st2);
		int it1 = -234235; // 4byte(32bit) -2^31~2^31 -1
		int it2 = 34583673;
		System.out.println("it1= "+it1);
		System.out.println("it2= "+it2);
		long ln1 = 80; // 8byte(64bit) -2^63~2^63-1 -> int형 정수를 long에 넣는 것
		long ln2 = 80L; //뒤에 접미사 l,L을 붙인다. -> long형 정수를 long에 넣는 것
		System.out.println("ln1= "+ln1);
		System.out.println("ln2= "+ln2);
		int i = 1000000000; // 0이 9개
		long j = 10000000000L; //0이 10개 -> 값 자체가 int를 default로 삼기 떄문에 L 붙여줘야함
		
		//printf(포맷문자열, 값, ...)
		// %d : 정수값
		// %f : 실수값
		// %s : 문자열
		// %n or \n : 줄바꿈 (new line)
		System.out.printf("i= %d\nj= %d\n", i, j);
		
		int a=010; //8진수 정수. 앞에 '0'을 접두어로 붙인다.
		int b=011;
		System.out.printf("a=%d\nb=%d\n", a, b);
		// Ctrl + Alt + ↓ = 한 줄 그대로 복사 or 드래그 한 영역 그대로 밑에 복사
		int c =0217;
		System.out.printf("c=%d\n", c);
		// 동일한 스코프 내에 동일한 이름의 변수를 선언할 수 없다.
		int d = 0x1A; // 16진수
		System.out.printf("d=%d\n", d);
		int e = 0x1AF;
		System.out.printf("e=%d\n", e);
		
		System.out.println("2. 실수형 ()----------");
		System.out.println("3. 문자형 ()----------");
		System.out.println("4. 논리형 ()----------");
		
	}
}
