package day04;

public class NewTest {
	public static void prob1() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
			
		}
	}
	public static void prob2() {
		for(int i=0;i<5;i++) {
			System.out.print(" ".repeat(4-i));
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
			
		}
	}
	public static void prob2_1() {
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(i+j>=3) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}	
			}
			System.out.print("\n");
			
		}
	}
	
	public static void prob3() {
		for(int i=0;i<5;i+=2) {
			System.out.print(" ".repeat(2-i/2));
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
			
		}
	}
	public static void prob3_1() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				if(i+j>=2&&j-i<=2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
	public static void main(String[] args) {
		/*
		 *  *****
		 */
		System.out.println("Prob 1:");
		NewTest.prob1();
		System.out.println("Prob 2:");
		NewTest.prob2();
		System.out.println("Prob 2_1:");
		NewTest.prob2_1();
		System.out.println("Prob 3:");
		NewTest.prob3();
		System.out.println("Prob 3_1:");
		NewTest.prob3_1();
	}
}
