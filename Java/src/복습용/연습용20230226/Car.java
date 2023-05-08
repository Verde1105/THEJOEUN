package 복습용.연습용20230226;

public class Car {
	
	/* 1. 속성 (값만,인터페이스)*/
	//자동차 이름 : 트렉터
	String 클래스의속성_자동차종류; 
	//자동차 색 : 파랑
	String color;
	//타이어 종류 : 
	String tire;
	//메이커 : 현대
	String maker;
	//자동차 속도
	int speed;
	//변속값
	int gear;
	//4륜
	String num;
	
	/* 3. 생성자 */
	//함수, 리턴이 없다. 보이드지만 보이드 표시는 없음.
	//무언가를 생성한다.
	//클래스 명과 이름이 똑같다.
	public Car() { // 생성자1
	}
	public Car(String 자동차종류) {// 생성자2
		this.클래스의속성_자동차종류 = 자동차종류;
	}
	
	/* 2. 기능 (움직이는것, 동작)*/
	//앞으로 이동
	public static void 앞으로이동() {
		System.out.println("앞으로 이동 합니다.");
	}
	//뒤로 이동 
	public static void 뒤로이동() {
		System.out.println("뒤로 이동 합니다.");
	}
	//좌로 이동
	public static void 좌로이동() {
		System.out.println("좌로 이동합니다.");
	}
	//우로 이동
	public static void 우로이동() {
		System.out.println("우로 이동 합니다.");
	}
	//브레이크 기능
	public static void 브레이크() {
		System.out.println("제동합니다.");
	}
	//엑셀 기능	
	public static void 엑셀() {
		System.out.println("가속합니다.");
	}
	//에어컨
	public static void 에어컨() {
		System.out.println("에어컨 작동합니다.");
	}
	
}
