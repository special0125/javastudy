package ex01_random;
/*
 * 5. 5 x 5 크기의 빙고 생성하기
 * 1) 1 ~ 25를 bingo 배열에 순서대로 저장해 두고,
 * 2) 섞는다.
 */
public class Quiz05 {
	public static void main(String[] args) {

		// final 상수 : 변하지 않는 값을 저장해 두는 경우에 사용
		final int SIZE = 5;
		int[][] bingo = new int[SIZE][SIZE];
		
		// 1 ~ 25 순서대로 생성
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				bingo[i][j] = ( i * SIZE ) + (j + 1);
			}
		}
		
		// 섞기
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				int x = (int)(Math.random() * SIZE);
				int y = (int)(Math.random() * SIZE);
				int temp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = temp;
			}
		}
		
		// 출력
		for(int i = 0; i < SIZE; i++) {
			for(int j =0; j < SIZE; j++) {
				System.out.print(bingo[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
