package day03;

import java.util.Scanner;
/*
 * [1]int형 이하(byte, short, char, int) [o] long형은 안됨[x]
 * 예전에는 String도 안 됐는데 JDK가 업데이트 되면서 String도 가능
 * [2]String
 * 
 * switch(변수 or 수식){
 *   case 값1: 실행문; break;
 *   case 값2: 실행문; break;
 *   case 값3: 실행문; break;
 *   default: 실행문;
 */


public class SwitchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수강하는 과목 입력=>");
		String sbj = sc.next();
		switch(sbj) {
		case "자바": System.out.println("1103호로 가세요"); break;
		case "파이썬": System.out.println("1102호로 가세요"); break;
		case "리눅스": System.out.println("1101호로 가세요"); break;
		default: System.out.println("카운터에 문의하세요"); // default가 앞으로 가면 break 꼭 써줘야 함
		}
		
	}
}
