package Java_2023_03_08;

public class 별찍기 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print("[ ]");
				/*if (i%7==0) {
					System.out.println();
				}*/
				if (i>=j) {
//					System.out.println("[*]");
				}
			}
			System.out.println();
		}
	}
}
