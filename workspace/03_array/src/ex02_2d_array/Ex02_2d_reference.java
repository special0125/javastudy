package ex02_2d_array;

public class Ex02_2d_reference {
	public static void main(String[] args) {
		
		int[][] a = {
				{1, 2},
				{3, 4, 5, 6},
				{7, 8, 9}
		};
		
		System.out.println(a);		// a[0], a[1], a[2] 참조값이 모여 있는 주소입니다.
		
		System.out.println(a[0]);		// a[0]는 {1, 2} 입니다.
		System.out.println(a[1]);		// a[1]는 {3, 4, 5, 6} 입니다
		System.out.println(a[2]);		// a[2]는 {7, 8, 9} 입니다.
		
		System.out.println(a.length);	// 3 (a[0], a[1], a[2])
		
		System.out.println(a[0].length);	// 2 (1, 2)
		System.out.println(a[1].length);	// 4 (3, 4, 5, 6)
		System.out.println(a[2].length);	// 3 (7, 8, 9)
		
		// for문으로 순회합니다.
		
		for(int i = 0; i < a.length; i++ ) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
}
