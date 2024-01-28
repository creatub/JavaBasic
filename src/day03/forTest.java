package day03;

public class forTest {
	public static void main(String[] args) {
		
		/*
		 * for(변수 선언 및 초기화; 조건식; 증감식){
		 * 	실행문;
		 * }
		 * 조건식이 true면 실행문을 반복실행
		 * 
		 * for(;;){ //=> 무한 루프
		 * }
		 */
		for(int i=0; i<10; i++) {// 지역변수 i의 scope는 for블럭 까지이다.
			System.out.println(i+ " : *");
		}
		
//		for(;;) {
//			System.out.println("@@@");
//		}
//		System.out.println("Bye"); // unreachable code 에러뜸
		
		for(int i=10;i>0;i-=3) {
			System.out.println("Hello: "+i);
		}
		int j=2; // j의 scope는? j가 속해 있는 block 까지임 => main()
		for(;j<20;j*=3) {
			System.out.println(j);
		}
	}
}
