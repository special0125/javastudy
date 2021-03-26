package quiz01;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

// 사용자로부터 국, 영, 수 점수를 입력 받은뒤 
// int[] 배열에 저장한다.
// score.dat 파일에 이름, 입력 받은 점수, 평균을 저장하시오.


public class MainClass {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] subject = {"국어", "영어", "수학"};
		int[] scores = new int[subject.length];
		String name = "james";
		int total = 0;
		double ave = 0;
		
		for(int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + " >>> ");
			scores[i] = sc.nextInt();
			total += scores[i];
		}
		ave = total / subject.length;
		
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("score.dat"))) {
			dos.writeInt(subject.length);
			dos.writeUTF(name);
			for(int score : scores) {
				dos.writeInt(score);
			}
			dos.writeDouble(ave);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		sc.close();
		
		
		
	
		
		
		
	}
}
