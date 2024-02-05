package day08;

import java.awt.Container;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.*;
//import java.awt.*;

public class MyDiary extends JFrame{
	JTextField tfId; // 아이디 입력필드
	JPasswordField tfPw; // 비밀번호 입력필드
	
	Container cp;
	
	String[] userInfo= {"root","123"};//아이디, 비밀번호
	private JTextField textField;
	private JPasswordField passwordField;
	
	public MyDiary() {
		super(":::MyDiary v1.1:::");
		cp=this.getContentPane();//컨텐트 페인
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(253, 254, 207));
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(MyDiary.class.getResource("/day08/diary.png")));
		lblNewLabel.setBounds(10, 10, 368, 114);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(52, 175, 289, 56);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(52, 256, 289, 56);
		panel.add(passwordField);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pw = new String(passwordField.getPassword());
				if(textField.getText()=="root" && pw=="1234") {
					dispose();
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon(MyDiary.class.getResource("/day08/login.png")));
		btnNewButton.setBounds(52, 338, 289, 48);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				passwordField.setText("");
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(MyDiary.class.getResource("/day08/reset.png")));
		btnNewButton_1.setBounds(52, 396, 289, 48);
		panel.add(btnNewButton_1);
		//창닫기 처리
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//System.exit(0)와 동일
	}
	

	public static void main(String[] args) {
		MyDiary my = new MyDiary();
		my.setSize(400,700);
		my.setVisible(true);

	}
}
