package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;


public class ChatClient {
	private static final String SERVER_IP ="127.0.0.1";
	private static final int SERVER_PORT=8080;
	public static void main(String[] args) {

		Scanner scanner = null;
		Socket socket = null;
		
		try {
			//1.키보드 연결
			scanner = new Scanner(System.in);
					
			System.out.print("닉네임>>");
			String nickname= scanner.nextLine();
			 System.out.println(nickname);
			//2.socket 생성
			socket = new Socket();
			
			//3.socket 연결
			socket.connect(new InetSocketAddress(SERVER_IP,SERVER_PORT));
			System.out.println("채팅방에 입장하였습니다.");
			
			//4. reader/writer 생성
			
			//BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"utf-8"));
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(),"utf-8"),true);
			
			pw.println("join:"+nickname+"\r\n");
			pw.flush();
			//System.out.println("1111111111111111");
			//String data = br.readLine();
			
			//6. ChatClientThread 시작
			new ChatClientThread(socket).start();
			//System.out.println("@222222222222222");
			//7. 키보드 입력 처리
			while(true) {
				System.out.print(">>");
				String input = scanner.nextLine();
				
				if("quit".equals(input)) {
					//8.quit 프로토콜 처리
					pw.println("quit\r\n");
					break;
				} else {
					//9. 메세지 처리
					//ChatClientThread
					pw.println("message:"+input+"\r\n");
					
				}
			}
			
		} catch (SocketException e) {
			System.out.println("socket error : "+e);
		} catch (IOException e) {
			System.out.println("error : "+e);
		} finally {
			try {
				if(socket != null && socket.isClosed() == false) {
					socket.close();
				}
				if(scanner !=null) {
					scanner.close();
				}
				
			} catch (IOException e) {
				System.out.println("error : "+e);
			}
		}
	}
}
