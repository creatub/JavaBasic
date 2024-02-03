package day07.inheritance;
//자식클래스(Sub class)
//Superman is a Human "is a" 관계 ==> 상속성
public class Superman extends Human{
	int power;
	
	public Superman() {
		this("아무개",177,150);
	}
	
	public Superman(String name, int height, int power) {
		this.name=name;
		this.height=height;
		this.power=power;
	}
	// 부모로부터 상속받은 메서드를 재정의해보자
	// ==> Overriding (재정의)
	/*오버라이딩 조건
	 *  1. 부모와 메서드 이름을 동일하게 구성
	 *  2. 매개변수도 동일하게
	 *  3. 반환타입도 동일하게
	 *  4. 접근 지정자는 부모와 동일하거나 더 넓은 범위를 지정
	 */
	@Override
	public void showInfo() { // 접근지정자 public protected private 중 부모와 같거나 더 넓은 범위 지정
		super.showInfo();
		System.out.println("초능력: "+power);
	}
	
	//Overload
	public void showInfo(String title) {
		System.out.println(title);
		this.showInfo();
	}

	//Overload
	public String showInfo(String title, int up) {
		this.showInfo();
		power+=up;
		return ">>초능력을 충전했어요: 현재 초능력은 "+power+"입니다<<";
	}

}
