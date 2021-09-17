package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.Socket;

public class ChatClientThread extends Thread{

	private BufferedReader br;
	private Socket socket;
	public ChatClientThread(Socket socket) {
		this.socket=socket;
	}

	@Override
	public void run() {
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"utf-8"));
			 while (true) {
				 String data = br.readLine();
				 System.out.println("");
				 System.out.println("<"+data);
				 //System.out.println(">>");
				 
		     }
		} catch (UnsupportedEncodingException e) {
			System.out.println("error : "+ e);
		} catch (IOException e) {
			System.out.println("IOException : "+ e);
		}
       
	}
	
}
