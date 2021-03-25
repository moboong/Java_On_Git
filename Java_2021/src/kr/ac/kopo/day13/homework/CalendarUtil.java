package kr.ac.kopo.day13.homework;

import java.util.Calendar;

public class CalendarUtil {

	private Calendar c;

	// 메소드 오버로딩(매개1개)
	public void printCal(int year) {
		for (int month = 1; month <= 12; month++) {
			printMonth(year, month);
		}
	}

	// 메소드 오버로딩(매개2개)
	public void printCal(int year, int month) {
		printMonth(year, month);
	}

	// 실제 달력 출력 코드
	private void printMonth(int year, int month) {
		c = Calendar.getInstance();
		c.set(year, month - 1, 1);
		int day = c.get(Calendar.DAY_OF_WEEK) - 1;
		int lastday = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int n = 1;

		System.out.println("<< " + year + "년 " + month + "월" + " >>");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		while (n <= lastday) {
			for (int i = 0; i < day; i++) {
				System.out.print(" \t"); // 초기 빈칸 출력 코드
			}
			for (int i = day; i < 7; i++) {
				if (n <= lastday) {
					System.out.print(n + "\t");
					n++;
				} else {
					break;
				}
			}
			System.out.println();
			day = 0; // 1번 실행 후 바로 0으로 설정해서 다음부터 빈칸 출력 코드 사용불가.
		}
	}
}
