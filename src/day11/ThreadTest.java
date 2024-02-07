package day11;

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException{
		//스레드 2개 생성
		//동작시킬 때는 run()이 아니라 start()호출해야 함
		SnailThread1 tr1 = new SnailThread1("똘똘이 달팽이");
		SnailThread2 tr2 = new SnailThread2("거꾸로 달팽이");
		//UNIX에서는 먹는데 Windows에서는 안먹는다
		tr1.setPriority(10); //높은 우선순위
		tr2.setPriority(3); //낮은 우선순위
		
		//tr1.run();//[x]
		tr1.start();
		tr2.start();
		
		tr1.join(); //InterruptedException
		//tr1이 작업을 마칠 때까지 join()호출 한 스레드는 block 상태가 된다.
		//오히려 처음에 출력됨 ==> main 스레드가 먼저 호출돼서
		System.out.println("Hello World~");
		Thread tr3 = Thread.currentThread();
		System.out.println(tr3.getName()+"스레드가 실행 중");
	}

}
