package Java_2023_02_21.app;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("배운내용 선택 : ");
		int select = scan.nextInt();
		
		if (select == 1) {
			castEx();
		}else if(select == 2) {
			commentEx();
		}
	}
	
	public static void castEx() {
		/*
		 * 꾸릇
		 * 10진법 (0과 9로 이루어짐)1 2 3 4 5 6 7 8 9 10
		 * bit = 2진법(0과 1로 이루어짐) 0 1 10 11 100 101 110 111 1000 1001 1010	
		 * 8bit : [][][][][][][][] = 2의 8승 128
		 */
		byte byte1 = 127;
		short short1;
		char char1 =127;
		int int1;
		float float1;
		long long1;
		double double1;
		// <<==
		short1 	= byte1; 	// byte(8 bits)		=> short(16 bits)
		int1 	= short1; 	// short(16bits)	=> int(32bits)
		int1 	= char1; 	// char(16 bits)	=> int(32bits)
		long1 	= int1; 	// int(32 bits)		=> long(64bits)
		float1 	= int1; 	// int(32 bits)		=> float(32bits)
		double1	= long1; 	// long(64 bits)	=> double(64 bits)
		
		System.out.println("short : " + short1);
		System.out.println("int : " + int1);
		System.out.println("long : " + long1);
		System.out.println("float : " + float1);
		System.out.println("doblue : " + double1);
		
		int 오른쪽=99;
		int 왼쪽 = 0;
		왼쪽 = 오른쪽;
		System.out.println(왼쪽);
		
		long su1 = 10;
		int su2 = (int) su1;
		System.out.println("result : " + su2);
	}
	
	public static void commentEx() {
		int a;
		a =10;
		System.out.println(a);
		a =20;
		System.out.println(a);
		String b;
		b = "자바테스트";
	}
	
	
}
