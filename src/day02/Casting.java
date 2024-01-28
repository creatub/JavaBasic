package day02;

public class Casting {
	public static void main(String[] args) {
		//형변환
		//[1] 자동형변환
		//[2] 강제형변환 ==> 형변환 연산자를 사용 ==> (자료형)변수
		// byte < short < int < long < float < double
		//        char
		// *boolean은 형변환이 아예 안 된다.
		byte b =10;
		float f= b; //byte타입 ==> float으로 자동 형변환
		System.out.println(b);
		System.out.println(f);
		
		double d = 123.456; // 강제형변환(casting): 데이터 손실이 발생할 수 있다.
		short s = (short)d;
		System.out.println(d);
		System.out.println(s);
		
		int x=68;
		char y = (char)x;
		// 형변환한 뒤 x,y값 출력하기
		System.out.printf("x=%d%n",x);
		System.out.printf("y=%c%n",y);
		
		float result = b + y * f;
		System.out.printf("res=%.2f%n", result);
		
		byte m = 1;
		byte n = 5;
		// byte result2 = m+n; [X]
		int result2 = m+n;
		/* int형보다 작은 유형의 데이터가 연산에 사용되면 자동으로 int 유형으로 형변환 된다.
		 * byte -----+
		 * short ----+-- int
		 * char -----+
		*/
		char c1='A';
		char c2='B';
		// char c3 = c1+c2; [X]
		int c3 = c1+c2;
		
		String c4 = ""+c1+c2;
		System.out.println(c3);
		System.out.println(c4);
		
		
	}
}
