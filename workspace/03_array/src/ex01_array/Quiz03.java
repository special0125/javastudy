package ex01_array;

import java.util.Scanner;

/*
 * 3. 성적 관리 프로그램
 * 학생들의 점수를 입력 받아서, 
 * 평균, 최대, 최소 점수를 출력하기
 */
public class Quiz03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] students = {"타요", "브레드", "스폰지밥", "도라에몽", "짱구"};
		int[] scores = new int[students.length];
		int total = 0;
		for(int i = 0; i < students.length; i++) {
			System.out.print(students[i] + "의 점수 입력 : ");
			scores[i] = sc.nextInt();
			total += scores[i];
		}
		
		// 평균(합계/개수), 최소, 최대값을 저장할 변수를 선언하고, 초기화를 진행합니다.
		// 첫 번째 학생의 점수를 초기화 값으로 사용합니다.
		int max = scores[0];
		int min = scores[0];
		String maxStudent = students[0];
		String minStudent = students[0];
		
		// 첫 번째 학생의 점수는 제외하고 합계, 최소, 최대값을 구합니다.
		// 인덱스를 1부터 사용합니다.
		
		for(int i = 1; i < scores.length; i++) {
			if (max < scores[i]) {	// 현재 저장된 최댓값보다 큰 점수가 나타난다면,
				max = scores[i];	// 그 큰 점수를 최댓값으로 사용합니다.
				maxStudent = students[i];
			}else if (max == scores[i]) {
				maxStudent += "  "+students[i];
			}
			if(min > scores[i]) {		// 현재 저장된 최솟값보다 작은 점수가 나타난다면,
				min = scores[i];	// 그 작은 점수를 최솟값으로 사용합니다.
				minStudent = students[i];
			}else if (min == scores[i]) {
				minStudent += "  "+students[i];
			}
		}
		
		// 결과를 출력합니다.
		System.out.println("평균 : " + ((double)total / students.length) + "점");
		System.out.println("최대 : " + max + "\t who? : " + maxStudent);
		System.out.println("최소 : " + min + "\t who? : " + minStudent);
		
		
	}
}
