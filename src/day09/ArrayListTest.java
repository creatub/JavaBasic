package day09;

import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		//Generic => jdk5.0 이후부터 제너릭을 이용
		ArrayList<String> arr = new ArrayList<>();
		//String 유형만 저장 가능
		arr.add("박스키");
		arr.add("송스키");
		arr.add("김스키");
		arr.add("정스키");
		
		//Generic을 쓰면 형변환이 필요없다.
		String first=arr.get(0);
		System.out.println("1등: "+first);
		
		//2등 삭제 => remove()
		String delName = arr.remove(1);
		System.out.println(delName+"님 탈락!!");
		System.out.println("-------------------");
		for(int i =0;i<arr.size();i++) {
			System.out.println(i+1+"등: "+arr.get(i));
		}
		System.out.println("-------------------");
		//Generic을 이용하면 for-each루프문 사용 가능
		for(String name: arr) {
			System.out.println(name);
		}
		//중간 삽입=>add(int index, Object value)
		//정스키 앞에 "홍스키" 삽입해보세요
		arr.add(2,"홍스키");
		System.out.println(arr);
		
		//boolean contains(값)
		//arr에 김스키가 명단에 있는지 출력
		boolean b = arr.contains("김스키");
		System.out.println("b: "+b);
		
		//arr에 저장된 요소 모두 삭제: clear()
		arr.clear();
		System.out.println(arr);
	}//main-------
}//class-------
