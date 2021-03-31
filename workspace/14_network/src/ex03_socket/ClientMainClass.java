package ex03_socket;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientMainClass {
	public static void main(String[] args) {
		
		Socket client = null;
		Scanner sc = null;
		
		BufferedOutputStream bos = null;
		
		BufferedInputStream bis = null;
		
		try {
			
			// 서버에 접속하기
			client = new Socket();
			client.connect(new InetSocketAddress("localhost", 4966));
			System.out.println("서버에 접속되었습니다.");
			
			// 서버에 메시지 보내기
			sc = new Scanner(System.in);
			System.out.print("서버에 인사말을 건네보세요 >>> ");
			String message = sc.nextLine();
			bos = new BufferedOutputStream(client.getOutputStream());
			bos.write(message.getBytes("UTF-8"));  // message.getBytes() 스트링을 바이트로 형변환 (UTF-8 한글)
			bos.flush();
			
			// 서버가 보낸 답변 메시지 받기
			bis = new BufferedInputStream(client.getInputStream());
			byte[] b = new byte[1024];
			int length = bis.read(b);
			String receiveMSG = new String(b, 0, length, "UTF-8");
			System.out.println(receiveMSG);
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (bos != null) { bos.close(); }
				if (bis != null) { bis.close(); }
				if(!client.isClosed()) { client.close(); }
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}