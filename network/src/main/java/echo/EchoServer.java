package echo;


import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	private static final int PORT =7000;
	public static void main(String[] args) {
	
		ServerSocket serverSocket =null;
		
		try {
			
			serverSocket = new ServerSocket();
			
			serverSocket.bind(new InetSocketAddress("0.0.0.0",PORT));
			log("starts...[port:"+PORT+"]");
			
			while(true) {
				Socket socket = serverSocket.accept(); //대기 상태, 커넥트하길 기다리는 중
				new EchoServerReceiveThread(socket).start();
			}
			
			
		} catch (IOException e) {
			log("error: "+e);
		} finally {
			try {
				if(serverSocket != null && serverSocket.isClosed()==false) {
					serverSocket.close();
				}		
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void log(String log) {
		System.out.println("[EchoServer] "+ log);
	}

}
