package day12;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MultiThreadGui extends JFrame {

	static Container cp;
	static JLabel lbCount, lbImage, lbClock;
	private JButton btStart, btStop;
	Thread trClock;
	private ClockRunnable2 r1;
	CountThread trCount=null;
	ImageThread trImage=null;
	boolean isStop=false;
	
	public MultiThreadGui() throws HeadlessException {
		super("::MultiThreadGui::");
		setSize(700,400);
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		cp=this.getContentPane();
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		
		btStart = new JButton("게임 시작");
		panel.add(btStart);
		
		btStop = new JButton("게임 중지");
		panel.add(btStop);
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		lbCount = new JLabel("카운트: ");
		lbCount.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 34));
		lbCount.setBounds(29, 72, 284, 98);
		panel_1.add(lbCount);
		
		lbImage = new JLabel("이미지");
		lbImage.setIcon(new ImageIcon("src/day12/T0.gif"));
		lbImage.setBounds(414, 55, 216, 149);
		panel_1.add(lbImage);
		
		lbClock = new JLabel("시간");
		lbCount.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 26));
		lbClock.setBounds(29, 219, 617, 55);
		panel_1.add(lbClock);
		
		//btStart에 대한 이벤트 처리-Anonymous class로 처리해보자 => inner class 방식
		btStart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setTitle(e.getActionCommand()+"누름");
				panel_1.setBackground(Color.yellow);
				isStop=false;
				//카운트 스레드와 이미지 스레드를 동작
				if(trCount==null) {
					trCount = new CountThread();
					trCount.start();
				}
				if(trImage==null) {
					trImage = new ImageThread();
					trImage.start();
				}
				
			}//actionPerformed
		});//inner class
		//setTimeout(function(){},1000) ==>javaScript 방식
		//btStop버튼에 대한 이벤트 처리
		btStop.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String cmd=e.getActionCommand();
				setTitle(cmd+"누름");
				isStop=true;
				panel_1.setBackground(Color.darkGray);
				if(trCount!=null) {
					trCount.interrupt();
					trCount=null;
				}
				if(trImage!=null) {
					trImage.interrupt();
					trImage=null;
				}
			}
		});
		
		//시계 Thread 동작
		r1=new ClockRunnable2(this);
		trClock=new Thread(r1);
		trClock.start();
		
	}//생성자------------------
	//카운트 스레드 -> inner class 구현
	//inner class는 static도 붙일 수 있다
	static class CountThread extends Thread{
		static int count = 500;
		@Override
		public void run() {
			for(; count>0;count--) {
				lbCount.setText("카운트: "+count);
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					System.out.println("예외: "+e.getMessage());
					return;
				}
			}
			JOptionPane.showMessageDialog(cp, "카운트 다운 완료, 게임 종료");
		}//run()--------
	}// inner class ///

	//이미지 스레드
	class ImageThread extends Thread{
		@Override
		public void run() {
			//반복문 돌면서 T0.gif~T9.gif의 ImageIcon 객체
			//lbImage.setIcon(이미지아이콘)
			
			while(!isStop) {
				for(int i=0; i<10; i++) {
					ImageIcon icon = new ImageIcon("src/day12/T"+i+".gif");
					lbImage.setIcon(icon);
					try {
						Thread.sleep(50);
					}catch(InterruptedException e) {
						System.out.println("예외: "+e.getMessage());
						break; // 이걸 안해줘서 thread 종료가 안됐었음!
					}
				}//for
			}//while
		}
	}

	public static void main(String[] args) {
		new MultiThreadGui();

	}//main()------------------
}//class///////////////////
