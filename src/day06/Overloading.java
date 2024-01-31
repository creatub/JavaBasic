package day06;

public class Overloading {
	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		
//		vm.makeTea(1,(short)2);
//		System.out.println("vm.coffee: "+vm.coffee);
//		System.out.println("vm.sugar: "+vm.sugar);
//		System.out.println("vm.cream: "+vm.cream);
		//1. 설탕 커피 만들기
		vm.makeTea(1,2);
		//2. 블랙 커피 만들기
		vm.makeTea(1);
		//3. 크림 커피 만들기
		vm.makeTea(1,(short)3);
		vm.makeTea((short)3,1);
		//4. 밀크 커피 만들기
		vm.makeTea(1,1,1);
		
		Yuja yj = new Yuja();
		yj.setSugar(2);
		yj.setYuja(1);
		vm.makeTea(yj);
	}
}
