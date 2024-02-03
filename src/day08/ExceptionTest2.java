package day08;

public class ExceptionTest2 {

	public static void main(String[] args) {
		
		try {
		for(int i = 1; i<5;i++) {
			int y = 50/(i-3);
			System.out.println("y: "+y);
		}//for-----
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		System.out.println("The End-----");
	}

}
