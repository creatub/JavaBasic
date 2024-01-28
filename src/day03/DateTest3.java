package day03;

import java.util.*;

public class DateTest3 {
	public static void main(String[] args) {
		System.out.println("---------Date--------");
		Date dt = new Date();
		
		String[] dayStr = {"일","월","화","수","목","금","토"}; // 자바는 이게 배열...
		
		int hr = dt.getHours();
		int min = dt.getMinutes();
		int sec = dt.getSeconds();
		System.out.println(hr+"시 "+min+"분 "+sec+"초");
		
		int year = dt.getYear()+1900;
		int month = dt.getMonth()+1;
		int date = dt.getDate();
		int day = dt.getDay();
		System.out.println(year+"년 "+month+"월 "+date+"일 " + dayStr[day] +"요일");
		
		
		
		System.out.println("\n------Calendar------");
		Calendar time = Calendar.getInstance();
		int hr_cal = time.get(Calendar.HOUR);
		int min_cal = time.get(Calendar.MINUTE);
		int sec_cal = time.get(Calendar.SECOND);
		System.out.println(hr_cal+"시 "+min_cal+"분 "+sec_cal+"초");
		int year_cal = time.get(Calendar.YEAR);
		int month_cal = time.get(Calendar.MONTH)+1;
		int date_cal = time.get(Calendar.DATE);
		System.out.println(year_cal+"년 "+month_cal+"월 "+date_cal+"일 "+ dayStr[day] +"요일");
		
		
		// [1] month
		// 28: 2월
		// 31: 1, 3, 5, 7, 8, 10, 12
		// 30: 4, 5, 9, 11
		// switch ~case문 이용해서 "9월은 30일까지 있습니다"
		
		Scanner sc= new Scanner(System.in);
		System.out.println("몇 월인지 입력해주세요: ");
		int new_month = sc.nextInt();

		int new_date;
		
		switch(new_month) {
		case 2:
			new_date=28; break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			new_date=31; break;
		case 4:
		case 6:
		case 9:
		case 11:
			new_date=30; break;
		default:
			return;
		}// switch
		System.out.println(new_month+"월은 "+new_date+"일 까지 있습니다.");
		
		
	}
}
