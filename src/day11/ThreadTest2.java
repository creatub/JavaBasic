package day11;

public class ThreadTest2 {

	public static void main(String[] args) {
		//시계를 동작시켜보세요.
		ClockRunnable2 cr = new ClockRunnable2();
		Thread tr = new Thread(cr);
		tr.start();
	}

}
