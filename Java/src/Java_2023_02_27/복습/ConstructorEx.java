package Java_2023_02_27.복습;

// Main메소드에서는 클래스로 사용하지 않음
public class ConstructorEx {
	int a;
	String b;
	int c;
	
//	기본 생성자를 정의 해야 할 경우
	ConstructorEx(){// 기본 생성자 
		/*
		 * 기본 생성자는 만들지 않아도 됨
		 * 기본 생성자를 재정의(다른걸로 만들고 싶을 때)하는 경우
		 * 기본 생성자를 재정의 
		 */
	}
	ConstructorEx(int a){// 생성자의 오버로딩
		this.a = a;		// 조건 1. 매계변수가 달라야한다.
	}
	ConstructorEx(String b){// 생성자의 오버로딩
		this.b = b;		// 조건 2. 매계변수의 타입이 달라야한다.
	}
	ConstructorEx(String b, int c){// 생성자의 오버로딩
		this.b = b ;	// 조건 3. 매계변수의 갯수가 달라야한다.
	}
	ConstructorEx(int b, int c){// 생성자의 오버로딩
		this.a = b;		// 조건 4. 매계변수의 타입과 갯수가 달라야한다.
		this.a = c;
	}
}
