package diary;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyDiary extends JFrame{
	Container cp;
	
	String[] userInfo = {"root", "1234"};//ID, Password
	private JTextField textField;
	private JPasswordField passwordField;
	
	public MyDiary() {
		super(":::MyDiary v1.1:::");
		cp = this.getContentPane();//컨텐트 페인
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(MyDiary.class.getResource("/diary/Diary.png")));
		lblNewLabel.setBounds(10, 10, 368, 148);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(91, 196, 287, 42);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("");
		passwordField.setBounds(91, 248, 287, 42);
		panel.add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("아이디");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(10, 195, 71, 42);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("패스워드");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setBounds(10, 248, 71, 42);
		panel.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ID 비밀번호 받아오기
				String id = textField.getText();
				String pw = new String(passwordField.getPassword());				
				//로그인 결과 대화창으로 보여주기
				//loginCheck 함수사용해서 하기
				loginCheck(id, pw);
				
			}
		});
		btnNewButton.setIcon(new ImageIcon(MyDiary.class.getResource("/diary/login_new.png")));
		btnNewButton.setBounds(24, 327, 266, 73);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				passwordField.setText("");
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(MyDiary.class.getResource("/diary/reset_button.png")));
		btnNewButton_1.setBounds(24, 418, 172, 48);
		panel.add(btnNewButton_1);
		
		//창닫기 처리
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//System.exit(0)와 동일
		
	}
	
	void loginCheck(String id, String pw) {
		if(id.equals(userInfo[0]) && pw.equals(userInfo[1])) {
			JOptionPane.showMessageDialog(textField, "로그인에 성공했습니다.");
//			dispose();
		}else {
			JOptionPane.showMessageDialog(textField, "아이디와 비밀번호를 확인해주십시오.");
		}
	}
	
	public static void main(String[] args) {
		MyDiary my = new MyDiary();
		my.setSize(400,700);
		my.setVisible(true);

	}
}
