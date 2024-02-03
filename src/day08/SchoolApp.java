package day08;

public class SchoolApp {
	
	public static void main(String[] args) {
		Object obj=new Object();
		Object obj2 = new Object();
		Object obj3 = obj2;
		System.out.println(obj); // obj.toString()과 동일
		System.out.println(obj2); // 원래 .toString()은 hash code를 찍는 것
		
		System.out.println("obj1==obj2: "+(obj==obj2)); // 주소값 비교
		
		System.out.println(obj3); //
		
		System.out.println("obj3==obj2: "+(obj3==obj2)); // 주소값 비교

		System.out.println(obj.equals(obj2));
		System.out.println(obj2.equals(obj3));
		
		//String 클래스에서 내용비교로 오버라이딩(재정의) 되었음
		
		System.out.println("--------------");
		//Person 객체 1개 생성, 객체값 출력하기
		Person p1 = new Person(1,"홍길동", "010-1111-1111");
		System.out.println(p1);
		
		//Student 생성해서 객체값 출력
		Student st = new Student(100,"김학생","010-2222-3333", "백엔드반");
		System.out.println(st);
		//Teacher 생성해서 객체값 출력
		Teacher tc = new Teacher(500,"최선생","010-3333-4444","Java");
		System.out.println(tc);
		
		//부모타입 변수 = new 자식객체생성()
		Person ps1 = new Student(101, "이세양", "011-5654-4576", "프론트엔드반");
		System.out.println(ps1.toString());
		Person ps2 = new Teacher(501, "선생님", "010-4354-8597", "HTML");
		System.out.println(ps2);
		
		System.out.println("ps1.name: "+ps1.name);
		System.out.println("ps1.tel: "+ps1.tel);
		System.out.println("ps1.className: "+((Student)ps1).className);
	}

}
