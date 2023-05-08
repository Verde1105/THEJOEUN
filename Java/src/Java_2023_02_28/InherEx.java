package Java_2023_02_28;

public class InherEx extends SuperClass{							// 상속 문법 자식클래스 - 부모클래스

		int a;
		String b;
		public InherEx() {
			super();												// super나 this는 최하위문으로 가선 안 된다
			System.out.println("InherEx");
		}
		public static void main(String args[]) {						//메인 메소드
			InherEx inher = new	InherEx();								//객체 생성
			inher.a = 10;
			inher.b = "A";
			inher.c = 100;					// 부모 것도 내 것 처럼 사용하고 있음 (아래 슈퍼클래서 c,d 참고)
			inher.d = "B";
		}
}

class SuperClass{
	
	int c;
	String d;
	SuperClass (int a){
		System.out.println("SuperClass" + a);
	}
	public SuperClass() {
		System.out.println("SuperClass");
	}
}