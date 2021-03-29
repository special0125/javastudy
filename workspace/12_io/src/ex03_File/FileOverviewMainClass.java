package ex03_File;

import java.io.File;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

/*
	File 클래스
	1. 파일을 조작하는 클래스입니다.
	2. 파일 생성, 삭제, 파일명, 파일크기, 수정날짜 등의 확인이 가능합니다.
*/
public class FileOverviewMainClass {
	public static void main(String[] args) {
		
		// 디렉터리 조작
		File dir = new File("C:\\MyTemp");  // 경로 구분 ( \\ == File.separator )
		// File dir = new File("C:" + File.separator + "MyTemp");  // Linux와 Windows 호환용
		
		System.out.println(dir.exists()); // 존재하는 경로이면 true 반환, 아니면 false 반환
		
		
		if(dir.exists() == false) { // if ( !dir.exists() ) { 존재하지 않는 dir이면
			dir.mkdirs();  // dir 디렉터리를 생성합니다.
			System.out.println("MyTemp 디렉터리가 생성되었습니다.");
			
		}
		
		/*
		if(dir.exists() == true) {  // if ( dir.exists() ) { * 주석 코드가 더 좋습니다.
			dir.delete();  // dir 디렉터리 삭제합니다.
			System.out.println("MyTemp 디렉터리가 삭제되었습니다.");

		}
		*/

		
		// 파일 조작
		File file = new File("C:\\MyTemp\\MyFile.txt");
		// File file = new File("C:\\MyTemp", "MyFile.txt");
		// File file = new File(dir, "MyFile.txt");  // File dir = new File("C:\\MyTemp");
		
		System.out.println(file.exists());
		
		try {
			if(file.exists() == false) { // if ( !file.exists() ) {
				file.createNewFile();  // 내요이 없는 파일을 생성합니다.
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		Date date = new Date(file.lastModified());
		String pattern = "yyyy-MM-dd a h:mm";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		System.out.println(file.getAbsolutePath());  // C:\MyTemp\MyFile.txt
		System.out.println(file.getPath());  // C:\MyTemp\MyFile.txt
		System.out.println(file.getParent());  // C:\MyTemp
		System.out.println(file.getName());  // MyFile.txt
		System.out.println(sdf.format(date));  // 1616978459599
		System.out.println(file.length());  // 0
		 
		
		// 디렉터리 내의 모든 디렉터리와 파일 목록 출력하기
		
		File javaDir = new File("C:\\Program Files\\Java\\jdk1.8.0_202");
		File[] files= javaDir.listFiles();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		for(File f : files) {
			System.out.print(sdf2.format(new Date(f.lastModified())) + " ");
			if (f.isDirectory()) {
				System.out.print("<DIR> " + "    ");
			} else {
				System.out.print("      " + new DecimalFormat("#,##0").format(f.length()));
			}
			System.out.println("     " + f.getName());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
