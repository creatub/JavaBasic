package day06;

public class Cafe {

	public static void main(String[] args) {
		// 커피머신 생성해서 coffee, sugar, cream값을 설정하고
		CoffeeMachine cm = new CoffeeMachine();
		// 생략형-default로 선언했을 경우
//		cm.coffee=1;
//		cm.sugar=2;
//		cm.cream=3.5f;
//		
//		//각각 출력
//		System.out.println("cm.coffee : "+cm.coffee+
//				"\ncm.sugar : "+cm.sugar+"\ncm.cream : "+cm.cream);
		//private
		cm.setCoffee(1);
		cm.setSugar((short)2);
		cm.setCream(3.5f);
		
		System.out.println("cm.coffee : "+cm.getCoffee());
		System.out.println("cm.suger : "+cm.getSugar());
		System.out.println("cm.cream : "+cm.getCream());
		
	}

}
