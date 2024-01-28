package quiz01;

import javax.swing.JOptionPane;

public class Exam02 {
	static public void main(String[] args) {
		String height=JOptionPane.showInputDialog("키를 입력하세요");
		try {
		double db_hei = Double.parseDouble(height);
		if(db_hei>100) {
		System.out.printf("적정 몸무게 : %.2fkg입니다.",(db_hei-100)*0.9);
		}else {
			System.out.println("100cm이상일 경우에만 적정 몸무게 측정이 가능합니다.");
		}
		}
		catch(Exception e) {
		System.out.println("Exception: "+ e);
		}
				
	}
}

