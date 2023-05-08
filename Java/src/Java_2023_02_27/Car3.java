package Java_2023_02_27;

public class Car3 {// 클래스명 아래와 중복
	public static void main(String args[]) {// 프로그램이 실행되는 장소
		Car4 myCar = new Car4();
		myCar.display();
		
		
		// 매계변수 = 파라미터
		// 인자값 = 아규먼트
		
		// The constructor Car4(String, int) is undefined
		// 생성자 Car4(String, int)가 정의되지 않았습니다.
		// 생성자 Car4(String, int)가 없다.
		Car4 myCar2 = new Car4("그랜저",4); 
		myCar2.setSpeed(300);
		myCar2.display();
		
		Car4 myCar3 = new Car4("에쿠스", 500, 4);
		myCar3.display();
		myCar3.display("티코", 100, 4); //문제
		
		Car4 myCar4 = new Car4("포르쉐", 600, 4, true);
		Car4 myCar5 = new Car4("포르쉐","Red");
	}

}
class Car4{// 클래스명 중복때문에 발생하는 에러
	int wheel;
	int speed;
	String name;
	boolean check;
	String color;
	
	// 생성자 != 함수
	// 클래스와 이름이 같다.
	// 리턴타입이 없다. >> int car() x
	public Car4() {
		name = "GV80";
		// Type mismatch: cannot convert from String to int
		// 유형 불일치: String에서 int로 변환할 수 없습니다.
		speed = 200; 
		wheel = 4;
	}
	
	// 파라미터를 사용하는 이유 > 파라미터를 받아야 하니까
	public Car4(String name, int wheel){
		this.name = name;
		this.wheel = wheel;
	}
	
	// 생산공장?
	public Car4(String name, int wheel, int speed){
		this.name = name;
		this.wheel = wheel;
		this.speed = speed;
	}
	
	// 생산공장?
	public Car4(String name, int wheel, int speed, boolean check){
		this.name = name;
		this.wheel = wheel;
		this.speed = speed;
		this.check = check;
	}
	
	public Car4(String name, String color){
		System.out.println("name :"+name);
		System.out.println("color :"+color);
		this.name = name;
		this.color = color;
	}
	// 인스턴스를 이용해 값을 저장하는 함수
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// 인스턴스를 이용해 값을 호출하는 함수
	public int getSpeed() {
		return this.speed;
	}
	
	public void display() {
		System.out.println("차이름 : " + name + " 최대속도 : " + speed + "바퀴수 : " + wheel);
		
	}
	
	public void display(String name, int speed, int weel) {
		System.out.println("차이름 : " + this.name + " 최대속도 : " + this.speed + "바퀴수 : " + wheel);
	}
}
