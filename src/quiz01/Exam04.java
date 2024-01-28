package quiz01;

public class Exam04 {
	public static void main(String[] args) {
		String name = "홍길동";
		int age = 200;
		String city = "홍천";
		float weight = 88.8f;
		boolean isProgrammer = true;
		char favoriteColor = 'y';
		
		System.out.printf("친구의 이름은 %s이고 나이는 %d세이다.\n", name, age);
		System.out.printf("%s에 살고 있고 몸무게는 %.1f킬로이다.\n", city, weight);
		System.out.printf("좋아하는 색은 %c가 들어가는 색이고, 프로그래머 여부는 %b이다.\n", favoriteColor, isProgrammer);
		
	}

}
