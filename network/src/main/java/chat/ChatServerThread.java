package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;




public class ChatServerThread extends Thread {
	
	private Socket socket;
	private String nickname;
	List<Writer> listWriters =null;
	public ChatServerThread(Socket socket) {
		this.socket=socket;
	}
	public ChatServerThread(Socket socket, List<Writer> listWriters) {
		this.socket=socket;
		this.listWriters=listWriters;
	}
	
	@Override
	public void run() {
		
		//1.remote host information
		InetSocketAddress inetReomteSocketAddress= (InetSocketAddress)socket.getRemoteSocketAddress();
		String remoteHostAddress = inetReomteSocketAddress.getAddress().getHostAddress();
		int remoteHostPort = inetReomteSocketAddress.getPort();
		ChatServer.log("connected by client["+ remoteHostAddress + ":" + remoteHostPort +"]");
		
		try {
			//2.스트림 얻기
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(),"utf-8"));
			PrintWriter pw =  new PrintWriter(new OutputStreamWriter(socket.getOutputStream(),"utf-8"),true);

			
			//3. 요청 처리
			while(true) {
				String request = br.readLine();
				//System.out.println(request);
				if(request == null) {
					ChatServer.log(remoteHostAddress+"클라이언트로부터 연결 끊김");
					doQuit(pw);
					break;
				}
				String[] tokens = request.split(":");
				System.out.println(this.nickname+ " " +request);
				
				if(tokens[0].equals("join")) {
					doJoin(tokens[1],pw);
				} else if(tokens[0].equals("message")) {
					if(tokens[1]==null) {
						tokens[1]=" ";
					}
					doMessage(tokens[1]);
				} else if(tokens[0].equals("quit")) {
					doQuit(pw);
				} else {
					ChatServer.log("에러: 알수 없는 요청("+tokens[0]+")");
				}
				
			}
		} catch (UnsupportedEncodingException e) {
			System.out.println("error:"+e);
		} catch (IOException e) {
			System.out.println("IOError:"+e);
		}
		
		
	}
	private void doJoin(String nickName,Writer writer) {
		//System.out.println("dojoin");
		this.nickname=nickName;
		
		String data = nickName+"님이 참여하였습니다.";
		broadcast(data);
		
		//writer pool에 저장
		addWriter(writer);
		
		//ack
		
	}
	
	private void doMessage(String tokens) {
		if(tokens ==null) {
			tokens=" ";
		}
		broadcast(this.nickname+":"+tokens);
	}
	
	private void doQuit(Writer writer) {
		removeWriter(writer);
		String data = this.nickname+"님이 퇴장 하였습니다.";
		broadcast(data);
	}
	
	private void removeWriter(Writer writer) {
		listWriters.remove(writer);
	}
	
	private void broadcast(String data) {
		synchronized (listWriters) {
			for (Writer writer : listWriters) {
				PrintWriter pw = (PrintWriter)writer;
	            pw.println(data);
	            pw.flush();
			}
		}
	}
	
	private void addWriter(Writer writer) {
		synchronized(listWriters) {
			listWriters.add(writer);
		}
	}	
}
