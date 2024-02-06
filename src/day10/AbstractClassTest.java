package day10;

public class AbstractClassTest {

	public static void main(String[] args) {
		System.out.println("여러 도형의 면적을 구해봅시다~");
		System.out.printf("가로: %d, 세로 %d인 도형 면적\n", 12,10);
		//사각형 객체 생성해서 area()
		Rectangle rt = new Rectangle();
		rt.area(12,10);
		//직삼각형 생성해서 area()
		Triangle ta = new Triangle();
		ta.area(12, 10);
		System.out.printf("반지름: %d인 원 면적\n", 12);
		//원 생성해서 area()
//		Circle cr = new Circle(); [x]
//		Shape sp =new Shape();
		//추상클래스는 타입선언은 할 수 있으나 객체 생성은 할 수 없다
		Circle cr = new SubCircle();
//		cr.area(12);// [x]
		((SubCircle)cr).area(12);
		SubCircle cr2 = new SubCircle();
		cr2.area(12);// [o]
		
		//Shape sp = new Shape();//[x]
		Shape sp=new Rectangle();
		sp.area(8, 10);
		
		System.out.println(cr.toString().contains("Circle"));
		//rt, tr, cr, cr2, sp를 저장할 배열을 생성하고
		//저장한 후 반복문 돌려서 각 도형의 면적을 출력하기
		//가로:20, 세로 : 30
		//반지름: 20
		System.out.println("--------------");
		Shape[] shArr = {rt, ta, cr, cr2, sp};
		for(Shape i:shArr) {
//			if(i.toString().contains("Circle")) {// 내가 한 코드
			if(i instanceof SubCircle) {
				((SubCircle)i).area(20);
			}else {
			i.area(20, 30);
			}
			
		}
		
	}

}
