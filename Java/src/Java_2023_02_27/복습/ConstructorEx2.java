package Java_2023_02_27.복습;

public class ConstructorEx2 {
	ConstructorEx2(){
		this(100);
	}
	ConstructorEx2(int a){
		System.out.println(a);
	}
	ConstructorEx2(int a, String b){
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[]args) {
		ConstructorEx2 obj = new ConstructorEx2();
	}
}
//