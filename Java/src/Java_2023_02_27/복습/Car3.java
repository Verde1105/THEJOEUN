package Java_2023_02_27.복습;

class Car3{// 클래스명 중복때문에 발생하는 에러
	int wheel;
	int speed;
	String name;
	
	public Car3() {
		this.name = "GV80";
		this.speed = 200;
		this.wheel = 4;
	}
	
	public Car3(String name, int wheel) {
		super();
		this.name = name;
		this.wheel = wheel;
	}
	
	public Car3(String name, int speed, int wheel) {
		super();
		this.name = name;
		this.speed = 200;
		this.wheel = wheel;
	}
	
	
	public int setSpeed(int speed) {
		return this.speed = speed;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void display() {
		System.out.println("차이름 : " + name + "최대속도 : " + speed + "바퀴수 : " + wheel);
		
	}
	
	public void display(String name, int speed, int weel) {
		System.out.println("차이름 : " + this.name + "최대속도 : " + this.speed + "바퀴수 : " + wheel);
	}



}
