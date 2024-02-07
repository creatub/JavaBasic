package day11;
import javax.swing.*;
import java.awt.*;

public class MyCount extends JFrame{
	Container cp;
	
	public MyCount() {
		super("::카운트 다운::");
		cp=this.getContentPane();
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(21, 20, 154, 35);
		panel.add(lblNewLabel);
		this.setBounds(100,100,500,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
	public static void main(String[] args) {
		MyCount my = new MyCount();
	}

}
