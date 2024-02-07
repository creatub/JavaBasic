package day11;
/*참조형
 * - 클래스형
 * - 배열
 * - 인터페이스형
 */
import java.util.*;

interface MyInter{
	//추상메서드 + final 변수 만 멤버로 갖는다
	void foo(); // public abstract가 자동으로 붙는다.
	void bar(String str);
}//////////////
interface YourInter{
	String GREETING ="Hi";//public static final이 자동으로 붙는다
	int baz();
}///////////////
//class를 상속받을 때는 단일 상속이지만 interface를 상속받을 때는 다중 상속이 가능
//implements로 상속받는다
class MyClass implements MyInter, YourInter{
	
	@Override
	public void foo() {
		System.out.println("foo()");
	}
	
	@Override
	public void bar(String str) {
		System.out.println("bar(): "+str);
	}
	@Override
	public int baz() {
		System.out.println("baz()");
		return 100;
	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		//MyInter mi = new MyInter(); // [x]
		//인터페이스도 타입 선언은 가능하나 new 해서 객체 생성은 할 수 없다
		MyInter mi = new MyClass();
		//foo(), bar() 호출하기
		mi.foo();
		mi.bar("Hello");
		//baz() 호출해보기
		//mi.baz(); [x]
		//((YourInter)mi).baz(); 내가 한 것
		int n = ((MyClass)mi).baz();
		System.out.println(n);
		
		System.out.println("----------------");
		//YourInter yi = new YourInter();
		YourInter yi = new MyClass();
		//foo(), bar() 호출하기
		((MyClass)yi).foo();
		((MyClass)yi).bar("Hiiii");
		//baz() 호출해보기
		int n2 = yi.baz();
		System.out.println(n2);
		//GREETING값 출력해보기
		System.out.println(MyClass.GREETING);
		System.out.println(YourInter.GREETING);
		System.out.println(yi.GREETING);//static 방식으로 접근해야함
		//틀린 건 아닌데 warning 뜸 객체명X 클래스명으로 접근
		//MyClass.GREETING="Allo"; // final인 변수는 할당 x
	}////main
}//class
