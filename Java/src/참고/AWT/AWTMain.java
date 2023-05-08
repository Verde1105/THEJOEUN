package 참고.AWT;

import java.util.Scanner;

public class AWTMain {

	public static void main(String[] args) {

		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		String id = "";
		String password = "";
		String[][] database = new String [10][4];
		String session[] = new String[3];
		
		new MainFrame(database, session);
		
	}

}
