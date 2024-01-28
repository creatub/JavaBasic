package day03;

public class Operator {
	public static void main(String[] args) {
		System.out.println("논리 연산자()------------");
		/*
		 * 1)&
		 * 2)|
		 *  : 앞의 연산으로 결과를 알 수 있어도 뒤의 문장까지 비교를 한다.
		 * 3)&&
		 * 4)||
		 *  : &&의 경우 앞의 연산 결과가 false이면 뒤의 연산을 생략한다
		 *  : ||의 경우 앞의 연산 결과가 true이면 뒤의 연산을 생략한다
		 *  => 연산 속도가 빠름
		 *  java에서 연산자는 cpu가 처리함
		 */
		
		// [문제 1]
		int i = 1; //1
		int j = i++; //j=1, i=2
		
		if((i>++j)&(i++==j)) { // (2>2)&(3==2) => false
			i=i+j;
		}
		System.out.println("i="+i); // 3
		
		// [문제 1]
		int i2 = 1; //1
		int j2 = i2++; //j=1 i=2
				
		if((i2>++j2)&&(i2++==j2)) { // (2>2)&&(수행 안함) => false
			i2=i2+j2;
		}
		System.out.println("i2="+i2); // 2
		
		// [문제 2]
		int k=0;
		int p=1;
		
		if((k++ ==0)|(p++ ==2)) { // | 일 때: (true)|(false) => k=1, p=2
			k=42;
		}
		
		System.out.println("k="+k+", p="+p); // |일 때: k=42, p=2
		
		int k2=0;
		int p2=1;
		
		if((k2++ ==0)||(p2++ ==2)) { // || 일 때: (true)|(수행 안함) => k=1, p=1
			k2=42;
		}
		
		System.out.println("k="+k2+", p="+p2); // |일 때: k=42, p=1
		
		int a=10;
		int b;
		b = (a>7? 1:0);
		
		System.out.println(b);
		
	}//main()---------------
}//class()------------------
