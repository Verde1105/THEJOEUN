package Java_2023_03_08;

public class IndexOfEx {
	public static void main(String[] args) {
		String subject = "자바 프로그램";
		int location = subject.indexOf("프로그래밍");
				System.out.println(location);
				if (subject.indexOf("자바") !=-1) {
					System.out.println( "자바와 관련된 책이군요");
				}else {
					System.out.println("자바와 관련없는 책이군요");
				}
	}
}
