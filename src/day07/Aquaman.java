package day07;

public class Aquaman {
	String name;//이름
	int height;//키
	double speed;
	//생성자를 2개 이상 오버로딩
	// 사용자가 생성자를 1개라도 구성하면
	// 컴파일러가 제공하던 기본 생성자는 사라진다
	
//	public Aquaman() {
//		name ="아쿠아맨";
//		height =198;
//		speed = 100;
//	}
	
	public Aquaman(String name) {
		this.name=name;
		height=190;
		speed = 100;
	}
	public Aquaman(String name, int height, double speed) {
		this(name);
		this.height=height;
		this.speed = speed;
	}
	
	public void showInfo() {
		System.out.println("이름: "+name);
		System.out.println("키: "+height);
		System.out.println("속력: "+speed);
	}
}/////////////////////////////
