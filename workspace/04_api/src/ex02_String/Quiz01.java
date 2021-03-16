package ex02_String;

import java.util.Scanner;

/*
 * 1. 시간을 입력 받아서 출력하기
 * 시간 >>> 9
 * 분 >>> 5
 * 초 >>> 30
 * 9:05:30
 */
public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = 0;
		int min = 0;
		int second = 0;
		
		System.out.print("시간 >>> ");
		hour = sc.nextInt();
		System.out.print("분 >>> ");
		min = sc.nextInt();
		System.out.print("초 >>> ");
		second = sc.nextInt();
		
		String strHour = hour + "";	//String.valueOf(hour)
		String strMin = min + "";
		String strSecond = second + "";
		
		if(strMin.length() == 1) {	// if(min < 10)
			strMin = "0" + strMin;
		}
		if ( strSecond.length() == 1) {	if(second < 10)
			strSecond = "0" + strSecond;
		}
		String time = strHour + ":" + strMin + ":" + strSecond;
		System.out.println(time);
		
	}
}
