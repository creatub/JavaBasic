package day04;

public class BreakContinue {

	public static void main(String[] args) {
		System.out.println("1.------------");
		for(int i=0;i<3;i++) {
			if(i==1) break;
			System.out.println("i= "+i);
		}//for---------
		System.out.println("2.------------");
		for(int i=0;i<3;i++) {
			if(i==1) continue;
			System.out.println("i= "+i);
		}//for---------
		System.out.println("3.------------");
		for(int i=0;i<3;i++) {
			for(int k=0;k<3;k++) {
				if(k==1) break;
				System.out.println("i= "+i+", k= "+k);
			}// 00 10 20
		}//for---------
		System.out.println("4.------------");
		for(int i=0;i<3;i++) {
			for(int k=0;k<3;k++) {
				if(k==1) continue;
				System.out.println("i= "+i+", k= "+k);
			} //00 02 10 12 20 21
		}//for---------
		/*
		 * 반복문 앞에 레이블을 붙일 수 있다.
		 * break 레이블명; 	:레이블과 가까운 반복문을 이탈
		 * continue 레이블명; 	:레이블과 가까운 반복문을 계속 수행
		 */
		System.out.println("5.------------");
		outer:
		for(int i=0;i<3;i++) {
			for(int k=0;k<3;k++) {
				if(k==1) break outer;
				System.out.println("i= "+i+", k= "+k);
			}// 00
		}//for---------
		System.out.println("6.------------");
		aaa:
		for(int i=0;i<3;i++) {
			bbb:
			for(int k=0;k<3;k++) {
				if(k==1) continue aaa;
				System.out.println("i= "+i+", k= "+k);
			} //00 10 20
		}//for---------
	}

}
