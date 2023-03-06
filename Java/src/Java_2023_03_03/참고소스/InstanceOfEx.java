package Java_2023_03_03.참고소스;

interface Interface {	}
class Parent implements Interface {	}
class Child extends Parent { 	}
public class InstanceOfEx {
	public static void main(String[] args) {
		Child child = new Child();
		if(child instanceof Interface) {
			System.out.println("child is instance of Interface.");
		}
		if (child instanceof Object) {
			System.out.println("child is instance of Object.");			
		}
		if (child instanceof Parent) {
			System.out.println("child is instance of Parent.");			
		}
		if (child instanceof Child) {
			System.out.println("child is instance of Child.");			
		}
		System.out.println();
	}
}
