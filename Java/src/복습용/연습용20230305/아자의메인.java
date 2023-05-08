package 복습용.연습용20230305;

import java.util.Scanner;

public class 아자의메인 {
	public static void main(String[] args) {
		아자 d = new 아자();

		Scanner s = new Scanner(System.in);
		System.out.println("아이디를 입력하시오.");
		String id = s.nextLine();
		System.out.println("패스워드를 입력하시오.");
		String ps = s.nextLine();
		
		d.set비번(ps);
		d.get아이디(id);
		d.get잔고(0);
	}
}
