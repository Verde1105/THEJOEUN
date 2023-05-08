package 복습용.연습용20230226;

import Java_2023_02_24.mission.source.A1_회원가입;

public class Magic {

	public static void main(String[] args) {
		//인스턴스 생성하기
		// 클래스명 인스턴스명 = new 생성자();
		//A1_회원가입 회원가입_instance 	= new A1_회원가입();
		Car car = new Car();
		Car.앞으로이동();
		
		Car.앞으로이동();
		
		//생성자 2를 이용하여 인스턴스를 만들것.
		Car car2 = new Car("현대");
		System.out.println(car2.클래스의속성_자동차종류);
	}

}
