package ex02_2d_array;
/*
 * 2. 구구단의 결과만 2차원 배열에 저장하고 출력하기
 * 2 4 6 ... 18
 * 3 6 8 ... 27
 * ...
 * 9 18 27 ...
 */
public class Quiz02 {
	public static void main(String[] args) {
		
		int[][] dan = new int[8][9];
		
		for(int i = 0; i < dan.length; i++) {	// i는 dan과 관련
			for(int j = 0; j < dan[i].length; j++)	{ // j는 n과 관련
				dan[i][j] =  (i + 2) * (j + 1);
			}
		}
		
		for(int[] a : dan) {
			for(int n : a) {
				System.out.print(n + "\t");
			}
			System.out.println();
		}
		
		
		
		
		
	}
}
