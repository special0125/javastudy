package ex03_input;

import java.util.Scanner;

/*
 * 성별을 의미하는 숫자(1~4)를 입력받아서 "남", "여" 구분 출력하기
 * 
 */
public class Quiz05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력(1~4) : ");
		int genderNo = sc.nextInt();
		
		String gender = (genderNo % 2 == 0) ? "여자" : "남자";
		
		System.out.println("성별은 : " + gender);
	}
}
