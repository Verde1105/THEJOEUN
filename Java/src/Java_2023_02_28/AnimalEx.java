package Java_2023_02_28;


//클래스 예제

public class AnimalEx {
		int age;
		String name;
		public void bark() {
			System.out.println("꿀꿀~");
		}
		public void setAge(int age) {
			this.age = age;
		}
		public void setName(String name) {
			this.name = name;
		}
		public static void main(String args[]) {
			AnimalEx animal = new AnimalEx();
			animal.setAge(10);
			animal.setName("돼지");
			System.out.println(animal.name + "의 나이는 " + animal.age);
			animal.bark();
		}
}
