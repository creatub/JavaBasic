package day05;
/*
 * OOP 언어의 4대 주요 특징
 * [1] 추상화(Abstraction) : 프로그램과 관련된 객체들을 class로 구성하는 것.
 * 			관련된 속성 + 행동양식 ==> 멤버변수 + 메서드
 * [2] 캡슐화,은닉화(Encapsulation)
 * [3] 상속성 (Inheritance)
 * [4] 다형성 (Polymorphism)
 */
public class House {
	//1. 속성 ==> 멤버변수 (has a 관계가 성립되어야 함)
	// 지역변수는 초기화 없이 선언만 하고는 사용 못하지만 멤버변수는 선언만 해도 사용 가능
		int room; // House has a room;
		String owner;//소유주
		String addr; // non-static 변수 ==> 인스턴스 변수 ==> 객체명.변수 식으로 접근해야 한다.
	//등록된 집의 수
	static int count;//클래스 변수(static 변수) ==> 클래스명.변수 식으로 접근한다.
	//2. 행도양식(기능)
	public void printInfo() {
		System.out.println("---House 정보---");
		System.out.println("소유주: "+owner);
		System.out.println("방 수: "+room);
		System.out.println("주 소: "+addr);
	}
	// 거래유형: 매매, 전세, 월세, 가격
	public String rent(String type, int price) {
		String str="";
		str="---"+owner+"의 집---\n";
		str+="거래 유형: "+type+"\n";
		if(price>=10000) str+="가   격: "+(float)price/10000+"억원\n";
		else str+="가   격: "+price+"만원\n";
		return str;
	}
}
