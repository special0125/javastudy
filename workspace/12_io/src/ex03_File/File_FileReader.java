package ex03_File;

import java.io.File;
import java.io.FileReader;

public class File_FileReader {
	public static void main(String[] args) {
		
		File file = new File("C:\\Mytemp\\text.txt");
		
		try (FileReader fr = new FileReader(file)) {
			int ch = 0;
			while ( (ch = fr.read()) != -1) {  // fr이 종료되지 않았다면 fr에서 한 글자 읽어 ch에 저장합니다.
				System.out.print((char)ch);
			}
			
		}catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}
		
		
	}
}
