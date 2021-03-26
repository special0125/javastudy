package ex01_char;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedMainClass {
	public static void main(String[] args) {
		
		try (BufferedReader br = new BufferedReader(new FileReader("text3.txt"))) {
			
//			StringBuilder sb = new StringBuilder();
//			while (true) {
//				char[] cbuf = new char[5];
//				int readCahrCount = br.read(cbuf);
//				if (readCahrCount == -1) {
//					break;
//				}
//				sb.append(cbuf, 0, readCahrCount);  // 읽은 글자수만큼만 sb에 저장합니다.
//			}
//			System.out.println(sb.toString());
			StringBuilder sb = new StringBuilder();
			char[] cbuf = new char[5];
			int readCharCount = 0;
			while ((readCharCount = br.read(cbuf)) != -1) {
				sb.append(cbuf, 0, readCharCount);
			}
			System.out.println(sb.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}


	
	
	
	
	
	
	
	}
}
