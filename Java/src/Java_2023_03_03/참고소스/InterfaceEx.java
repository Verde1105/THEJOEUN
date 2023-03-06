package Java_2023_03_03.참고소스;
/*인터페이스(interface)
 * - 객체를 생성 할 수 없음.
 * - class 에서 상속시 implements keyword를 사용
 * - 다중 상속이 가능 함
 * - interface에는 상수와 추상 메서드만이 존재 함
 * - interface 간의 상속시에는 extends를 사용함
 * - 일반적인 메서드를 갖을 수 없음
 * - 상속시 interface에 있는 모든 메서드를 재정의하여 사용.
 * - interface에 정의된 메서드중 하나라도 재정의
 * 	 하지 않는다면 abstract class로 정의 할 수 있음.
 * 
 * 표현)
 * interface A{
 *  변수 : [final][static] -> 생략되어 있음.
 * 메서드 : [public][abstract] -> 생략되어 있음.
 * 
 * 사용1)
 * abstract class B implements A{    }
 * 
 * 2)
 * class C implements A{				}
 * 
 * 3)
 * class D extends C implements A{	}
 * class D extends C implements A, B, C, ... {	}
 */

interface InterfaceA {
	int A = 100;
	String method();
}
interface InterfaceB{
	int A = 10;
	int B = 10;
	void setA();
}
abstract class AbstractC{
	void setB() {
		System.out.println("B");
	}
}

public class InterfaceEx extends AbstractC 
	implements InterfaceA, InterfaceB{
	public String method() {
		return "Override method";
	}
	public void setA() {
		System.out.println("setA method...");
	}
	public static void main(String[] args) {
		InterfaceEx inter = new InterfaceEx();
		inter.setB();
		System.out.println("number : " + (B + InterfaceA.A));
		System.out.println("number : " + (InterfaceA.A + InterfaceB.A));
		System.out.println(inter.method());
		inter.setA();
	}
}
























