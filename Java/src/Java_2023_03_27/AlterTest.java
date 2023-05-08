package Java_2023_03_27;

import java.util.Scanner;

public class AlterTest {

	public static String Update() {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제 할 아이디를 입력해주세요.");
		System.out.print(">>");
		String Update = sc.next();
		String up = "delete from joindata j where j.name = " + "('"+delete+"')";
		up += "delete from plan p where p.name =" + "('"+delete+"')";
		return up;
	}

	public static String transaction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제 할 아이디를 입력해주세요.");
		System.out.print(">>");
		String transaction = sc.next();
		String tran = "delete from joindata j where j.name = " + "('"+delete+"')";
		tran += "delete from plan p where p.name =" + "('"+delete+"')";
		return tran;
	}
	
	public static String delete() {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제 할 아이디를 입력해주세요.");
		System.out.print(">>");
		String delete = sc.next();
		String de = "delete from joindata where name = " + "('"+delete+"')";
		de += "delete from plan where name =" + "('"+delete+"')";
		return de;
	}
}
