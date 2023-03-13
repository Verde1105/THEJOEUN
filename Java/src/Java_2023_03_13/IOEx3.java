package Java_2023_03_13;

import java.io.IOException;

public class IOEx3 {
	public static void main(String[] args) {
		byte b[] = new byte[5];//문자 담을 배열 공간 확보
		System.out.println("입력 : ");
		char c = ' ';
		try {
			System.in.read(b,0,5);
//			String str = new String(b);
//			System.out.println("문자열 활용" + str);//이건 문자열로 바로 뽑아쓸 순 있는데 조금 불편함.
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력 : ");
		System.out.write(b,0,5);
	}
}
