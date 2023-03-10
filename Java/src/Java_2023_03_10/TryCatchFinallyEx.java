package Java_2023_03_10;

public class TryCatchFinallyEx {
	public static void main(String[] args) {
		System.out.println("실행 1");
		try {
			System.out.println("실행2");
			Class clazz = Class.forName("java.lang.String");
			System.out.println("실행3");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}finally {
			System.out.println("실행4");
		}
		System.out.println("실행5");
	}
}
