package quiz02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyProgram {
	public static void main(String[] args) {
		
//		FileInputStream fis = null;
//		FileOutputStream fos =null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
//			fis = new FileInputStream("Mountains.mp4");  // 원본
//			fos = new FileOutputStream("Mountains2.mp4");  // 복사본
			bis = new BufferedInputStream(new FileInputStream("Mountains.mp4"));
			bos = new BufferedOutputStream(new FileOutputStream("Mountains2.mp4"));
			
			byte[] b = new byte[1024];  // 1KB
			
			while(true) {
				int readByte = bis.read(b);  // 영상 저장은 b, 실제 읽은 바이트수는 readByte
				if(readByte == -1) {
					break;
				}
				bos.write(b, 0, readByte);
			}
			System.out.println("Mountains.mp4 파일이 복사되었습니다.");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(bos != null) { bos.close(); }
				if(bis != null) { bis.close(); }
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
