package ex03_input;

import java.util.Scanner;

/*
 * 주민번호(하이픈 없이) 전체 입력받아서 "남", "여" 구분 출력하기
 */
public class Quiz06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호 입력(하이픈 없이) : ");
//		Long uniqueNo = sc.nextLong();
//		int no =((int)(uniqueNo % 10000000) / 1000000);
		
		String uniqueNo = sc.next();
		 char genderNum = uniqueNo.charAt(6);
		
		 // String gender = (genderNum == '1' || genderNum == '3') ? "남자" : "여자";
		/*
		 * 문자는 코드값을 가지고 있습니다.
		 * ------------------------
		 * 알아두면 좋은 코드 값
		 * '0' : 48
		 * 'A' : 65
		 * 'a' : 97
		 */
		 String gender = (genderNum % 2 == 0) ? "여자" : "남자";
		
		System.out.println("성별 : " + gender);
		System.out.println((int)genderNum);
		
	}
}
