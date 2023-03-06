
//public class InterfaceEx {
	/*인터페이스(Interface)
	-객체를 생성 할 수 있음.
	class에서 상속시 implements keyword를 사용
	다중 상속이 가능 함
	Interface에는 상수와 추상 메소드만이 존재 함
	Interface 간의 상속시에는 extends를 사용함
	일반적인 메소드를 갖을 수 없음
	상속시 Interface에 있는 모든 메소드를 재정의하여 사용
	Interface에 정의된 메소드 중 하나라도 재정의하지 않는다면 abstract class로 정의 할 수 있음.
	표현)
	Interface A{
	변수 : [final][static] -> 생략되어 있음.
	}
	메소드 : [public][abstract] -> 생략되어 있음.
	ex) void method();
	 
	사용1)
	abstract class B implements A{
		추상 메소드 정의
		일반적인 메소드 정의
	}
	사용2)
	class C implements A{
		인터페이스에 존재하는 메소드 재정의
	}
	사용3)
	class D extends C implements A{}
	class D extends C implements A,B,C...{}
	 */
//}
	
	
	Interface InterfaceA{
		int B = 100;
		String method();
	}
	Interface InterfaceB{
		int B =10;
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
		public static void main(String args[]) {
			InterfaceEx inter = new InterfaceEx();
			inter.setB();
			System.out.println("number : " + (B+A));
			System.out.println(Inter.method());
			inter.setB();
			//A = 50; 상수
			//B = 50; 상수
			
		}
	}
		

