package day03;

public class forTest2 {
	public static void main(String[] args) {
		//[1] for루프를 이용해서 1~10까지의 합과 곱을 구해 출력하세요

		int sum_res = 0;
		int multi_res = 1;
		for(int i=1;i<=10;i++) {
			sum_res+=i;
			multi_res*=i;
		}
		System.out.println("1부터 10까지 수의 합은: "+sum_res);
		System.out.println("1부터 10까지 수의 곱은: "+multi_res);
		
		//[2] 1~20까지 정수 중 (2 또는 3의 배수)가 아닌 수를
		//출력하고, 이 수들의 총합을 구하세요

		System.out.println("2의 배수나 3의 배수가 아닌 수");
		int sum_res_2 = 0;
		for(int i=1; i<=20; i++) {
			if(i%2 != 0 && i%3 != 0) {
				System.out.printf("%d ", i);
				sum_res_2 += i;
			}
		}
		System.out.println("\n2의 배수나 3의 배수가 아닌 수 합은: "+sum_res_2);
		
		//[3] 알파벳 대문자A,B...Z 를 for루프 이용해 출력하기
		for(char c='A'; c<='Z'; c++) System.out.printf("%c ", c);
		
		
	}
}
