package Java_2023_03_02.복습;

import java.util.Scanner;

public class 구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[9];
		
		int 선택 = new Scanner(System.in).nextInt();
		// 1. 2단 - 9단까지 돌릴 for문
	
		// 2. 단에서 1 - 9까지 곱하기할 for문 
		for (int j = 1; j < 10; j++) {
			arr[j-1] = 선택*j;
		}
		
		// 3. 출력
		for (int j = 1; j < 10; j++) {
			System.out.println(arr[j-1]);
		}
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[5]);
		System.out.println(arr[6]);
		System.out.println(arr[7]);
		System.out.println(arr[8]);
		System.out.println(arr[9]);
	}

}
