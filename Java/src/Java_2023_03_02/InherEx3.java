package Java_2023_03_02;

import javax.print.DocFlavor.STRING;

class C{
	public C() {
		System.out.println("Constructor C");
	}
	int num =10;
	String msg = " msg...";
	public void method() {
		System.out.println("method" + num);
	}
	public void method_C() {
		System.out.println("method_C" + msg);
	}
}

class B extends C{
	public B() {
		super();
		System.out.println("Constructor B");
	}
	int num = 50;
	
	public void method() {
		super.method_C();
		this.method_C();
		System.out.println("method" + num);
	}
	public void method_B() {
		System.out.println("method_B" + num);
		
	}
}

//B에 대한 subclass A
class A extends B{
	public A() {
//		super().super();
		System.out.println("Constructor A");
	}
	public void method() {
//		System.out.println("method" + super.super.num);
	}
	public void method_A() {
		System.out.println("method_A" + msg);
		
	}
}
	
//C에 대한 subclass B
//A에 대한 subclass
public class InherEx3 {

		public static void main(String args[]) {
			A a = new A();
			B b = a;
			C c = b;
			a.method();
			a.method_A();
			a.method_B();
			a.method_C();//ㄹㅇ 상속 유전형질같은거구만
			System.out.println(a.num);//더 가까운걸 찾기때문에 부모라인에 데이터가 있으면 조부모 라인까지 안감.
		}

}
