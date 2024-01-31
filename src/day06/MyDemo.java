package day06;

import java.util.*;
//하나의 파일에 여러 클래스를 구성할 수 있다.
//이 때 public 속성은 한 클래스만 가져야 함
class Car{
	//variable, field, property
	//멤버변수 (1. 클래스(static) 변수, 2.인스턴스(non-static) 변수)
	String color; //인스턴스 변수
	static int capa; // 클래스 변수
	
	//멤버 메서드 (1. 클래스 메서드(static), 2.인스턴스 메서드(non-static)
	public void run(int km) { // 매개변수 ==> 지역변수 (local variable, automatic variable)
		System.out.println(color+"색 자동차가 시속 "+km+"km로 달려요");
	}
	public static String info() {
		String str="---자동차 정보---\n";
		str+="용량: "+capa+"cc\n";
//		str+="색상: "+color+"색\n"; //[x]
		return str;
	}
}//// 각자 파일을 만드는 게 좋지만 몇 줄 안되는 클래스는 안에 만들기도 한다.
class Tv{
	
}// .class 파일은 각각 만들어짐

public class MyDemo {// MyDemo.java
	
	String str="나는 인스턴스 변수";
	static String str2="나는 클래스 변수";

	public static void main(String[] args) {
		System.out.println(MyDemo.str2); //FM
		System.out.println(str2);//선발대
//		System.out.println(str);//후발대
		MyDemo md = new MyDemo();//후발대
		System.out.println("md.str: "+md.str);
		
		// Car 클래스의 color 변수값을 출력
		Car c = new Car();
		System.out.println("car color: "+c.color);
		// Car 클래스의 capa 값 출력
		System.out.println("car capa: "+Car.capa);
		
		c.color="red";
		Car.capa=2000;
		
		System.out.println("car color: "+c.color);
		System.out.println("car capa: "+Car.capa);
		//run()호출하기
		c.run(100);
		
		//info()호출하기
		System.out.println(Car.info());
		
		Car c2=new Car();
		c2.color="black";
		Car.capa=3000;
		c2.run(130);
		System.out.println(Car.info());
		
		System.out.println("car.capa: "+c.capa);
		System.out.println("car.capa: "+c2.capa);
		
	}

}
