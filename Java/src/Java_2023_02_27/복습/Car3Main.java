package Java_2023_02_27.복습;

public class Car3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car3 myCar = new Car3();
		myCar.display();
		Car3 myCar2 = new Car3("그랜저",4);
		myCar2.setSpeed(300);
		myCar2.display();
		Car3 myCar3 = new Car3("에쿠스", 500, 4);
		myCar3.display();
		myCar3.display("티코", 100, 4); //문제
	}

}
