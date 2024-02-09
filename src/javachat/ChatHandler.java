package javachat;
import java.net.*;
import java.io.*;
import java.util.*;

public class ChatHandler extends Thread {

	private Socket sock;
	private ArrayList<ChatHandler> userList;
	
	private BufferedReader in;
	private PrintWriter out;
	private boolean isStop = false;
	
	
	public ChatHandler(Socket sock, ArrayList<ChatHandler> userList) {
		this.sock=sock;
		this.userList=userList;
		try {
			in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			out = new PrintWriter(sock.getOutputStream(), true);
		}catch(Exception e) {
			System.out.println("error 1:"+e);
		}
	}
	
	@Override
	public void run() {
		try {
			//입장한 클라이언트의 닉네임 받기
			String nick = in.readLine();
			System.out.println(nick+"님 입장함");
			//모든 접속자에게 방금 입장한 사람의 닉네임을 쏴줍시다
			String msg = "##["+nick+"]님이 입장했습니다##";
			broadcast(msg);
		} catch (Exception e) {
			System.out.println("run error 2:"+e);
		}
	}
	//여러 개의 Thread가 동시접속하여 메시지를 보낼 때 대화 메시지를 순차적으로 전송하기 위함
	//synchronized 제한자(modifier)를 붙여준다.
	//간발의 차로 먼저 도착한 메시지를 먼저 보여주기 위해서는 synchronized 붙여줘야한다.
	private synchronized void broadcast(String msg) {
		for(ChatHandler chat:userList) {
			chat.out.println(msg);//모든 클라이언트에게 메시지를 쏜다
		}
	}
}
