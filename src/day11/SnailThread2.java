package day11;

// 100부터 시작해서 1씩 감소하는 달팽이 스레드
public class SnailThread2 extends Thread {

	public SnailThread2(String name) {
		this.setName(name);// 스레드 이름 설정
	}

	@Override
	public void run() {
		// 스레드가 할 일을 구현
		for (int x = 100; x > 0; x--) {
			System.out.println(getName() + "가 뒤로 기어감: " + x);
			// sleep()호출
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				System.out.println("예외: " + e.getMessage());
				e.printStackTrace();
			} // 1초 동안 block상태가 된다.
		}//for
	}//run
}
