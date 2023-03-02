package Java_2023_02_28;

public class ClassA {
	public static void main(String[] args) {
		
		// 1. ClassB로 cb 인스턴스 생성 = 클래스명 인스턴스
		ClassB cb = new ClassB(); // 클래스를 생성하고 객체를 생성했다!
		
		// cb인스턴스로 print()함수 호출
		// 2. 인스턴스.함수()
		cb.print();
		
		ClassC cc = new ClassC();
//		cc.cc = "test";
//		System.out.println("get을 이용한 변수 호출 :"+cc.cc);

		
		cc.setCc("test");
		System.out.println("get을 이용한 변수 호출 :"+cc.getCc());
	}

	public void print() {
		System.out.println("여기는 ClassA");
	}

}

class ClassB {
	
	public ClassB() {
		System.out.println("ClassB의 생성자 입니다.");
	}

	void print() {
		System.out.println(" 여기는 클래스 B");
	}

}


class ClassC {
	
	int c;
	private String cc;
	
	public ClassC() {
		
	}
	
	
	
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}



	void print() {
		System.out.println(" 여기는 클래스 C");
	}
}