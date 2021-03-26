package ex01_char;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterMainClass2 {
	public static void main(String[] args) {
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("text4.txt"))) {
			bw.write("안녕하세요.");
			bw.newLine();
			bw.write("반갑습니다.");
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
