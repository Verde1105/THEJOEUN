package Java_2023_02_23;

public class ForEx2 {
	public static void main(String[] args) {
		int dan = 0;
		System.out.println("\n전체 구구단 출력");
		for(int su = 1; su < 10; su++) {
			for (dan =2; dan<10; dan++) {
				System.out.println(dan + "*" + su + "=" + (dan*su) + "\t");
			}
			System.out.println();
		}
	}
}
