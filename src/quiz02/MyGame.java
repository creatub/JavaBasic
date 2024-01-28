package quiz02;

import java.util.*;

public class MyGame {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		String[] RSP = {"가위", "바위", "보"}; // RSP: rock scissors paper
		for(;;) {
			int randRSP = rand.nextInt(3);
			System.out.println("가위(0) 바위(1) 보(2) 중 하나를 입력해주세요. :");
			try {
				int myRSP = sc.nextInt();
				System.out.println("컴퓨터: "+RSP[randRSP]+" 나: "+RSP[myRSP]);
				String res = "";
				if(randRSP == myRSP) res="무승부";
				else if(randRSP==0) {
					if(myRSP==1) res="승리";
					else if(myRSP==2) res="패배";
				}else if(randRSP==1) {
					if(myRSP==0) res="패배";
					else if(myRSP==2) res="승리";
				}else if(randRSP==2) {
					if(myRSP==0) res="승리";
					else if(myRSP==1) res="패배";
				}
				System.out.println("결과: "+ res);
				System.out.println("종료하시려면 X를 입력하시고 계속하시려면 아무 키나 입력하세요. [X]: ");
				String exit = sc.next();
				if(exit.equals("X")) break;
				
			}
			catch(Exception e) {
				continue;
			}
			
			
		}
	}
}
