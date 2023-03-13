package Java_2023_03_13;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;


public class IOEx7 {
	
	public static void main(String[] args) throws IOException{
		File fi = new File("H:\\Github\\THEJOEUN\\Java\\src\\Java_2023_03_13//IO.txt");
		FileOutputStream fos = new FileOutputStream(fi);
		String str = "ABC";
		byte[] date = str.getBytes();
		for (int i = 0; i < date.length; i++) {
			fos.write(date[i]);
			
		}
		fos.close();
	}
}
