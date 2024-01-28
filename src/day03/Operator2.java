package day03;

public class Operator2 {
	public static void main(String[] args) {
		System.out.println("--삼항 연산자 (? :) ----------");
		/* syntax를 보겠다
		 * 변수 선언문 = (조건식)? 값1:값2;
		 * => 조건식이 true이면 값1을 변수에 대입하고,
		 *          false면 값2를 변수에 대입한다
		 */
		int a=50, b=60;
		int result= (a>b)? a:b;
		System.out.println("result: "+result);
		
		String result2 = (a>b)?a+"":b+""; // 편법으로 int에 문자열을 더해줘서 string으로 형변환
		String result3 = (a<b)?String.valueOf(a):String.valueOf(b);
		
		System.out.println("res2: "+result2+"\nres3: "+result3);
		
		
//		int a = 10;
//		int b;
//		
//		b = (a>5? 10:0);
//		System.out.println(b);
	}
}
