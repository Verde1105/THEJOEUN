package Java_2023_03_13;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IOEx5 {
	public static void main(String[] args) {
		File fi = new File("H:\\Github\\THEJOEUN\\Java\\src\\Java_2023_03_13//IO.txt");
		FileInputStream fis;
		int readByte;
		try {
			fis = new FileInputStream(fi);
			while (true) {
				readByte = fis.read();
				if(readByte == -1) {
					break;
				}
				System.out.println((char)readByte);
			}fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
