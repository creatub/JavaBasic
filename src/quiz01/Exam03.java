package quiz01;

import javax.swing.JOptionPane;
public class Exam03 {
	public static void main(String[] args) {
		String tel=JOptionPane.showInputDialog("통신사를 입력해주세요");
		String phone_num = JOptionPane.showInputDialog("전화번호를 입력해주세요");
		String name = JOptionPane.showInputDialog("이름을 입력해주세요");
		
		System.out.printf("%s님은 %s에 %s\n", name, tel, phone_num);
		
				
	}
}
