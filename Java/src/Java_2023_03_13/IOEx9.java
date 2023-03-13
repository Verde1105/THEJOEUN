package Java_2023_03_13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class IOEx9 {
	public static void main(String[] args) throws IOException{
		File fi = new File("H:\\Github\\THEJOEUN\\Java\\src\\Java_2023_03_13//IO.txt");
		FileWriter fw = new FileWriter(fi);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw, true);
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("입력 : ");
		String str = "";
		while (!str.equals("end")) {
			str = br.readLine();
			pw.println(str);
		}
		br.close();
		pw.close();
	}
}
//첵스트 파일에 기록되는구나, 이거 록만들수있겠구나