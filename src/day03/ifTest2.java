package day03;

import java.util.Scanner;

public class ifTest2 {
	public static void main(String[] args) {
		//입력 값이 11 22 33 44 55...
		// => "OK 10의 자리와 1의 자리가 같아요"
		// 그렇지 않으면 "NO 10의 자리와 1의 자리가 달라요"를 출력하세요
		System.out.println("두 자리 정수를 입력하세요=>");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//유효성 체크: 두 자리가 아닐 경우
		if(num>=100||num<10) {
			System.out.println("입력 오류! 두 자리 정수여야 해요");
			sc.close();
			return; // return하면 else안 써도 돼서 좀 더 깔끔해짐
		}else {
			if(num%10==num/10) {
				System.out.println("십의 자리와 일의 자리가 같아요.");
			}else {
				System.out.println("십의 자리와 일의 자리가 달라요.");
			}
		}
		String same = (num%11==0)?"OK 같아요":"NO 달라요";
		System.out.println("십의 자리와 일의 자리가 " + same);
		
		System.out.println((num%11==0)?"OK same":"No Not same");
		System.out.println(same.toLowerCase()); // 재사용
		
		sc.close();
	}
}
