package Java_2023_03_13;

import java.io.IOException;

public class IOEx2 {
	public static void main(String[] args) {
		int b = 0;
		try {
			System.out.println("입력 : ");;
			b = System.in.read();
			while (b != -1) {//컨트롤 + z 가 -1값. =컨트롤 +z 누르면 빠져나가겠다.
				System.out.println((char)b);
				b = System.in.read();
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("종료");
	}
}
