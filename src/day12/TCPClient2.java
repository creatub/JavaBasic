package day12;
import java.net.*;
import java.io.*;
import java.util.*;

public class TCPClient2 {

	public static void main(String[] args) throws Exception{
		final int port=9100;
		Socket sock = new Socket("192.168.45.182", port);
		System.out.println("##서버에 접속에 성공!!!##");
		InputStream is = sock.getInputStream();
		BufferedReader in = new BufferedReader(new InputStreamReader(is, "euc-kr"));
		//1. 서버의 인사말 듣기
		String serverMsg=in.readLine();
		System.out.println("From Server>>"+serverMsg);
		//2. 서버에게 키보드로 입력하여 메시지를 보내자
		Scanner sc = new Scanner(System.in);
		OutputStream os = sock.getOutputStream();
		PrintWriter out = new PrintWriter(os,true);
		System.out.println("보낼 말을 입력하세요");
		String myMsg = "";
		while((myMsg=sc.nextLine())!=null) {
			out.println(myMsg);//서버에 나의 메시지 보내기
			serverMsg=in.readLine();
			System.out.println("From Server>>"+serverMsg);
		}
		
		
		if(in!=null) in.close();
		if(is!=null) is.close();
		if(sock!=null) sock.close();
	}

}
