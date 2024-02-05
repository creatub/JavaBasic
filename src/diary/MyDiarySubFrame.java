package diary;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.*;

public class MyDiarySubFrame extends JFrame {
	Container cp;
	private JTextField tfDate;
	private JTextField tfTitle;
	private JTextArea ta;

	public MyDiarySubFrame() {
		super(":::MyDiarySubFrame:::");
		cp = this.getContentPane();// 컨텐트 페인

		JPanel panel = new JPanel();
		panel.setBackground(new Color(189, 189, 255));
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		tfDate = new JTextField();
		tfDate.setName("");
		tfDate.setToolTipText("");
		tfDate.setBounds(10, 10, 368, 58);
		panel.add(tfDate);
		tfDate.setColumns(10);
		tfDate.setBorder(new TitledBorder(":::파일명(yyyymmdd):::"));// Border를 이용해 TextField내에 글씨 표시

		tfTitle = new JTextField();
		tfTitle.setToolTipText("");
		tfTitle.setName("");
		tfTitle.setColumns(10);
		tfTitle.setBounds(10, 78, 368, 58);
		panel.add(tfTitle);
		tfTitle.setBorder(new TitledBorder(":::제   목:::"));

		JButton btnNewButton = new JButton("파일에 저장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				writeFile();
			}
		});
		btnNewButton.setBounds(10, 549, 179, 40);
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("일기 가져오기");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				readFile();
			}
		});
		btnNewButton_1.setBounds(199, 549, 179, 40);
		panel.add(btnNewButton_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 146, 368, 393);
		panel.add(scrollPane);

		ta = new JTextArea();
		scrollPane.setViewportView(ta);
		ta.setBorder(new TitledBorder(":::내   용:::"));

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 창닫기 처리
	}// 생성자--------------------

	public void readFile() {
		try {
			//1. JFileChooser를 열기 모드로 띄우자
			JFileChooser jfc=new JFileChooser("C:\\multicampus\\java-workspace\\JavaBasic\\src\\diary\\");
			int n = jfc.showOpenDialog(cp); //  열기: 0, 취소: 1
			setTitle("n: "+n);
			if(n==1) return;//취소
			
			//2. JFileChooser에서 선택한 파일명의 절대 경로 얻어오기
			File file = jfc.getSelectedFile();
			String path = file.getAbsolutePath();
			System.out.println("path: "+path);
			
			//3. FileReader 생성=>파일과 노드 연결
			FileReader fr = new FileReader(path);
			//4. 배열 준비
			char[] data=new char[2000];//파일 내용을 담을 배열
			//5. 반복문 이용해서 파일 데이터를 읽어들임
			int k = 0;
			String str = "";
			while((k=fr.read(data))!=-1) {
				String content = new String(data,0,k);
				str+=content;
			}
			//6. ta에 읽은 내용 셋팅
			tfDate.setText(file.getName());//파일명 설정
			ta.setText(str);
			//7. close()
			if (fr != null)	fr.close();

		}catch(IOException e) {
			JOptionPane.showMessageDialog(cp, "파일 읽기 중 에러: "+e.getMessage());
		}
		
	}

	public void writeFile() {
		try {

			// 날짜값 가져오기 ==> 파일명으로 활용 "20240205.txt"
			String dateStr = tfDate.getText();
			// 제목 가져오기
			String title = tfTitle.getText();
			// 일기 내용 가져오기
			String content = ta.getText();
			// 유효성 체크
			if (dateStr == null || dateStr.equals("")) {
				JOptionPane.showMessageDialog(cp, "파일명을 날짜 형태로 입력하세요(ex 20240205)");
				tfDate.requestFocus();
				return;
			}

			// 1. 파일과 노드 연결 => FileWriter 객체 새성 => 예외 발생
			FileWriter fw = new FileWriter("src/diary/" + dateStr + ".txt");// 파일명 만들기
			// 2. FileWriter의 write()메서드 호출 => 예외 발생
			fw.write("Date   : " + dateStr + "\n");
			fw.write("Title  : " + title + "\n\n");
			fw.write("Content: " + content + "\n");
			fw.flush();// 스트림에 데이터가 남아있으면 밀어내기를 해준다
			// 3. 파일과 노드 연결 닫기 => close(); => 예외 발생
			if (fw != null) {
				fw.close();
			}
		} catch (IOException e) {
			JOptionPane.showMessageDialog(cp, "파일 쓰기 중 에러: " + e.getMessage());
		}

		// 파일에 쓰기 위한 스트림객체 생성
	}
}// class/////////////////////
