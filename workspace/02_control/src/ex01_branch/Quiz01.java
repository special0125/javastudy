package ex01_branch;
import java.util.Scanner;
/*
 * 임의의 양수 1개 입력 받아서 "홀수", "짝수", "3의배수" 출력
 */


public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양수 입력 : ");
		int num = sc.nextInt();
		
		if (num % 3 == 0) {
			System.out.println("3의 배수");
		} else if (num % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	}

}
