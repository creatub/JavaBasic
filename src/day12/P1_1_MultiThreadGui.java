package day12;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class P1_1_MultiThreadGui extends JFrame {
	
	JButton btStart, btStop;
	static JLabel lbCount, lbImage, lbClock;
	Thread trClock;
	/*private*/ ClockRunnable2 r1;
	// ↑ 상관없음 아마도
	CountThread trCount = null;
	ImageThread trImage = null;

	public P1_1_MultiThreadGui() throws HeadlessException {
		super(":: MultiThreadGui");
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(147, 112, 219));
		getContentPane().add(panel, BorderLayout.NORTH);
		
		btStart = new JButton("게임 시작");
		panel.add(btStart);
		
		btStop = new JButton("게임 중지");
		panel.add(btStop);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(221, 160, 221));
		getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		lbCount = new JLabel("카운트: ");
		lbCount.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lbCount.setBounds(54, 101, 158, 97);
		panel_1.add(lbCount);
		
		lbImage = new JLabel("");
		lbImage.setIcon(new ImageIcon(P1_1_MultiThreadGui.class.getResource("/day12/images/images/T0.gif")));
		lbImage.setBounds(409, 79, 216, 144);
		panel_1.add(lbImage);
		
		lbClock = new JLabel("시간");
		lbClock.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lbClock.setBounds(151, 261, 346, 44);
		panel_1.add(lbClock);
		
		// btStart에 대한 이벤트 처리 - Anonymous class로 처리 → inner class 방식
		btStart.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				panel_1.setBackground(Color.yellow);
				setTitle(e.getActionCommand() + "누름");
				// 카운트 스레드와 이미지 스레드 동작
				if(trCount == null)
				{
					trCount = new CountThread();
					trCount.start();
				}
				if(trImage == null)
				{
					trImage = new ImageThread();
					trImage.start();
				}
			}
		});
		
		// btStop 버튼에 대한 이벤트 처리
		btStop.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				String cmd = e.getActionCommand();
				setTitle(cmd + "누름");
				panel_1.setBackground(Color.orange);
				// 카운트 스레드와 이미지 스레드 중지
				if(trCount != null)
				{
//					trCount.stop(); // 안 쓰는 게 좋음 사살이라 자연사 하게 해야 함
					// 스레드가 sleep(), join() 등 블럭됐을 때
					// InterruptedException 발생
					trCount.interrupt();
					trCount = null;
				}
			}
		});
		
		// 시계 스레드 생성해서 동작
//		r1 = new ClockRunnable2(this);
//		trClock = new Thread(r1);
//		trClock.start();
		
		setSize(700, 400);
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	} // 생성자
	
	// 이미지 스레드
	class ImageThread extends Thread
	{
		public void run()
		{
			// sleep
			int i = 0;
			while(true)
			{
				if(i > 9)
				{
					i = 0;
				}
				// 반복문 돌면서 T0.gif ~ T9.gif의 ImageIcon객체 생성
				// lbImage.setIcon(이미지 아이콘 객체)
				ImageIcon icon = new ImageIcon("src/day12/T" + i + ".gif");
				lbImage.setIcon(icon);
				i++;
				try
				{
					Thread.sleep(100);
				}
				catch(InterruptedException e)
				{
					System.out.println("이미지 스레드 예외: " + e.getMessage());
				}
			}
		}
	} // inner class
	
	// inner class는 class 파일에 $가 붙음
	// 카운트 스레드 → inner class
	static class CountThread extends Thread
	{
		static int count = 500;
		
		public void run()
		{
			for(; count >= 0; count--)
			{
				lbCount.setText("카운트: " + count);
				try
				{
					Thread.sleep(1000); // 1초
				}
				catch(InterruptedException e)
				{
					System.out.println("예외: " + e.getMessage());
					return;
				}
			}
			JOptionPane.showMessageDialog(lbCount, "게임 종료");
		}
	}

	public static void main(String[] args)
	{
		new P1_1_MultiThreadGui();
	}
}