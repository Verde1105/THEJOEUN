package Java_2023_02_22;

import java.util.Scanner;

/*
 * 반복문(for)
 * 표현)
 * for(변수선언 (초기화); 조건식; 증가혹은 감소수식){
 * 실행구문;
 * }
 * 
 * 표현)
 * 	for(변수 선언 (초기화); 조건식; 증가 혹은 감소 수식){
 * 		실행 구문 1;
 * 		for (변수 선언 (초기화) 조건식; 증가 혹은 감소 수식){
 *		 실행 구문2;
 * }
 * }
 */
public class ForEx {
	public static void main(String[] args) {
		
		for (int a = 2; a < 10; a++) {
			System.out.println("구구단을 외자!" + a + "단!");
			for (int a1 = 1; a1 < 10; a1++) {
				System.out.println(a+"곱하기"+a1+"는"+a * a1);
			}
		}
		
		/*
		for (int i = 0; i < 2; i++) {
			System.out.println("실행구문 i : " + i);
		}
		System.out.println("/////////////");
		for (int i = 0; i < 2; i++) {
			System.out.println("실행구문 i : " + i);
		}
		for (int j = 0; j < 3; j++) {
			System.out.println("실행구문 j : " + j);
		}
		*/
		
		//이하 주의 복습
		System.out.println("////////");
		System.out.println("단입력");
		/*
			Scanner scan = new Scanner(System.in);
			int dan = scan.nextInt();
		*/
		
		int dan = new java.util.Scanner(System.in).nextInt();
		for(int i =2; i<10; i++) {
			System.out.println(dan + " * " + i + "=" + (dan *i));
		}
		for(int j = 1; j <10; j++) {
		for(int i =2; i<10; i++) {
				System.out.print(i + "*" +j + "=" + (i*j) + "\t");
			}
				System.out.println();
		}
		
	}
}
