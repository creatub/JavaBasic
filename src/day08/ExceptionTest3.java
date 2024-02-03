package day08;

public class ExceptionTest3 {

	public static void main(String[] args) {
		
		
		for(int i = 1; i<5;i++) {
			try {
			int y = 50/(i-3);
			System.out.println("y: "+y);
			}catch(ArithmeticException e) {
				System.out.println("50/"+(i-3)+"에서 에러발생");
			}
		}//for-----
		System.out.println("The End-----");
	}

}
