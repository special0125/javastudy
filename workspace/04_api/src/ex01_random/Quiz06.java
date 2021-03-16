package ex01_random;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 로또 구매하기
 * 1000원에 번호 6개 1세트가 나옵니다.
 * 얼마? >>> 5000
 * 
 * 
 */
public class Quiz06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int SIZE = 6;
		
		System.out.print("얼마? >>> ");
		int money = sc.nextInt();
		int set = money / 1000;
		
		int lotto[][] = new int[set][6];
		
		for(int i = 0; i < set; i++) {
			int ballCount = 45;
			int[] balls = new int[ballCount];
			for(int j = 0; j < balls.length; j++) {
				balls[j] = j + 1;
			}
			
			// balls 배열 -> lotto 배열
			// 1. balls 배열의 인덱스를 랜덤 생성합니다.
			// 2. 해당 인덱스의 값을 lotto 배열로 보냅니다.
			// 3. balls 배열의 마지막 요소를 랜덤 생성한 인덱스로 보냅니다.
			for(int j = 0; j <lotto[i].length; j++) {
				int idx = (int)(Math.random() * ballCount);
				lotto[i][j] = balls[idx];
				int lastIdx = 44 - j;
				if(idx != lastIdx) {
					balls[idx] = balls[lastIdx];
				}
				ballCount--;
			}
		}		
		// 세트별로 정령(오름차순)해서 출력하기
		for(int[] line : lotto) {
			Arrays.sort(line);	// 한 줄만 빼서 오름차순 정렬
			for(int n : line) {
				System.out.print(n + "\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}
}
