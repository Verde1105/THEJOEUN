import java.util.Scanner;

public class Gugudan {
//	Q.(전체 혹은 단일, 자유)구구단을 만들고 답을 배열에 넣으시오
	public static void main(String[] args){
		int[] a = new int[9];
		int b = 0;
		// 세로 구구단
		for (int i = 2; i < 10; i++) {		// 단	
//			for (int j = 1; j <2;j++) {
			for (int j = 1; j <10;j++) {	// 2 ~ 9
				b = i*j;
				System.out.println(i + " X " + j + " = " + b);
			}
//			System.out.println(b);
			System.out.println();
		}
//		System.out.println(a);
		
		/* 가로 구구단 */
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j+" x "+i+" = " + i*j + "\t");
			}
			System.out.println();
		}
		
		System.out.print("입력할 단 입력 : ");
		int dan = new Scanner(System.in).nextInt();
		for (int j = 1; j <10;j++) {	// 1 ~ 9
			b = dan*j;
			System.out.println(dan + " X " + j + " = " + b);
			a[j - 1] = b; // 배열의 주소 = j-1
		}
		System.out.println("입력한 단 배열로 출력");
		for (int j = 1; j <10;j++) {	// 2 ~ 9
			System.out.println(a[j-1]);
		}
	}
}
