package ex02_operator;

public class Ex03_operator {
	public static void main(String[] args) {
		
		// 6. 조건 연산자 (삼항 연산자)
		// 조건식 ? true일 떄 : false일 때
		int score = 80;
		String pass = score >= 60 ? "합격" : "불합격";
		System.out.println(pass);
		
		
		
		//  문제1. 평균이 85점 이상이거나, 국어와 영어 점수가 모두 80점 이상이면 "합격", 아니면 "불합격"
		int kor = 13;
		int eng = 94;
		double avg = (double)(kor+eng) / 2;
		String ispass = avg >= 85 || (kor>80 && eng>=80) ? "합격" :"불합격";
		System.out.println(ispass);
		
		
		// 문제2. 2자리(10~99) 정수 중에서 하나를 임의로 선언하고, 
		// 그 값이 '카프리카 수' 이면 "맞다", 아니면 "아니다"
		// 45, 55, 99가 카프리카 수 입니다.
		int n = 99;	// 45 * 45 -> 2025 -> 20	25 -> 20 + 25 -> 자신
		
		int n2 = n * n;	// Math.pow(n, 2) == n * n 
		int a = n2 / 100;
		int b = n2 % 100;
		String kaprekar = a+b == n ? "맞다" : "아니다";
		System.out.println(n2);
		System.out.println(a);
		System.out.println(b);
		System.out.println(kaprekar);
		
	}
}
