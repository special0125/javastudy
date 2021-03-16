package ex01_branch;

public class Ex02_switch {
	public static void main(String[] args) {
		int choice = 1;
		
		switch (choice) {
		case 1: 
			System.out.println("1이다");
			break;	// switch문을 종료합니다.
		case 2:
			System.out.println("2이다");
			break;
		default :
			System.out.println("나머지");
			// break; 불필요합니다. 없어도 어차피 switch문은 끝납니다.
		
		}
	}
}
