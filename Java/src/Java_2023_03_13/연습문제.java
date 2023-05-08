package Java_2023_03_13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//역슬래시는 이스케이프문자
//버퍼 = 빠른것과 느린것 사이, 완충제
//파일에 기록된 문자데이터를 화면에 출력하시오.
public class 연습문제 {
	public static void main(String[] args) throws IOException{
		//01. FileReader fr = new FileReader(H:/Github/THEJOEUN/Java/src/Java_2023_03_13/IO.txt);
		//01. BufferedReader brr = new BufferedReader(fr);
		//01. while (brr.ready()) {
		//01. 	System.out.println(brr.readline());
		//01. }
		
		BufferedReader br = new BufferedReader (new FileReader("H:/Github/THEJOEUN/Java/src/Java_2023_03_13/IO.txt"));
//		int readByteNo; 얘는 지금은 필요없어보임
		String str = "";
		while ((str = br.readLine()) != null) {
//			str = br.readLine();
			System.out.println(str);
		}
		br.close();
	}
}
