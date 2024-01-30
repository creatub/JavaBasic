package day05;

import java.util.*;

public class ArrayTest6 {

	public static void solution1() {
		System.out.println("------성적 확인 문제------");
		String subject[]= {"국어","수학","영어","과탐","사탐"};
		//1학기 성적
		int[] term1 = {99, 75, 82, 50, 48};
		int[] term2 = {80, 82, 100, 50, 42};
		
		int advCnt =0;
		int sameCnt = 0;
		String sameStr ="";
		for(int i=0; i<subject.length; i++) {
			if(term2[i]>term1[i]) advCnt++;
			if(term2[i]==term1[i]) {
				sameCnt++;
				sameStr+=subject[i]+" ";
			}
		}
		//1. 성적이 2학기에 향상된 과목 수를 출력
		System.out.println("2학기에 향상된 과목 수: "+advCnt);
		//2. 성적이 1,2학기 동일한 과목수, 과목명을 출력
		System.out.println("성적이 1,2학기 동일한 과목수: "+sameCnt);
		System.out.println("성적이 1,2학기 동일한 과목명: "+sameStr);
	}
	public void solution2() {
		System.out.println("------토익 문제 채점------");
		Random rand = new Random();
		int []answer;
		int []myAns;
		answer = new int[990];
		myAns = new int[990];
		int score = 0;
		System.out.println("번호\t답안\t내답");
		System.out.println("---------------------");
		for(int i=0; i<answer.length; i++) {
			answer[i]=rand.nextInt(4)+1;
			myAns[i]=rand.nextInt(4)+1;
			if(answer[i]==myAns[i]) score++;
			System.out.printf("%d:\t%d\t%d\n",i+1, answer[i], myAns[i]);
		}
		System.out.println("Score: "+score);
		
	}
	
	public static void main(String[] args) {
		ArrayTest6.solution1();
		System.out.println();
		ArrayTest6 at = new ArrayTest6();
		at.solution2();
//		new ArrayTest6().solution2(); //이렇게도 가능함!!

	}

}
