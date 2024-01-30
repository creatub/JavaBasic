package quiz04;

public class JobKoreaApp {

	public static void main(String[] args) {
		JobSeeker js1 = new JobSeeker();
		JobSeeker js2 = new JobSeeker();
		JobSeeker js3 = new JobSeeker();
		
		js1.name = "박진영"; // 구직자 이름
		js1.schoolName = "연세대학교"; // 졸업 학교
		js1.graduate = true; // 학교 졸업 여부
		js1.graduateYear = 1996; // 졸업 년도
		js1.age=50; // 구직자 나이
		js1.gpa=3.9f; // 구직자 최종 학점
		js1.career = true; // 경력 여부
		js1.studiedAbroad = true; // 해외 공부 경험
		JobSeeker.no++;
		js1.number = JobSeeker.no;
		
		js2.name = "빈지노"; // 구직자 이름
		js2.schoolName = "서울대학교"; // 졸업 학교
		js2.graduate = true; // 학교 졸업 여부
		js2.graduateYear = 2011; // 졸업 년도
		js2.age=36; // 구직자 나이
		js2.gpa=3.8f; // 구직자 최종 학점
		js2.career = true; // 경력 여부
		js2.studiedAbroad = true; // 해외 공부 경험
		JobSeeker.no++;
		js2.number = JobSeeker.no;
		
		js3.name = "김취준"; // 구직자 이름
		js3.schoolName = "카이스트"; // 졸업 학교
		js3.graduate = true; // 학교 졸업 여부
		js3.graduateYear = 2023; // 졸업 년도
		js3.age=26; // 구직자 나이
		js3.gpa=4.1f; // 구직자 최종 학점
		js3.career = false; // 경력 여부
		js3.studiedAbroad = false; // 해외 공부 경험
		JobSeeker.no++;
		js3.number = JobSeeker.no;
		
		js1.printInfo();
		js2.printInfo();
		js3.printInfo();
		
		System.out.println();
		System.out.println(js1.appliedCompany("JYP Entertainment"));
		System.out.println(js2.appliedCompany("Illinaire Records"));
		System.out.println(js3.appliedCompany("멀티캠퍼스"));
		
		System.out.println();
		System.out.println(js1.name+"의 가산점 : "+js1.additionalPoints());
		System.out.println(js2.name+"의 가산점 : "+js2.additionalPoints());
		System.out.println(js3.name+"의 가산점 : "+js3.additionalPoints());
		
		
	}

}
