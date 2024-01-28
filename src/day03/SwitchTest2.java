package day03;

import java.util.Scanner;
public class SwitchTest2 {
	static public void main(String[] args) {
		//A: 기획부 사원이며 사원의 고유번호는 100EX 입니다.
		//B: 총무부 사원이며 사원의 고유번호는 100EX 입니다.
		//C: 개발부 사원이며 사원의 고유번호는 100EX 입니다.
		// 나머지: 해당부서 없음
		Scanner sc=new Scanner(System.in);
		System.out.println("사번을 입력하세요 [ex. A100EX] : ");
		String str = sc.next();
		switch(str.charAt(0)) {
		case 'A': System.out.printf("기획부 ");break;
		case 'B': System.out.printf("총무부 ");break;
		case 'C': System.out.printf("개발부 ");break;
		default: System.out.println("해당 부서 없음");return;
		}
		System.out.println("사원이며 사원의 고유번호는 " + str.substring(1)+ " 입니다.");
		/*
		 * String 클래스의 메서드
		 * char charAt(int index): index 위치의 문자 1개를 추출해서 반환
		 * String substring(int start, int end)
		 * :index start 위치에서 시작해서 end-1까지 문자열을 추출해서 반환
		 */
		
		//Date보다는 Calendar를 사용하기를 권장
		
	}
}
