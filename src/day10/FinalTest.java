package day10;
/*
 * modifier
 * ---------------------------------------------
 * 			abstract			final
 * ---------------------------------------------
 * 클래스	| 상속받게할 목적			| 상속받지 못하게 함
 * 메서드	| 오버라이드할 목적		| 오버라이드 못하도록
 * 변수	|	X				| 값 할당 못하도록
 * 
 */

final class Parent{
	int a = 10;
}/////////
class Child // extends Parent[x]
{
	void foo() {
		System.out.println("foo()");
	}
	final void bar() {
		System.out.println("bar()");
	}
}////////////////
class SubChild extends Child{
	//[3] final + 변수:값 할당 못함
	//public final static ==> 상수
	public static final double PI = 3.14;
	
	//foo()
	@Override
	public void foo() {
		super.foo();
		System.out.println("SubChild foo()");
	}
	
	//bar()
//	@Override
//	public void bar() { // 안됨! final메서드는 오버라이드 못함
//		
//	}
}////subchild





public class FinalTest {

	public static void main(String[] args) {
		System.out.println(SubChild.PI);
		//SubChild.PI=30.14; // final은 바꿀 수 없음
		SubChild sc = new SubChild();
		sc.foo();
		sc.bar();
	}

}
