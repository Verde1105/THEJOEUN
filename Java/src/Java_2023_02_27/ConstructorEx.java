package Java_2023_02_27;

// Main메소드에서는 클래스로 사용하지 않음
public class ConstructorEx {
	int a;
	int b;
//	기본 생성자를 정의 해야 할 경우
	ConstructorEx(){
		a = b;
	}
	ConstructorEx(int a){
		this.a = a ;
	}
	ConstructorEx(String b){
		b=b;
	}
	ConstructorEx(int b, int c){
		a = b ;
	}
	ConstructorEx(int b, int c){
		a = b ;
	}
	ConstructorEx(int b, int c){
		a = c;
	}
}
