package day07.inheritance;

public class Aquaman extends Human {
	double speed;
	
	public Aquaman() {
		this("물남자", 188, 10);
	}
	public Aquaman(String name, int height, double speed) {
		this.name=name;
		this.height=height;
		this.speed=speed;
	}
	//annotation
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("속 력: "+speed);
	}
}
