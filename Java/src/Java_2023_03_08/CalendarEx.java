package Java_2023_03_08;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javafx.scene.chart.PieChart.Data;

/*
Calendar class 는 1970년 1월 1일부터 특정 값으로 진보해 오면서
날짜와 시각에 대한 조작을 수행할 수 있도록 제공되는 abstract class이다.
Object 생성 법은 다음과 같다.
	1)Calendar ㅊ미 = Calendar.getInstance();
	2)GregorianCalendar cal = new GregorianCalendar();
	*/
public class CalendarEx {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = (cal.get(Calendar.MONTH) + 1);
		int date = cal.get(Calendar.DATE);
		System.out.println("년 : " + year );
		System.out.println("월 : " + month );
		System.out.println("일 : " + date );
		
		int 시 = cal.get(Calendar.HOUR);
		int 분 = cal.get(Calendar.MINUTE);
		int 초 = cal.get(Calendar.SECOND);
		System.out.println(year + "년" + month + "월" + date + "일");
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		System.out.println(sdf.format(now));
		int day1 = cal.get(Calendar.DAY_OF_YEAR);
		int day2 = cal.get(Calendar.DAY_OF_MONTH);
		int day3 = cal.get(Calendar.DAY_OF_WEEK);
		int week = cal.get(Calendar.WEEK_OF_YEAR);
		
		String[] a ={"일","월","화","수","목","금","토"};
		
		System.out.println("오늘은 올해의 : " + day1 + "날 입니다.");
		System.out.println("오늘은 이번달 : " + day2 + "일 입니다.");
		System.out.println("오늘은 이번주 : " + a[day3 -1] + "요일 입니다.");
		System.out.println("오늘은 올해의 : " + week + "주 입니다.\n");
	}
	
}
