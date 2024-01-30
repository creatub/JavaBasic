package day05;

import java.util.Random;

public class ArrayTest2 {
	public static void prob1() {
		Random rand=new Random(50);
		int score[];
		score= new int[10000];
		for(int i=0; i<score.length;i++) {
			int randScore = rand.nextInt(451);
			score[i] = randScore;
		}
		// 1.만점자 몇 명인지?
		int perfectCount=0;
		int zeroCount=0;
		int sum = 0;
		System.out.print("만점자 (index) : ");
		for(int i=0;i<score.length;i++) {
			if(score[i]==450) {
				System.out.print(i+" ");
				perfectCount++;
			} // 1번 if
			if(score[i]==0) {
				zeroCount++;
			} // 2번 if
			sum+=score[i];
		}
		System.out.println("\n만점자 수: " + perfectCount +"명");
		// 2.0점 몇 명인지?
		System.out.println("0점자 수: " + zeroCount +"명");
		// 3. 평균은 어떻게 되었는지? 
		float avg=(float)sum/score.length;
		System.out.println("평균: "+avg);
		// 4. 평균보다 +- 50점인 학생들 카운드(포함)
		int avg50Count=0;
		for(int i:score) {
			if(i>=avg+50||i<=avg-50) {
				avg50Count++;
			}
		}
		System.out.println("평균보다 50점 이상 차이나는 사람의 수: "+avg50Count+"명");
	}
	public static void main(String[] args) {
		ArrayTest2.prob1();
	}
}
