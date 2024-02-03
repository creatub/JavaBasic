package day07;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;

public class Test {

	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setSize(500, 500);
		
		JButton btnNewButton = new JButton("하단 버튼");
		f.getContentPane().add(btnNewButton, BorderLayout.SOUTH);
		
		JButton btnNewButton_1 = new JButton("상단 버튼");
		f.getContentPane().add(btnNewButton_1, BorderLayout.NORTH);
		
		JButton btnNewButton_2 = new JButton("New button");
		f.getContentPane().add(btnNewButton_2, BorderLayout.WEST);
		
		JButton btnNewButton_3 = new JButton("New button");
		f.getContentPane().add(btnNewButton_3, BorderLayout.EAST);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setForeground(new Color(128, 0, 255));
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		f.getContentPane().add(lblNewLabel, BorderLayout.CENTER);
		f.setVisible(true);//true값을 주어야 확인할 수 있다.
		

	}

}
