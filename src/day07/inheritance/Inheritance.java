package day07.inheritance;
/* 부모 클래스 : Super class, Base class
 * 자식 클래스 : Sub class, Derived class
 * 자바는 상속받을 때 extends를 이용하며, 단일 상속만 가능하다
 * 클래스를 구성하면 묵시적으로 extends Object 가 된다 
 * 모든 클래스의 최 상위에는 java.lang.Object 클래스가 있다.
 * */
public class Inheritance {

	public static void main(String[] args) {
		//1. Human 객체 생성해서, 이름, 키 값을 할당하고 showInfo()호출하세요
		
		Human man = new Human();
		man.name="싸이";
		man.height=177;
		man.showInfo();
		System.out.println("---------------------");
		// 2. Superman 객체 생성해서 이름, 키, 초능력 값을 할당하고
		// showInfo()호출하세요
		Superman sp1 = new Superman("수퍼맨", 180, 200);
		sp1.showInfo();
		
		Superman sp2 = new Superman();
		sp2.showInfo("Super Man!!");
		
		System.out.println(sp2.showInfo("Super Man!!", 100));
		
		System.out.println("---------------------");
		Aquaman aq1 = new Aquaman();
		aq1.showInfo();

		Aquaman aq2 = new Aquaman();
		aq2.showInfo();
		System.out.println("---------------------");
		
		//상속관계를 맺으면
		//부모타입의 변수 선언 = new 자식객체(); 가능함
		//이 때 이 참조변수로 접근할 수 있는 변수나 메서드는 제한이 있다.
		//[1] 부모가 물려준 변수,메서드는 접근 가능
		//[2] 그러나 오버라이드한 메서드가 있을 경우에는 자식의 오버라이드한 메서드를 적용한다
		//[3] 자식만이 갖는 고유한 변수나 메서드는 접근 할 수 없다.
		Human hs = new Superman("김초롱", 175, 850);//다형성(Polymorphism)
		//Human hs = new String(); [x]
		System.out.println("hs.name: "+ hs.name);
		System.out.println("hs.height: "+ hs.height);
//		System.out.println("hs.power: "+ hs.power); [x] //3번
		
		//부모 > 자식 : 캐스팅해서 강제 형변환함
		System.out.println("hs.power: "+((Superman)hs).power); //()보다 .가 우선순위가 높아서 한 번 더 감싸줘야 함
		
		
		hs.showInfo();
		//오버라이딩한 메서드를 우선 적용함
//		hs.showInfo("***수퍼맨 정보***");// 오버로드 한 메서드는 못 씀
		//자식이 고유하게 일군 재산은 건들 수가 없따!!!!!!!!~!!!!
		((Superman)hs).showInfo("***수퍼맨 정보***");
		System.out.println();
		//Human 타입의 변수 선언하고 Aquaman 객체를 생성해서
		//name, height, speed, showInfo()호출해보기
		Human ha = new Aquaman("아쿠아맨", 180, 100);
		System.out.println(ha.name);
		System.out.println(ha.height);
		System.out.println(((Aquaman)ha).speed);
		((Aquaman)ha).showInfo();
		
		System.out.println("\n--------------");
		// man, sp1, sp2, aq1, aq2, hs, ha 객체들을 저장할 배열을 생성하고 저장하세요
		// 그런 뒤 반복문을 이용해서 배열에 저장된 객체들의 showInfo()를 호출하세요
		Human men[] = {man, sp1, sp2, aq1, aq2, hs, ha};
		for(Human m:men) {
			m.showInfo();
			System.out.println("--------------");
		}
		
	}
}
