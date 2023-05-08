package Java_2023_02_21.app;

public class DataType {
	/*
	 * 자료형(Data Type) -변수 또는 상수가 차지하는 메모리의 양(byte)과 종류를 의미한다. -자바의 자료형은 크게 기본 자료형과
	 * 참조형으로 나눌 수있다. 1) 기본형 -boolean(true, false) : 8bit(1바이트) -byte : 8비트(1바이트)
	 * -short : 16비트 -int :32비트 -long :64비트 -float : 32비트 -double : 64비트 2)참조형
	 * -클래스(class) string 포함 -배열(array) -인터페이스(interface) -열거(anum)
	 */
	public static void main(String args[]) {
		byte byte1 = 127;
		short short1 = 10000;
		char char1 = '한';
		int int1 = 1000000000;
		long long1 = 1000000000000000000L;// L이 붙르면 롱
		float float1 = 0.1f;// 대소문자 상관 없
		double double1 = 1.0d;// 대소문자 상관 없
		boolean boolean1 = false; // or true
		System.out.println("byte : " + byte1);
		System.out.println("short : " + short1);
		System.out.println("char : " + char1);
		System.out.println("int : " + int1);
		System.out.println("long : " + long1);
		System.out.println("float : " + float1);
		System.out.println("double : " + double1);
		System.out.println("boolean : " + boolean1);
		
		String str = "문자열 값";

		// int1 = 1;
		long1 = int1; // 자동형변환 작은족에서 큰쪽으로 변환

		long a = 10;
		int b = 20;

		a = b;
		b = (int) a;
		System.out.println(a);
		System.out.println(b);

	}
}
