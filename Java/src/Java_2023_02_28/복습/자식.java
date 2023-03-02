package Java_2023_02_28.복습;

public class 자식 extends 부모{

	int c;
	public void testB() {
		System.out.println("자식의 B함수");
	}
	
	// 메소드 오버라이딩
	@Override
	public void 고장난함수() {
		int result = 1 + 1;
		System.out.println("1 + 1 = "+result);
	}
}
