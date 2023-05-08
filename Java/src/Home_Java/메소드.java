package Home_Java;

public class 메소드 {

		//메소드정의
	public static void 인사() {
		System.out.println("안녕하세요 메소드입니다.");
	}
	public static void main(String[] args) {
		//메소드 호출
		System.out.println("메소드 호출 전");
		인사();
		인사();
		인사();
		System.out.println("메소드 호출 후");
		
	}
		
}
