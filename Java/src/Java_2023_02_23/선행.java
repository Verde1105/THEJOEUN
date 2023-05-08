package Java_2023_02_23;

public class 선행 {
	
	// Main Method : 처음으로 프로그램이 시작, 단 1개만 존재
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		void함수();
//		int함수();
		
		System.out.println("===========");
//		System.out.println(int함수()+10);
		
//		System.out.println(string함수("사과"));
//		int 파라미터 = 55;
//		System.out.println(int함수(파라미터)); 	// 파라미터 : 변수를 이용
//		System.out.println(int함수(55)); 		// argument : 데이터를 직접 이용
	
		int 파라미터1 = 1;
		int 파라미터2 = 2;
		
		// 덧셈 기능이 있는 계산기 함수
		System.out.println(더하꾸(파라미터1, 파라미터2));
		
	}
	
	// 받는것 없이 return없는 함수
	public static void void함수() {
		System.out.println("return이 없는 함수");
	}
	
	// 받는것 없이 return하는 함수 String
	public static String string함수() {
		System.out.println("return이 있는 함수");
		return "리턴값";
	}
	
	// 받는것 없이 return하는 함수 int
	public static int int함수() {
		System.out.println("return이 있는 함수");
		return 255;
	}

	// 메소드 오버로딩
	// 받는것 있는 return하는 함수 String
	public static String string함수(String a) {
		System.out.println("return이 있는 함수");
		return a;
	}
	// 메소드 오버로딩
	// 받는것 있는 return하는 함수 int
	public static int int함수(int a) {
		System.out.println("return이 있는 함수");
		return 255;
	}
	
	// 덧셈 기능이 있는 함수 1 + 2 = 3
	public static int 더하꾸(int a, int b) {
		int 결과값 = 0;
		결과값 = a + b;
		return 결과값;
	}
}
