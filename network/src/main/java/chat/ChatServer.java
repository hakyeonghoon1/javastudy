package chat;

import java.io.IOException;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {

	private static final int PORT = 8080;
	
	public static void main(String[] args) {
		ServerSocket serverSocket =null;
		List<Writer> listWriters = new ArrayList<Writer>();

		
		try {
			
			serverSocket = new ServerSocket();
			
			serverSocket.bind(new InetSocketAddress("127.0.0.1",PORT));
			log("연결 기다림 127.0.0.1 : "+ PORT);
			
			while(true) {
				Socket socket = serverSocket.accept();
				new ChatServerThread(socket,listWriters).start();
			}
		} catch (IOException e) {
			System.out.println("IOException:" +e);
		} 

	}
	
	public static void log(String log) {
		System.out.println("[Server] "+ log);
	}

}
