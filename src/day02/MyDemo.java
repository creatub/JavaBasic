package day02;

import javax.swing.JOptionPane; // Dialogue 상자를 띄우는 class

public class MyDemo {

	public static void main(String[] args) {
		//값을 입력하지 않고 취소를 누르면 null값이 나옴
		//값을 입력하지 않고 OK를 누르면 빈 문자열이 나옴
		String age = JOptionPane.showInputDialog("당신의 나이는?");
		System.out.println("age: "+age);
		
		// 유효성 체크 - (취소를 누른 경우, 빈 문자열을 입력한 경우)
		
		// 1년 뒤의 나이를 출력해보자
		if(age==null) {
			return;
			//아래 문장을 실행하지 않는다.
		}//else if(age.length()==0){ // age=="" // 주소값 비교
//			System.out.println("나이 값을 입력해야해요.");
//			return;
//		}
		//String 참조형 == (주소값 비교)
		// 문자열의 내용 비교 boolean equals(Object o) 메서드를 사용한다.
		if(age.equals("")) {
			System.out.println("나이 값을 입력해야해요.");
			return;
		}
		int nextAge = Integer.parseInt(age)+1;
		System.out.printf("당신의 내년 나이는 %d세 이겠군요", nextAge);
		
	}

}
