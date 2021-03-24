package kr.ac.kopo.day13.api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateMain01 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance(); // 실제 타입은 그레고리
		System.out.println("c: " + c);

		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int day = c.get(Calendar.DAY_OF_WEEK);

		String[] dayArr = { "", "일", "월", "화", "수", "목", "금", "토" };
		System.out.println(year);
		System.out.println(month);
		System.out.println(dayArr[day]);

		// 2021 5월5일 무슨 요일?
		c.set(2021, 5 - 1, 5); // 5-1해야 5월이 구해져.
		day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(dayArr[day]);

		// 5월의 마지막 날이 며칠?
		int lastday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(lastday);

		String pattern = "yyyy-MM-dd HH:mm:ss E";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(new Date()));// 여기에 c를 넣고 싶어. 그러려면 c를 Date로 변경

		Date d = c.getTime();
		System.out.println(sdf.format(d));
	}

}
