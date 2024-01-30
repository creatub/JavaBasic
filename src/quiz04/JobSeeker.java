package quiz04;

import java.util.*;

public class JobSeeker {
	//static 변수
	static int no; // 구직자 숫자
	// 멤버변수
	String name; // 구직자 이름
	String schoolName; // 졸업 학교
	boolean graduate; // 학교 졸업 여부
	int graduateYear; // 졸업 년도
	int age; // 구직자 나이
	float gpa; // 구직자 최종 학점
	boolean career; // 경력 여부
	boolean studiedAbroad; // 해외 경험 여부
	int number; // 고유 번호
	
	
	public void printInfo() {
		System.out.println("===========구직자 정보==========");
		System.out.println("No."+number);
		System.out.println("이름:\t"+name);
		System.out.println("학교:\t"+schoolName);
		System.out.println("졸업 여부:\t"+(graduate==true? "졸업":"예정"));
		System.out.println("졸업 년도:\t"+graduateYear+"년");
		System.out.println("나이:\t"+age);
		System.out.println("학점:\t"+gpa);
		System.out.println("경력 여부:\t"+(career==true? "있음":"없음"));
	}
	
	public String appliedCompany(String companyName) {
		String str="";
		str += "지원자 "+name+" 이(가) 지원한 회사는 "+companyName+"입니다.";
		return str;
	}
	
	public int additionalPoints() {
		int addPoint=0;
		String []topSchool = {"서울대학교", "포항공대", "카이스트"};//씁쓸하지만 현실인 가산점
		List<String> schoolList = new ArrayList<>(Arrays.asList(topSchool));
		if(schoolList.contains(schoolName)) addPoint += 10; // topSchool의 경우 가산점
		if(gpa>4.0) addPoint +=5; // gpa가 높으면 가산점
		if(career) addPoint +=5; // 경력직일 경우 가산점
		if(studiedAbroad) addPoint +=5; // 해외에서 공부했을 경우 가산점
		return addPoint;
	}
	
}
