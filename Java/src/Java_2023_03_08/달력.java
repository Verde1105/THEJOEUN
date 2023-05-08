package Java_2023_03_08;

import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class 달력 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = (cal.get(Calendar.MONTH) + 1);
		int date = cal.get(Calendar.DATE);
		
		cal.set(year, month-1,1);
		date = cal.get(Calendar.DAY_OF_WEEK);
		int lastday = cal.getActualMaximum(Calendar.DATE);
		System.out.println("\n\n\t\t" +year + "년" + month + "월\n\n");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for (int i = 1; i < lastday + date; i++) {
			if(i<date) {
				System.out.print("\t");
				continue;
			}
			System.out.print((i -date + 1) + "\t");
			if(i%7==0) System.out.println();
		}
	}
}
