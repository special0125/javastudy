package ex03_input;

import java.util.Scanner;

/*
 * 2. double 타입의 실수 2개 입력 받아서 값을 교환하기
 */
public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 실수 입력 : ");
		double no1 = sc.nextDouble();
		System.out.print("두 번째 실수 입력 : ");
		double no2 = sc.nextDouble();
		
		double temp = no1;
		no1 = no2;
		no2 = temp;
		
		System.out.println("no1 : " + no1);
		System.out.println("no2 : " + no2);
		
	}
}
