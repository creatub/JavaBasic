package day12;
import java.net.*;
import java.io.*;
/*클라이언트단
 * - Socket필요 => 서버 ip주소, port번호
 */
public class TCPClient {

	public static void main(String[] args) throws IOException {
		for(int i=0; i<10; i++) {
			Socket sock = new Socket("192.168.45.182", 9100); // localhost = 127.0.0.1
			System.out.println("클라이언트 "+i+": 서버에 접속되었음");
		}
	}

}
