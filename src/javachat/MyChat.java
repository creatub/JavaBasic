package javachat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.net.*;
import java.io.*;

public class MyChat extends JFrame implements ActionListener, Runnable {

	Container cp;
	private JTextField tf;
	private JTextArea ta;
	private JButton bt;
	private String nickName = "noname";
	
	private Socket sock;
	private BufferedReader in;
	private PrintWriter out;

	private boolean flag = false;
	
	public MyChat() {
		super("::MyChat::");
		cp = this.getContentPane();

		this.setSize(400, 600);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 215, 215));
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 368, 421);
		panel.add(scrollPane);

		ta = new JTextArea();
		scrollPane.setViewportView(ta);
		ta.setBorder(new LineBorder(Color.black, 1));
		ta.setFont(new Font("sans-serif", Font.BOLD, 18));
		ta.setEditable(false);// 편집하지 못하도록 => 읽기 전용

		tf = new JTextField();
		tf.setBounds(10, 441, 368, 43);
		panel.add(tf);
		tf.setColumns(10);
		tf.setFont(new Font("sans-serif", Font.BOLD, 18));
		tf.setBorder(new TitledBorder("Message"));

		bt = new JButton("퇴   장");
		bt.setBounds(10, 494, 368, 43);
		panel.add(bt);
		bt.setMnemonic('M');// 단축키 설정 Alt+M
		// 리스너 부착
		bt.addActionListener(this);
		tf.addActionListener(this);// 엔터 칠 때 ActionEvent발생
		
		nickName = JOptionPane.showInputDialog("닉네임을 입력하세요");
		if (nickName != null) {
			setTitle(nickName + "님의 대화창");
			//챗서버에 접속
			connectChat();
		}
	}

	public void connectChat() {
		try {
			sock=new Socket("localhost",9999);
			ta.append("##챗서버에 연결됨##\n");
			in=new BufferedReader(new InputStreamReader(sock.getInputStream()));
			out=new PrintWriter(sock.getOutputStream(), true);
			out.println(nickName);//서버에 나의 닉네임을 보내자
			//서버의 메시지를 듣는 스레드 동작
			Thread listener=new Thread(this);//Runnable 넣기
			listener.start();
		} catch (Exception e) {
			ta.setText("채팅 서버 연결 실패\n"+e);
		}
	}
	@Override
	public void run() {
		String serverMsg = "";
		try {
			while(!flag) { // while문 안에서 try하면 서버 끊겨도 계속 연결하려고 시도
				serverMsg=in.readLine();
				if(serverMsg==null) return; // 혹시 모르니까 :)
				ta.append(serverMsg+"\n");
				//커서의 위치를 ta의 끝으로 이동 - 스크롤바가 따라갈 수 있도록
				ta.setCaretPosition(ta.getText().length());
			}// 서버 끊기면 스레드도 자연스럽게 죽을 수 있도록
		}catch(IOException e) {
			ta.append("\n서버와 연결 끊김: "+e);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==tf) {
			sendMsg();
		}else if(obj==bt) {
			exitChat();
		}
	}
	/**서버에 메시지를 보내는 메서드*/
	private void sendMsg() {
		if (!tf.getText().equals("")) {
			String input = tf.getText();
//			ta.setText(ta.getText()+tf.getText()+"\n");
//			ta.append(nickName+": "+tf.getText()+"\n");
			// 서버에 입력한 내용 보내기
			out.println(input);
			tf.setText("");
		}
		tf.requestFocus();
	}// sendMsg()----------
	
	/**퇴장 처리하는 메서드*/
	public void exitChat() {
		//원래는 프로토콜마다 행동을 정해주는 식으로 해야함 
		String msg="##["+nickName+"]님이 퇴장합니다##";
		out.println(msg);
		ta.setText("");
		tf.setText("");
		tf.setEnabled(false);//입력박스 비활성화
		//서버 메시지 듣는 스레드 중지시키기
		try {
			flag=true;
			//자원반납
			if(in!=null) in.close();
			if(out!=null) out.close();
			if(sock!=null) sock.close();
			
		}catch(Exception e) {
			System.out.println("퇴장 처리 중 예외: "+e);
		}
	}//exitChat()---------

	public static void main(String[] args) {
		new MyChat();
	}

}
