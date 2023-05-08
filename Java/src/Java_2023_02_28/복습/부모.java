package Java_2023_02_28.복습;

public class 부모 {
	
	// 속성
	int a;
	String b;
	
	// 기능
	public void testA() {
		System.out.println("부모의 A함수");
	}
	
	// 메소드 오버라이딩
	public void 고장난함수() {
		int result = 1 + 1;
		System.out.println("1 + 1 = 3");
	}
	
//	public void 유언() {
//		System.out.println("나의 꿈을 네가 이루어 다오.");
//	}
	
	public 부모() {
		super();
		System.out.println("부모의 생성자 호출!");
	}
}