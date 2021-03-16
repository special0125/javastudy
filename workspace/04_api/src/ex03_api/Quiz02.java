package ex03_api;

import java.util.Calendar;

/*
 * 2. Calendar를 활용해서 기념일 계산하기
 * 1) 두 개의 날짜를 만들고, 그 중 하나는 기념일로 수정
 * 2) 날짜의 차이를 구하고, 그 결과를 일 수로 출력하기
 */
public class Quiz02 {
	public static void main(String[] args) {
		
		Calendar anniversary = Calendar.getInstance();
		anniversary.set(2000, 0, 1);	// 2000-01-01
		
		Calendar today = Calendar.getInstance();
		
		// 타임스탬프의 차이를 구합니다.
		long elapseTime = today.getTimeInMillis() - anniversary.getTimeInMillis();
		
		// 밀리초 -> 일(1000밀리초 * 60 * 60 * 24 = 1일)
		long elapseDay = elapseTime / (1000 * 60 * 60 * 24);
		
		System.out.println("경과한 일수는 " + elapseDay + "일입니다.");
		
		
		
		
		
		
				
		
		
	}
}
