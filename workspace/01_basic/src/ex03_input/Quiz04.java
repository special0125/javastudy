package ex03_input;

import java.util.Scanner;

/*
 * int 타입의 매출액 + 등급("VIP", "일반") 입력 받아서 실매출액 출력하기
 * "VIP"는 20% 할인 "일반"은 5%할인
 * 
 */
public class Quiz04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("매출액 : ");
		int salesMoney = sc.nextInt();
		/*
		 * naming convention
		 * 		- snake case : _로 단어를 연결하는 방식
		 * 		- camel case : 단어가 바뀔때 대문자 사용
		 * 		- lower camel case : 첫번째 글자가 소문자
		 * 		- upper camel case : 첫번쨰 글자가 대문자
		 */
		System.out.print("등급 : ");
		String grade = sc.next();
		
		// grade == "VIP" : grade.equals("VIP")
		//double disCountRate = grade.equals("VIP") ? 0.2 : 0.05;
		double disCountRate = grade.equalsIgnoreCase("VIP") ? 0.2 : 0.05;
		// String 비교할땐 equals 사용!
		
		salesMoney -= (salesMoney * disCountRate);
		
		System.out.println("실 매출액 : " + salesMoney);
		
		
		
		
		
		
	
	}
}
