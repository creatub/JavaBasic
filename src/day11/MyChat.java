package day11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
/*[실습]
 * - 입력 버튼에 대한 이벤트 처리 => ActionEvent
 * - 버튼을 누르면 tf에 입력한 값을 가져와서
 *   ta에 붙여주고
 *   tf는 다시 비워주기
 *   ta에는 그동안 입력한 내용을 모두 볼 수 있도록 처리하세요
 */
public class MyChat extends JFrame implements ActionListener{

	Container cp;
	private JTextField tf;
	private JTextArea ta;
	private JButton bt;
	
	public MyChat() {
		super("::MyChat::");
		cp=this.getContentPane();
		
		this.setSize(400,600);
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
		ta.setBorder(new LineBorder(Color.black,1));
		ta.setFont(new Font("sans-serif", Font.BOLD, 18));
		ta.setEditable(false);//편집하지 못하도록 => 읽기 전용
		
		tf = new JTextField();
		tf.setBounds(10, 441, 368, 43);
		panel.add(tf);
		tf.setColumns(10);
		tf.setFont(new Font("sans-serif", Font.BOLD, 18));
		tf.setBorder(new TitledBorder("Message"));
		
		bt = new JButton("입 력");
		bt.setBounds(10, 494, 368, 43);
		panel.add(bt);
		bt.setMnemonic('M');//단축키 설정 Alt+M
		//리스너 부착
		bt.addActionListener(this);
		tf.addActionListener(this);//엔터 칠 때 ActionEvent발생
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(!tf.getText().equals("")) {
//			ta.setText(ta.getText()+tf.getText()+"\n");
			ta.append(tf.getText()+"\n");
			tf.setText("");
		}
		tf.requestFocus();
	}

	public static void main(String[] args) {
		new MyChat();
	}

}
