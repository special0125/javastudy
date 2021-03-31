package quiz03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ObjectInputStream.GetField;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMainClass {
	public static void main(String[] args) {
		
		ServerSocket server = null;
		Socket client = null;

		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		Scanner sc = null;
		
		try {
			server = new ServerSocket();
			server.bind(new InetSocketAddress("localhost", 5462));
			
				
				System.out.println("=========서버가 동작중입니다==========");
				client = server.accept();
				InetSocketAddress isa = (InetSocketAddress)client.getRemoteSocketAddress();
				System.out.println("Connected client : [" + isa.getHostName() + "]");
				
			while(true) {
				bis = new BufferedInputStream(client.getInputStream());
				byte[] b = new byte[1024];
				int length = bis.read(b);
				String message = new String(b, 0, length, "UTF-8");
				System.out.println("From Client <<< " + message);
				
				sc = new Scanner(System.in);
				bos = new BufferedOutputStream(client.getOutputStream());
				System.out.print("To Client >>> ");
				String msg = sc.nextLine();
				bos.write(msg.getBytes());
				bos.flush();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(bos != null) { bos.close(); }
				if(bis != null) { bis.close(); }
				if(!server.isClosed()) { server.close(); }
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
