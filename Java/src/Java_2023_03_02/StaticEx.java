package Java_2023_03_02;

/*
 * 기타 제어자(수정자)
형식 )
final :
	-class : 상속이 안됨
	-method : 재사용이 안됨
	-variable : 상수화
static : 
	-객체 생성 없이 사용가능(정적 메모리에 생성)
abstract //모호한 클래스를 만들기 위한 것. > 어지간한 비슷한거 다 담자.(클래스랑 보이드 앞에 넣어서 만듦)
	-class : 추상 클래스
	-method : 추상 메소드
	*객체 생성 불가능
	[수정자][접근지정자]
*/

public class StaticEx {
	public final int A = 10;
	static int b = 10;
	public static void main(String args[]) {
		StaticEx obj = new StaticEx();
		System.out.println(obj.A);
		System.out.println(StaticEx.b);
	}
}
// 예시
abstract class Animal{
	int age;
	String name;
	abstract void bark();
	void method() {
	}
}
