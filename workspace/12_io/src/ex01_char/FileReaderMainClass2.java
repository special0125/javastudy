package ex01_char;

import java.io.FileReader;

public class FileReaderMainClass2 {
	public static void main(String[] args) {
		
		try (FileReader fr = new FileReader("text3.txt")) {
			
			
			while(true) {
				char[] cbuf = new char[5];
				int readCharCount = fr.read(cbuf);  // 읽은 내용은 cbuf에 저장되고, readCharCount에는 읽은 글자 수가 저장됩니다.
				                                    // 파일의 끝에 도달하면 -1을 readCharCount에 반환합니다.
				if (readCharCount == -1) {
					break;
				}
				System.out.print(cbuf);
				
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
