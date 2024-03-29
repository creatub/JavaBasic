package day10;

//Jobseeker, Student, Teacher, Superman... 도메인(domain) 객체 => VO객체(Value Object), DTO객체(Data Transfer Object)
public class Person {
	private String name;
	private int age;

	public Person() {
		this("김철수", 20);
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// setter getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// hashCod(), equals() 메서드를 Override하자
	// 이름, 나이가 같으면 동일한 인물로 간주하여 해시셋에 중복저장하지 않도록
	@Override
	public int hashCode() {
		return name.hashCode() + age;
		//name의 hashCode는 name이 같으면 같은 Code를 출력함 age까지 더해서 반환
	}

	// instanceof 연산자: boolean값 반환
	// 참조변수 instanceof 클래스명
	// 참조변수가 클래스의 객체면 true반환, 그렇지 않으면 false반환

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) { // 형변환 하기 전에 Person의 객체냐고 먼저 물어봄
			Person p= (Person) obj;
			boolean bool=(this.name.equals(p.getName())&& this.age==p.getAge());
			return bool;
		}else {
			return false;
		}
	}

}
