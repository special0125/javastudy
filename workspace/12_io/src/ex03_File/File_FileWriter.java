package ex03_File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_FileWriter {
	public static void main(String[] args) {
		
		// text.txt 파일 조작 객체 file 생성
		
		File dir = new File("C:\\MyTemp");
		
		if(dir.exists() == false) {
			dir.mkdir();
		}
		
		File file = new File(dir, "text.txt");
		
		// text.txt 파일에 데이터 보내기
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file);
			fw.write("안녕하세요.");
			fw.write('\n');
			fw.write("반갑습니다.");
			System.out.println(file.getAbsolutePath() + " 파일이 생성되었습니다.");
		}catch (IOException e) {
			e.printStackTrace();// TODO: handle exception
		}finally {
			try {
				if (fw != null) { fw.close(); }
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
