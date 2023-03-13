package Java_2023_03_13;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx8 {
	public static void main(String[] args) throws IOException{
		File fi = new File("H:\\Github\\THEJOEUN\\Java\\src\\Java_2023_03_13//IO.txt");
		FileOutputStream fos = new FileOutputStream(fi);
		System.out.println("입력 : ");
		int output = 0;
		while (output != -1) {
			output = System.in.read();
					fos.write(output);
		}
		fos.close();
	}
}
