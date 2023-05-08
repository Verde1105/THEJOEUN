

	interface Interface {}
	class parent implements Interface {}
	class Child extends parent {}
	public class InstanceOfEx {
		public static void main(String args[]) {
			Child child = new Child();
			if(child instanceof Interface) {
				System.out.println("child is instance ofInterface.");
			}
			if(child instanceof Object) {
				System.out.println("child is instance Object.");
			}
			if(child instanceof Parent) {
				System.out.println("child is instance Parent.");
			}
			if(child instanceof Child) {
				System.out.println("child is instance Child.");
			}
			System.out.println();
			//잘못사용한 예
			if(child instanceof Interface) {
				System.out.println("child is instance ofInterface.");
			}
			else if(child instanceof Object) {
				System.out.println("child is instance Object.");
			}
			else if(child instanceof Parent) {
				System.out.println("child is instance Parent.");
			}
			else if(child instanceof Child) {
				System.out.println("child is instance Child.");
		}
	}
}
