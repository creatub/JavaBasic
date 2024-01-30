package day04;

import java.util.*;

public class MyGame {
	//method (객체 지향 프로그래밍 언어에서는 function보다는 method라고 부른다)
	public static void menu() {
		System.out.println("********MyGame v1.1********");
		System.out.println(" 1. 가위 2. 바위 3. 보 9. 종료");
		System.out.println("***************************");
		System.out.println("입력하세요 =>");
		System.out.println("***************************");
	} //---------------ㅡ
	public static void startGame() {
		Random ran = new Random(3);
		Scanner sc = new Scanner(System.in);
		int win=0;//내가 이긴 횟수
		int count=0;//게임 시도 횟수
		for(;;) {
			MyGame.menu();
			int me=sc.nextInt();
			int com = ran.nextInt(3)+1;
			if(me==9) {
				//break;
				System.out.println("게임을 종료합니다.");
				System.exit(0);// 시스템 종료 (0: 정상 종료, 0이 아닌 값: 비정상 종료)
			}
			//유효성 체크
			if(me<1||me>3) {
				System.out.println("메뉴에 없는 번호 입니다.");
				continue;
			}
			count++;
			String msg="";
			if(me==com) {
				msg = "비겼네요~";
			}else if((me==1&&com==3)||(me==2&&com==1)||(me==3&&com==2)) {
				msg = "이겼네요~";
				win++;
			}else {
				msg = "졌네요~";
			}
			String result1 = MyGame.show(me);
			String result2 = MyGame.show(com);
			System.out.println("당신: "+result1);
			System.out.println("컴퓨터: "+result2);
			System.out.println(msg);
			System.out.println("전체 시도 횟수: "+count+", 당신이 승리한 횟수: "+win);
		}//for-------
	}//-----------------------------------------
	static public String show(int num) {
		String str ="";
		switch(num) {
		case 1: str = "가위[X]";
		break;
		case 2: str = "바위[O]";
		break;
		case 3: str = "보[ㅁ]";
		break;
		}
		return str;
	}
	
	public static void main(String[] args) {
		MyGame.startGame();
	}
	
}

