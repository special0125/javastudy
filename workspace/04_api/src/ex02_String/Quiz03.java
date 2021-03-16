package ex02_String;
/*
 * 3. 파일명과 확장자명을 분리하기
 */
public class Quiz03 {
	public static void main(String[] args) {
		
		String fullname = "2021-03-10.jpg";
		int idx = fullname.lastIndexOf(".");
		String filename = fullname.substring(0, idx);	// 2021-03-10
		String extname = fullname.substring(idx+1);	// jpg
		
		System.out.println(filename);
		System.out.println(extname);
	}
}
