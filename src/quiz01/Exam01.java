package quiz01;

import javax.swing.JOptionPane; // Dialogue 상자를 띄우는 class

public class Exam01 {
	public static void main(String[] args) {
		String width = JOptionPane.showInputDialog("가로길이 입력");
		String height = JOptionPane.showInputDialog("세로길이 입력");
		try {
			int area = Integer.parseInt(width)*Integer.parseInt(height);
			System.out.println("사각형의 면적은 "+area+"입니다.");
		}
		catch(Exception e) {
			System.out.println("숫자만 입력해 주세요");
		}
		
		
	}
}
