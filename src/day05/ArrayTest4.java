package day05;

public class ArrayTest4 {
	public static void main(String[] args) {
		System.out.println("1. 2차원 배열-------------");
		/*
		 * 1) 선언
		 * 2) 메모리 할당
		 * 3) 초기화
		 */
		//1) 선언
		int[][]a; // 2차원 배열 선언
		int[]b[];
		int c[][];
		
		//2) 메모리 할당
		a=new int[3][2];
		
		//3) 초기화
		a[0][0]=10;
		a[0][1]=20;
		
		a[1][0]=30;
		a[1][1]=40;

		a[2][0]=50;
		a[2][1]=60;
		
		System.out.println(a[1][1]);
		//for 루프 이용해 출력해보기 -> 중첩 for루프 이용
		System.out.println(a.length+" "+a[0].length);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		
		//1)+2)+3)
		byte[] data[] = {{-5,-9},{10},{0,120,-128}};
		// 3행 열은 가변적
		int sum = 0;
		int cnt = 0;
		for(int i =0; i<data.length;i++) {
			for(int j=0; j<data[i].length;j++) {
				System.out.print(data[i][j]+" ");
				sum += data[i][j];
				cnt++;
			}
			System.out.println();
		}
		System.out.println("sum: "+sum);
		System.out.println("avg: "+(float)sum/cnt);
		System.out.println("***********");
		//for each문 이용해서 data 저장된 값 출력
		for(byte[] val:data) {
			for(byte v: val) {
				System.out.print(v+" ");
			}
			System.out.println();
		}
		System.out.println("************");
		/*
		 * String 타입의 2차원 배열을 선언하고 메모리 할당하세요
		 * 2행 4열
		 * 값은 알아서 저장하세요
		 * 
		 *  반복문 이용해서 저장한 값을 출력하되 모두 소문자로 출력하세요
		 */
		String[] str[]= {{"Apple","Banana","Coffee","Dragon"},{"ElonMusk","Friday","Grill","Health"}};
		for(String[] row: str) {
			for(String val: row) {
				System.out.print(val.toLowerCase()+" ");
			}
			System.out.println();
		}
		
		//행의 크기만 먼저 잡아놓고. 나중에 열의 크기를 할당하는 방법
		String []arr[]=new String[3][];//3행
		
		arr[0]=new String[2];//2열
		arr[1]=new String[3];//3열
		arr[2]=new String[1];//1열
		
		arr[0][0]="HTML";
		arr[0][1]="CSS";
		
		arr[1][0]="JavaScript";
		arr[1][1]="Java";
		arr[1][2]="SQL";
		
		arr[2][0]="Jsp";
		
		System.out.println("***********");
		
	}
}
