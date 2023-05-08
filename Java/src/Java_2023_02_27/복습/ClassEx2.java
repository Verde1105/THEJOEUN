package Java_2023_02_27.복습;

public class ClassEx2 {
	public static void main(String args[]) {
		A obj1 = new A();
		B obj2 = new B();
		System.out.print("고객이름 : ");
		System.out.println(obj1.name);
		System.out.print("고객나이 : ");
		System.out.println(obj1.age);
		System.out.print("고객이름 : ");
		System.out.println(obj2.name);
		System.out.print("고객나이 : ");
		System.out.println(obj2.age);
//		코드작성하시오.
//		고객1 나이, 고객2 이름,나이 출력
	}
}
class A{
	int age = 10;
	String name = "홍길동";
}
class B {
	int age = 20;
	String name = "개똥이";
	
}