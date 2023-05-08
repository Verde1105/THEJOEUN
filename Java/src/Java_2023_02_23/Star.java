package Java_2023_02_23;
public class Star {
	public static void main(String args[]) {
		star();
		star1();
	}// The end of main

	public static void star() {
		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j <= i; ++j) {
				if (i +j == 5 || i == 0 || j == 5 || j <=5 || j<=3) {
					System.out.print("[ * ]");
				}else {
					System.out.print("[   ]");
				}
			}
			System.out.println("");
		}
		System.out.println("\n");
	}// The end of method
	
	public static void star1() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i >= j) {
					System.out.print("["+i+","+j+"]");
				}else {
					System.out.print("[   ]");
				}
			}
			System.out.println("");
		}// The end of for
		System.out.println("\n");
	}// The end of method
}