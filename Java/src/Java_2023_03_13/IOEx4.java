package Java_2023_03_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
//이게 필터라는데 잘 모르겠다
public class IOEx4 {
	 public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);//스트링버퍼의 원리?
		String data = "";
		while (true) {
			//네트워크 채팅 만들때 이하 그대로 만들겠다_선생님
			try {
				data = br.readLine();//스캐너랑 같은 원리라는데..
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (data.equals("end")) {
				System.out.println("프로그램 종료");
				break;
			}
			System.out.println("입력한 데이터는 : " + data);
		}//과제1 똑같은 결과를 만들어보기
	}
}
