package ex01_branch;

import java.util.Scanner;

/*
 * switch, 나이 입력 받아서 "성인", "미성년자"
 */
public class Quiz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		String state = (age >= 20) ? "성인" : "미성년자";
	
		switch(state) {
		case "성인" :
			System.out.println("성인");
			break;
		case "미성년자" :
			System.out.println("미성년자");
			break;	
		}
		
		/*
		switch(age / 10) {
		case 0 :	// age = 1 ~ 9 
		case 1 : // age = 10 ~ 19
			System.out.println("미성년자");
			break;
		default :
			System.out.println("성인");
		}
		*/
		
		
		
		
		
		
	}
}
