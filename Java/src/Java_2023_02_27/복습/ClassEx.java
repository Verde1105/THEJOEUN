package Java_2023_02_27.복습;

public class ClassEx {
	int a; // 클래스변수, 전역변수
	public static void main(String args[]) {
		int a; // 지역변수 = 로컬변수
		Member m = new Member();
		Member m2 = new Member();
		if (m == m2) {
			System.out.println("m객체와 m2객체는 같다.");
		}else {
			System.out.println("m객체와 m2객체는 같지 않다.");
		}
	//		비교1
		ClassEx c = new ClassEx();
		ClassEx c2 = new ClassEx();
	//		비교2
	}
}
class Member{
}// 괄호 확인
