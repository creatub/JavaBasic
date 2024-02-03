package day08;
//학사관리 프로그램
//학생(학번, 이름, 연락처, 학급), 교사(교번, 이름, 연락처, 과목), 직원(사번, 이름, 연락처, 부서)
//Person 상속받고 subject 추가
public class Teacher extends Person{
	String subject;
	
	public Teacher() {
		super(0,"선생","010");
	}
	public Teacher(int no, String name, String tel, String subject) {
		super(no,name,tel);
		this.subject=subject;
	}
	@Override
	public String toString() {
		String str = super.toString();
		str = str.replace("Person", "Teacher");
		str+="\n과목: "+subject;
		return str;
	}
}
