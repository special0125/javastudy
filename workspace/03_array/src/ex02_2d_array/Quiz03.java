package ex02_2d_array;
/*
 * 3. 369 결과 저장하고 출력하기 (1 ~ 100)
 * 
 * 1	2	짝	4	5	짝	7	8	짝	10
 * 11	12	짝	14	15	짝	17	18	짝	20
 * 21	22	짝	24	25	짝	27	28	짝	짝
 * 짝	짝	짝짝	짝	짝	짝짝	짝	짝	짝짝	40
 */
public class Quiz03 {
	public static void main(String[] args) {
		String[][] matrix = new String[10][10];
		
		// 1 ~ 100 
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				int n = (i * 10) + (j + 1);		// n은 1~100입니다.
				
				// 일의 자리와 십의 자리로 분리하기
				int units = n % 10; // 일의 자리
				int tens = n / 10;
				
				// 369 검사
				boolean check1 = units == 3 || units == 6 || units == 9;		// 일의 자리가 3,6,9이면 true
				boolean check2 = tens == 3 || tens == 6 || tens == 9;		// 십의 자리가 3,6,9이면 true
				
				// 실제 369검사 후 저장
				if(check1 && check2) {
					matrix[i][j] = "짝짝";
				}else if (check1 || check2) {
					matrix[i][j] = "짝";
				}else {
					matrix[i][j] = String.valueOf(n);	// String.valuesOf(n) == n + ""
				}
				
				System.out.print(matrix[i][j] + "\t");
				
			}
			System.out.println();
		}

	
	
	
			
			
	}
}
