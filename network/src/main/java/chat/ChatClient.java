package chat;

import java.io.IOException;
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
			
			String nickname= null;
			while(true) {
				nickname= scanner.nextLine();
				if(nickname.equals("")) {
					System.out.println("닉네임을 입력해주세요");
					continue;
				}else {
					break;
				}
			}
			
			//2.socket 생성
			socket = new Socket();
			
			//3.socket 연결
			socket.connect(new InetSocketAddress(SERVER_IP,SERVER_PORT));
			System.out.println("채팅방에 입장하였습니다.");
			
			//4. reader/writer 생성
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(),"utf-8"),true);
			
			pw.println("join:"+nickname);
			pw.flush();
			
			//6. ChatClientThread 시작
			new ChatClientThread(socket).start();

			//7. 키보드 입력 처리
			while(true) {			
				Thread.sleep(50);				 
				System.out.print(">>");
				String input = scanner.nextLine();
				if(input.equals("")) {
					continue;
				}
				if("quit".equals(input)) {
					//8.quit 프로토콜 처리
					pw.println("quit");
					pw.flush();
					break;
				} else {
					//9. 메세지 처리
					//ChatClientThread
					pw.println("message:"+input);
					pw.flush();
				}
			}		
		} catch (SocketException e) {
			System.out.println("socket error : "+e);
		} catch (IOException e) {
			System.out.println("error : "+e);
		} catch (InterruptedException e) {
			System.out.println("error : "+e);
		}finally {
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
