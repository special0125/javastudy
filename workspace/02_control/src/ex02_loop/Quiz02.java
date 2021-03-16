package ex02_loop;

import java.util.Scanner;

/*
 *  2. 영화 평점을 입력받아서 ★을 출력
 *  평점은 1~5사이의 정수이고, 잘못된 평점은 다시 입력 받습니다.
 */
public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int review = 0;	// 평점
		
//		do {
//			System.out.print("펑점 입력 : ");
//			review = sc.nextInt();
//		} while (!(review >=1 && review <= 5)); {
//			for (int i = 0; i < review; i++) {
//				System.out.print("★");
//			}	
//		}
		
//		while(!(review >=1 && review <= 5)) {
//			System.out.print("평점 입력 : ");
//			review = sc.nextInt();
//			if(review >= 1 && review <= 5) {
//				for (int i = 0; i < review; i++) {
//					System.out.print("★");
//				}
//			}else {
//				System.out.println("다시 입력");
//			}
//		}
		
		int grade = 0;		// 평점
		do {
			System.out.println("평점 입력 : ");
			grade = sc.nextInt();
		} while (grade < 1 || grade > 5);
		
		String stars = ""; 	// 빈 문자열("")은 문자열 연결 연산(+)의 경우에 초기화로 사용됩니다.
		for(int i = 0; i < grade; i++) {
			stars += "★";
		}
		System.out.println("평점 : " + grade + " (" + stars + ")");
		
		
		
		
		
		
	}
}
