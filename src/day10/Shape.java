package day10;
//도형 클래스
/*추상클래스란?
 * - 추상메서드를 1개 이상 가진 클래스
 * - 사용하는 이유는> 상속받게 할 목적으로 사용=> 자식클래스에서 추상메서드를 강제로 오버라이딩 시키기 위함
 * 추상메서드란?
 * - 메서드 몸체 없이 헤더만 선언한 것
 * void area();
 */
public abstract class Shape {//도형==>추상클래스

	private String info="나는 도형";
	
	public String getInfo() {//멤버메서드 ==> 구체적으로 구현했다 => concrete method
		return info;
	}
	abstract void area(int x, int y);//추상메서드는 abstract를 붙여야 함
	// abstract메서드를 가진 클래스 역시 abstract를 붙여야 한다.
}//////

class Rectangle extends Shape{
	@Override
	void area(int w, int h) {
		int res = w*h;
		System.out.println("직사각형 면적: "+res);
	}
}///////////

class Triangle extends Shape{
	@Override
	protected void area(int w, int h) {
		int res = w*h/2;
		System.out.println("직삼각형 면적: "+res);
	}
}//////////////

abstract class Circle extends Shape{
	final double pi = 3.14; //final 상수를 만들 때 붙이는 modifier JS의 const와 동일한 기능
	
}///////////
class SubCircle extends Circle{
	@Override
	public void area(int r, int r2) {
	}
	//Overload
	public void area(int r) {
		double res=pi*r*r;
		System.out.println("원의 면적: "+res);
	}
}
