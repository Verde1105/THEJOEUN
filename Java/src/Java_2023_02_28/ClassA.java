package Java_2023_02_28;

public class ClassA {
	public static void main(String[] args) {
		ClassB cb = new ClassB(); // 클래스를 생성하고 객체를 생성했다!
		cb.print();
	}

	public void print() {
		System.out.println("여기는 ClassA");
	}

}

class ClassB {
	void print() {
		System.out.println(" 여기는 클래스 B");
	}

}
