package day06;

public class JobKoreaApp {

	public static void main(String[] args) {
		JobSeeker js1 = new JobSeeker();
		System.out.println(js1.profile());
		
//		js1.name="김철수";
//		js1.birth=1992;
//		js1.phone="010-2222-3333";
//		js1.gender='M';
		js1.setName("김철수");
		js1.setBirth(1992);
		js1.setPhone("010-2222-3333");
		js1.setGender('M');
		
		System.out.println(js1.profile());
		
		//[1] 구직자 객체 1개 더 생성하고 속성값 부여 프로필 출력
		JobSeeker js2 = new JobSeeker();
		js2.setName("김뉴비");
		js2.setBirth(2001);
		js2.setPhone("010-4444-5555");
		js2.setGender('F');
		
		System.out.println(js2.profile());
		//[2] 위에서 생성한 구직자 객체 2개를 배열에 저장한 뒤
		// 반복문 이용해서 구직자 정보를 모두 출력하세요
		JobSeeker jsArr[] = new JobSeeker[2];
		jsArr[0]=js1;
		jsArr[1]=js2;
		for(int i=0; i<jsArr.length; i++) {
			System.out.println(jsArr[i].profile());
		}
		
		// for-each 루프로 출력
		System.out.println("for-each");
		for(JobSeeker seeker: jsArr) {
//			System.out.println(seeker.profile());
			System.out.println(seeker.getName());
		}
		
		
	}

}
