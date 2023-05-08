package Java_2023_02_28;


//클래스 예제
public class AnimalEx {
	
	// 변수 선언
	int age;		// 나이
	String name;	// 이름
	
	// 동물 울음소리 함수
	public void bark() {
		System.out.println("꿀꿀~");
	}
	public void bark(int count) {
		for (int i = 0; i < count; i++) {
			System.out.println("꿀꿀~");
		}
	}
	
	// 나이 저장 함수
	// 나이를 받아서 age변수에 저장
	public void setAge(int age) {
		System.out.println("int age : "+age);
		this.age = age;
	}
	
	// 이름 저장 함수
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String args[]) {
		AnimalEx animal = new AnimalEx();
		animal.setAge(10);
		animal.setName("돼지");
		System.out.println(animal.name + "의 나이는 " + animal.age);
//		animal.bark(10);
		animal.bark();
	}
}
