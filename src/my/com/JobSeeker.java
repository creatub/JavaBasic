package my.com;

import java.util.*;

public class JobSeeker {
	//1. 속성 => has a 관계
	private String name;
	private int birth;//생년
	private String phone;//연락처
	private char gender;//성별(F, M)
	
	public void setName(String nm) {
		name = nm;
	}
	public void setBirth(int br) {
		birth = br;
	}
	public void setPhone(String ph) {
		phone = ph;
	}
	public void setGender(char gn) {
		gender = gn;
	}
	
	public String getName() {
		return name;
	}
	public int getBirth() {
		return birth;
	}
	public String getPhone() {
		return phone;
	}
	public char getGender() {
		return gender;
	}
	
	/**
	 * 구직자 정보를 문자열로 반환하는 메서드
	 * @return
	 */
	public String profile() {
		String str="---"+name+"님 프로필---\n";
		str+= "이  름: "+name+"\n";
		str+= "생  년: "+birth+"\n";
		str+= "연락처: "+phone+"\n";
		str+= "성  별: "+gender+"\n";
		
		return str;
	}
	
	/**문서화 주석 => javadoc를 이용해서 API 문서를 만들 수 있다.
	 * 구직자 정보를 입력받는 메서드
	 */
	public void input() {
		System.out.println(":::구직자 정보 등록:::");
		Scanner sc= new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String nm=sc.next();
		setName(nm);//name=nm;
		System.out.print("생년을 입력하세요: ");
		int year=sc.nextInt();
		setBirth(year);
		
		System.out.print("연락처를 입력하세요: ");
		String tel = sc.next();
		setPhone(tel);
		
		System.out.print("성별을 입력하세요[여자:F, 남자:M]: ");
		char gender = sc.next().charAt(0);
		setGender(gender);
		System.out.println();
		
	}

}/////////////////////////////////
