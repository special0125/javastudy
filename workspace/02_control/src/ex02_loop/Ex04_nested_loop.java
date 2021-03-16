package ex02_loop;

public class Ex04_nested_loop {
	public static void main(String[] args) {
		
//		for(int out =1; out <= 10; out++) {
//			for(int in = 10; in <= 50; in += 10) {
//				System.out.println(out + ", " + in);
//			}
//		}
		
		/*
		 * 1주차 1일차 1교시입니다.
		 * 1주차 1일차 2교시입니다.
		 * ...
		 * 총 3주차
		 * 총 5일
		 * 총 8교시
		 * 
		 */
		
		for (int i = 1 ; i <= 3; i++) {
			for(int j = 1; j <= 5; j++) {
				for(int k = 1; k <= 8; k++) {
					System.out.println(i + "주차 " + j + "일차 " + k + "교시입니다.");
				}
				System.out.println("");
			}
		}
		
		
		
		
		
		
		
		
	}
}
