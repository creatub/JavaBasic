package day07;

public class MyDemo {

			int a; // 인스턴스 변수
	static	int b; // 클래스 변수
	
	public MyDemo() { // default constructor => 역할: 인스턴스 변수를 초기화
		//System.out.println("MyDemo() 생성자 호출됨");
		// 매개변수 없음!
		a=100; // 초기화
	}
	public MyDemo(int num) { // argument constructor(인자생성자) //오버로딩
		a=num;
	}
	
	// 클래스 변수 초기화는 static initializer에서 한다
	static {
		b=200;
		System.out.println("static block");
	}
	
	public static void main(String[] args) {
		System.out.println("b: "+b);
		System.out.println("MyDemo.b: "+MyDemo.b);
		
		MyDemo md=new MyDemo(); // 생성자를 호출하여 객체를 생성 => Compiler가 기본적으로 제공
		// 컴파일러는 기본생성자(default constructor)를 제공한다
		// 하지만 개발자가 생성자를 구성하면 컴파일러가 제공하던 기본 생성자는 사라진다
		System.out.println("md.a: "+md.a);
		
		MyDemo md2=new MyDemo();
		System.out.println("md2.a: "+md2.a);
		
		MyDemo md3 = new MyDemo(500); // constructor가 setter 역할을 함
		// 생성자를 오버로딩하면 다양한 형태로 객체를 생성할 수 있다.
		System.out.println("md3.a: "+md3.a);
	}

}
