package ex02_2d_array;
/*
 * 1. 인구 조사 
 * apt에 사는 사람 수를 초기화 해 놓고,
 * 전체 사람의 수를 출력하기
 * 1층에 3명이 삽니다.
 * 2층에 7명이 삽니다.
 * 3층에 6명이 삽니다.
 * 4층에 5명이 삽니다.
 * 5층에 7명이 삽니다.
 * apt에 28명이 삽니다.
 */
public class Quiz01 {
	public static void main(String[] args) {
		
		// 5층 2호
		int[][] apt = {
				{ 1, 2 },
				{ 5, 2 },
				{ 3, 3 },
				{ 1, 4 },
				{ 5, 2 }
		};
		int total = 0;
		int floor = 0;
		for(int i = 0; i < apt.length; i++) {
			for(int j = 0; j <apt[i].length; j++) {
				floor += apt[i][j];
				total += apt[i][j];
			}
			System.out.println((i+1) + "층에 " + floor + "명이 삽니다.");
			floor = 0;
		}
		System.out.println("apt에 " + total + "명이 삽니다.");
		
		
		
		
		
	}
}
