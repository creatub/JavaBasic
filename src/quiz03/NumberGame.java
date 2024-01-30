package quiz03;

import java.util.*;
public class NumberGame {
	public static void startGame() {
		Random rand=new Random();
		Scanner sc =new Scanner(System.in);
		int rand_num=rand.nextInt(100)+1;
		System.out.println("::컴퓨터가 낸 숫자를 맞춰보세요(1~100)::");
		int myNum=0;
		int count=0;
		while(rand_num!=myNum&&count<7) {
			myNum=sc.nextInt();
			if(myNum<rand_num) {
				System.out.println("더 큰 수를 입력하세요");
			}else if(myNum>rand_num) {
				System.out.println("더 작은 수를 입력하세요");
			}
			count++;
		}
		if(count==7) {
			System.out.println("7번 안에 맞추지 못했습니다!");
		}else {
			System.out.printf("%d번만에 맞췄습니다!\n");
		}
		System.out.println("컴퓨터 숫자: "+rand_num);
		
	}
	public static void main(String[] args) {
		NumberGame.startGame();
	}

}
