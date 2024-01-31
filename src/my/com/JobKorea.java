package my.com;

import java.util.*;

/*Application의 종류
 * - CLI (Command Line Interface)
 * - GUI (Graphic User Interface)
 * 기본적 기능
 * 	CRUD 기능
 * 	- C: Create => Insert 기능
 * 	- R: Read => 조회 (Select), 검색 기능
 *  - U: Update => 수정 (Update)
 *  - D: Delete => 삭제 (Delete)
 */
public class JobKorea {
	static int count=0; // 등록된 구직자수
	static JobSeeker[] persons = new JobSeeker[3];
	Scanner sc=new Scanner(System.in);
	
	static public void menu() {
		System.out.println("******JobKorea v1.1******");
		System.out.println("1. 구직자 등록");//C
		System.out.println("2. 회사 등록");
		System.out.println("3. 구직자 정보 출력");//R
		System.out.println("4. 회사 정보 출력");
		System.out.println("5. 구직자 정보 조회");//R
		System.out.println("6. 구직자 정보 수정");//U
		System.out.println("7. 구직자 정보 삭제");//D
		System.out.println("99. 종       료");
		System.out.println("*************************");
		System.out.println("메뉴 번호를 입력하세요=>");
		System.out.println("*************************");
	}
	/**
	 * 구직자 정보를 등록받는 메서드, 등록받아 배열에 저장한다.
	 */
	public void register() { // 1. 구직자 등록
		//구직자 객체 1개 생성해서
		//정보를 입력받는 메서드 호출한 뒤에
		//person배열에 저장한다.
		if(count>=persons.length) {
			System.out.println("정원 마감되었습니다. 총 "+persons.length+"명이 등록했습니다.");
			return;
		}
		JobSeeker seeker= new JobSeeker();
		seeker.input();
		System.out.println(seeker.profile());
		System.out.println(":::위 정보를 저장할까요? [1.yes 2.no]:::");
		int yn = sc.nextInt();
		if(yn==1) {
		JobKorea.persons[count++] = seeker;
		System.out.println(count+"명 구직자 정보 등록 완료!!");
		}else return;
	}
	/**
	 * 모든 구직자의 정보를 출력한다.
	 */
	public void printAll() { //3. 구직자 정보 출력
		for(int i = 0; i<count;i++) {
			System.out.println(persons[i].profile());
		}
	}
	/**
	 * 매개변수로 이름을 넣으면 해당 구직자의 정보를 String 타입으로 반환한다.
	 * @param name
	 * @return str
	 */
	public String search(String name) { //5. 구직자 정보 조회
		String str = "";
		for(int i=0;i<count;i++) {
			if(persons[i].getName().equals(name)) {
				str+= persons[i].profile();
			}
		}// for-----
		if(str.equals("")) {
			return name+"님 정보는 없습니다.";
		}
		return str;
	}// search-------------
	
	/**
	 * 매개변수로 이름을 넣으면 해당 구직자의 정보를 수정할 수 있다.
	 * @param name
	 */
	public void update(String name) { // 6. 구직자 정보 수정
		int identicalName = 0;
		int editedNum = 0;
		for(int i=0;i<count;i++) {
			if(persons[i].getName().equals(name)) {
				identicalName++; // 동명이인이 있을 시 숫자 증가
				System.out.println(persons[i].profile());
				System.out.println("이 정보를 바꾸시겠습니까? [1.yes 2.no]");
				int yn = sc.nextInt();
				if(yn==1) {
					persons[i].input();
					System.out.println("위 정보가 수정되었습니다!!\n");
					editedNum++; // 수정했을 시 숫자 증가
				}else continue;
			}//if-----
		}//for----
		if(identicalName==0) {
			System.out.println("일치하는 이름이 없습니다.");
		}else{
			System.out.println(name+"의 이름을 가진 "
			+identicalName+"명의 정보 중 "+editedNum+"명의 정보가 수정되었습니다.");
		}// if-else 이름이 있으면 몇 명 있는지, 그 중 몇 개가 수정되었는지 출력
	}// update------------------
	
	/**
	 * 이름을 매개변수로 받아 해당되는 이름을 삭제할 지 묻고 삭제한다.
	 * @param name
	 */
	public void delete(String name) {// 7.구직자 정보 삭제
		int identicalName = 0;
		int deletedName = 0;
		for(int i=0;i<count;i++) {
			if(persons[i].getName().equals(name)) {
				identicalName++; // 동명이인이 있을 시 숫자 증가
				System.out.println(persons[i].profile());
				System.out.println("정말 이 정보를 지우시겠습니까? [1.yes 2.no]");
				int yn = sc.nextInt();
				if(yn==1) {
					JobSeeker tmp[] = new JobSeeker[persons.length];
					int orgIdx = 0; // 원래 구직자 index를 count함
					for(int j=0; j<count-1;j++) { // 기존 idx보다 1개 적은 배열만 삽입
						if(j==i) {
							orgIdx++;//삭제할 idx가 나오면 다음 idx로 넘어감
						}
						if(orgIdx<=persons.length) {
							tmp[j] = persons[orgIdx++];
						}// 삭제할 idx pass
					}
					persons = tmp;// persons 배열을 tmp로 덮어씌움, 삭제 완료
					System.out.println("위 정보가 삭제되었습니다!!\n");
					deletedName++; // 삭제했을 시 숫자 증가
					count--;
					break; // 1개 삭제 시 바로 종료
				}else continue;
			}//if-----
		}//for----
		if(identicalName==0) {
			System.out.println("일치하는 이름이 없습니다.");
		}else{
			System.out.println(name+"의 이름을 가진 "
			+deletedName+"명의 정보가 삭제되었습니다. 현재 등록인원은 "+count+"명입니다.");
		}// if-else 이름이 있으면 몇 명 있는지, 그 중 몇 개가 수정되었는지 출력
	}// delete------------------
	/**
	 * menu를 출력하고 입력한 번호에 따라 동작을 수행한다.
	 */
	public void process() {
		while(true) {
			//menu()호출
			JobKorea.menu();
			int no=sc.nextInt();
			//System.out.println("no: " +no);
			//종료 처리
			if(no==99) break;
			//유효성 체크
			if(no>7||no<1) continue;
			//메뉴 입력시
			switch(no) {
				case 1://구직자 정보 등록받아서 배열에 저장
					register();
					break;
				case 2://회사 등록
					break;
				case 3://등록된 모든 구직자 정보 출력
					printAll();
					break;
				case 4://등록된 모든 회사 정보 출력
					break;
				case 5://구직자 정보 조회
					System.out.println("검색할 구직자 이름 입력=>");
					String findName=sc.next();
					String result=search(findName);
					System.out.println(result);
					break;
				case 6://구직자 정보 수정
					System.out.println("수정할 구직자 이름 입력=>");
					String editName=sc.next();
					update(editName);
					break;
				case 7://구직자 정보 삭제
					System.out.println("삭제할 구직자 이름 입력=>");
					String deleteName=sc.next();
					delete(deleteName);
					break;
				default:
			}
		}//while
	}//process()-----------
	public static void main(String[] args) {
		JobKorea jk = new JobKorea();
		jk.process();
		
	}// main---------------

}
