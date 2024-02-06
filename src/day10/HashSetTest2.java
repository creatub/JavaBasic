package day10;

import java.util.*;

/* Set계열의 특징
 * - 순서를 기억하지 않는다.
 * - 데이터 중복을 허용하지 않는다.
 * 구현클래스
 * - HashSet
 *: 해쉬셋은 객체를 저장하기 전에 객체의 hashCode()를 호출하여 해시코드를 얻어낸다.
 *     그리고 이미 저장되어 있는 객체들의 해시코드와 비교한다. 만약 동일한 해시코드가 
 *     있다면 그다음에는 equals()메소드로 두 객체를 비교해서 true가 나오면 동일한
 *     객체로 판단하고 중복 저장을 하지 않는다. 	
 * 
 * */
public class HashSetTest2 {

	public static void main(String[] args) {
		// [1] Person객체 3명 생성해서 HashSet에 저장하세요
		HashSet hs = new HashSet();
		Person p1 = new Person("청년", 20);
		Person p2 = new Person("중년", 50);
		Person p3 = new Person("노년", 80);
		hs.add(p1);
		hs.add(p2);
		hs.add(p3);
		// [2] HashSet에 저장된 Person객체의 이름과 나이를 한꺼번에 출력하세요
		Iterator<Person> it = hs.iterator();
		while (it.hasNext()) {
			Person p = it.next();
			System.out.println(p.getName());
			System.out.println(p.getAge());
		}
		System.out.println("***********");
		// 강사님 코드
		HashSet<Person> set = new HashSet<>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		Iterator<Person> it2 = set.iterator();
		while (it2.hasNext()) {
			Person p = it2.next();
			System.out.println(p.getName());
			System.out.println(p.getAge());
		}
		Person p4=new Person("청년", 20);
		set.add(p4);
		System.out.println(p1);
		System.out.println(p4);
		System.out.println(p1.equals(p4));
		
		System.out.println("set.size(): "+set.size());
		System.out.println("***********");
		for(Person p: set) {
			System.out.println(p.getName()+": "+p.getAge());
		}

	}// main------

}// class--------
