package Java_2023_02_22.참고용;
public class Star {
	public static void main(String args[]) {
		별찍기();	
	}
	
	public static void 별찍기() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i +j == 5 || i == 0 | j == 5 | j <=5 | j<=3) {
					System.out.println("*");
				}
			}
			System.out.println();
		}
	}
}