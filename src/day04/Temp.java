package day04;

public class Temp {

	public static void main(String[] args) {
		int i = 0;
		for(;;) {
			i++;
			System.out.println(i);
			if(i>5) {
				System.out.println("첫번째 for문 끝");
				break;}//-> i>5 조건이 충족되면 이 for문 중지 다음 코드 이어서 실행
			}
		for(;;) {
			i++;
			System.out.println(i);
			if(i<10) {continue;} // -> i<10이면 아래에 있는 break 코드를 실행하지 않고 다시 for문 처음으로 돌아감
			System.out.println("두번째 for문 끝");
			break;
		}
		for(;;) {
			i++;
			System.out.println(i);
			if(i>20) {
				System.exit(0);// -> 프로그램 자체 실행이 종료
			}
		}
//		System.out.println("이 코드에는 닿지 않음");

	}

}
