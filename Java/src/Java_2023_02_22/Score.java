package Java_2023_02_22;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		
		System.out.println("점수를 입혁하세요");
		int score = new Scanner(System.in).nextInt();
		if(score > 0 && score <= 10) {
			System.out.println();
		}
	}
}
