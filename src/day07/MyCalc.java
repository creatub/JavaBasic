package day07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyCalc extends JFrame{ // 얘를 Frame으로 만드려고 함
	
	Container cp; // 내용물(부품)을 붙이는 플랫폼 역할을 함 (동서남북 나뉘어져 있던 것)
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	// 기본 생성자 구성
	public MyCalc() {
		cp=this.getContentPane();
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MyCalc.class.getResource("/day07/Calc.png")));
		lblNewLabel.setBounds(65, 36, 350, 100);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자1");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 25));
		lblNewLabel_1.setBounds(65, 170, 100, 50);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("숫자2");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(65, 250, 100, 50);
		panel.add(lblNewLabel_1_1);
		
		textField = new JTextField(); // 숫자1 입력박스
		textField.setFont(new Font("굴림", Font.PLAIN, 25));
		textField.setBounds(190, 170, 220, 50);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();//숫자2 입력박스
		textField_1.setFont(new Font("굴림", Font.PLAIN, 25));
		textField_1.setColumns(10);
		textField_1.setBounds(190, 250, 220, 50);
		panel.add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("결과");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 25));
		lblNewLabel_1_1_1.setBounds(65, 330, 100, 50);
		panel.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField(); // 결과
		textField_2.setFont(new Font("굴림", Font.PLAIN, 25));
		textField_2.setColumns(10);
		textField_2.setBounds(190, 330, 220, 50);
		panel.add(textField_2);
		
		JButton btnNewButton = new JButton("더하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				JOptionPane.showMessageDialog(textField_1, "더하기 버튼을 눌렀습니다.");
				//숫자1 입력박스에 입력한 값 얻어오기
				//숫자2 입력박스에 입력한 값 얻어오기
				String str1 = textField.getText();
//				setTitle("숫자1: "+str1);
				String str2 = textField_1.getText();
				//숫자1+숫자2 더한 값을 결과 입력박스에 넣어준다.
				int result = Integer.parseInt(str1)+Integer.parseInt(str2);
				textField_2.setText(String.valueOf(result));
			}
		});
		btnNewButton.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		btnNewButton.setBounds(90, 400, 150, 80);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("지우기");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		btnNewButton_1.setBounds(265, 400, 150, 80);
		panel.add(btnNewButton_1);
	}// 기본 생성자
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalc cal = new MyCalc(); // MyCalc는 JFrame(상속)
		cal.setSize(500,600);
		cal.setVisible(true);
	}
}
