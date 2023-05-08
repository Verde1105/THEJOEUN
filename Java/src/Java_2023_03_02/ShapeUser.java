package Java_2023_03_02;

public class ShapeUser {

	public static void main(String args[]) {
		Shape[] Shape = new Shape[3];
		Shape[0] = new Circle(5);
		Shape[1] = new Circle(7);
		Shape[2] = new Rect(9,5);
		System.out.println("Shape[0]'s area = " + Shape[0].area());
		System.out.println("Shape[1]'s area = " + Shape[1].area());
		System.out.println("Shape[2]'s area = " + Shape[2].area());
		
		//	Quize2. 도형들 둘레구하기
		//	(1). 사각
		Rect r = new Rect(3,4);
//		r.setSize(3, 4);
		System.out.println("r.getSize() : "+r.getSize());

		//	(2). 원
		Circle c = new Circle(7);
		System.out.println(c.circumference());
	}
}
