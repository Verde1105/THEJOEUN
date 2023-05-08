package Java_2023_03_13;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class IOEx6 {
	public static void main(String[] args) throws IOException{
		File fi = new File("H:\\Github\\THEJOEUN\\Java\\src\\Java_2023_03_13//IO.txt");
		InputStream is = new FileInputStream(fi);
		int redeByteNo;
		byte[] redeBytes = new byte[2];
		String data = "";
		while (true) {
			redeByteNo = is.read(redeBytes);
			if (redeByteNo == -1) {
				break;
			}
			data +=new String(redeBytes, 0, redeByteNo);
		}
		System.out.println(data);
		is.close();
	}
}
