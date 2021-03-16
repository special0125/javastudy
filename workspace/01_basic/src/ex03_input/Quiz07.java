package ex03_input;

import java.util.Scanner;

/*
 * 체질량지수 구해서 건강상태 출력하기
 * double 타입의 몸무게와 키를 입력하고
 * 체질량지수 = 몸무게 / 키(단위 : m) 의 제곱
 * 건강상태 = 25이상 "과체중" ,24~20 "정상", 19이하 "저체중"
 */
public class Quiz07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몸무게 입력 : ");
		double weight = sc.nextDouble();
		System.out.println("키 입력 : ");
		double height = sc.nextDouble();
		
		height /= 100;
		
		double bmi = weight / Math.pow(height, 2);	// weight / (height * height)
		
		String health = (bmi >= 25) ? "과체중" : (bmi >= 20) ? "정상" : "저체중";
		
		System.out.println("체질량 지수 : " + bmi);
		System.out.println("건강 상태 : " + health );
		
	}

}
