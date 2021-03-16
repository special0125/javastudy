package ex01_random;

import java.util.Scanner;

/*
 * 2. UpDown게임
 * 1 ~ 10000 사이의 난수가 발생되면 사용자가 해당 난수를 맞히는 게임
 * 입력 >>> 5000
 * Up
 * 입력 >>> 7500
 * Down
 * 입력 >>> 7499
 * 총 3번만에 정답
 */
public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int top = 10000;
		int bottom = 1;
		int random = (int)(Math.random() * top) + bottom;
		int cnt = 0;
		System.out.println(random);
		
		while(true) {
			cnt++;
			System.out.print("입력 >>> ");
			int answer = sc.nextInt();
			// 입력 범위 체크
			if (answer > top || answer < bottom) {
				System.out.println(bottom + " ~ " + top + " 범위를 입력하세요." );
				continue;
			}
			// 비교합니다.
			if(random == answer) {
				System.out.println("총 " + cnt + "번만에 정답!");
				break;
			}else if(random > answer) {
				System.out.println("Up");
				bottom = answer + 1;
				continue;
			}else {
				System.out.println("Down");
				top = answer - 1;
				continue;
			}
		}
	
		
		
		
		
		
	}
}
