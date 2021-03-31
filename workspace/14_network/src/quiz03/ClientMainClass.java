package quiz03;

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
			client = new Socket();
			client.connect(new InetSocketAddress("localhost",5462));
			System.out.println("서버에 접속되었습니다.");
			
			while(true) {
				sc = new Scanner(System.in);
				System.out.print("To Server >>>");
				String message = sc.nextLine();
				bos = new BufferedOutputStream(client.getOutputStream());
				bos.write(message.getBytes("UTF-8"));
				bos.flush();
				
				bis = new BufferedInputStream(client.getInputStream());
				byte[] b = new byte[1024];
				int length = bis.read(b);
				String msg = new String(b, 0, length, "UTF-8");
				System.out.println("From Server <<< " + msg);
				
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(bis != null) { bis.close(); }
				if(bos != null) { bos.close(); }
				if(!client.isClosed()) { client.close(); }
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
