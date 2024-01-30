package day04;

import java.util.*;
public class WhileTest2 {
	public static void prob1() {
		//[문제1] 1~100까지 정수를 다음과 같은 식으로 계산한 수식과 결과값을 출력하세요
		// 1+ (-2) + 3 + (-4) + 5 + (-6) .... +(-100)
		int i=1;
		int sum = i;
		while(i!=-100) {
			if(i%2==1) {
				System.out.printf("%d + ",i);
				i=-(++i);
			}else {
				System.out.printf("(%d) + ", i);
				i=-(--i);
			}	
			sum+= i;
		}// while
		System.out.printf("%d = %d\n", i, sum);
		System.out.println("sum= "+sum);
	}
	public static void prob2() {
		//[문제2] 
		// 1+ (1+2) + (1+2+3) + (1+2+3+4)...+(1+2+...+10)
		//의 결과값을 출력하세요
		int i = 1;
		int sum = i;
		int tot_sum = i;
		while(i<10) {
			i +=1;
			sum +=i;
			tot_sum += sum;
		}
		System.out.println("tot_sum: "+tot_sum);
		
	}
	public static void prob2_1() {
		int i=1;
		int sum =0;
		int total = 0;
		String str1="1", str2="1";
		
		while(i<=10) {
			sum+=i;
			total+=sum;
			i++;
			if(i<=10) {
			str1+="+"+i;
			str2+="+("+str1+")";
			}
		}
		System.out.println(str2);
		System.out.println("="+total);
	}
	public static void prob3() {
		//[문제3] Scanner이용해서 "구구단의 몇 단을 하시겠어요?" 입력받아 구구단식 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단의 몇 단을 하시겠어요? > 입력: ");
		int i = sc.nextInt();
		int n = 1;
		while(n<10) {
			System.out.printf("%d X %d = %d\n",i,n,i*n);
			n++;
		}
		
	}
	public static void main(String[] args) {
//		WhileTest2.prob1();
//		WhileTest2.prob2();
		WhileTest2.prob2_1();
//		WhileTest2.prob3();
	}
}
