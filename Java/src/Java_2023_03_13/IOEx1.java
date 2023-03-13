package Java_2023_03_13;

import java.io.IOException;

public class IOEx1 {
	public static void main(String[] args) {
		System.out.println("입력 : ");
		char c = ' ';
		try {
			c = (char)System.in.read();//오버로드로 인풋시스템을 자유로이 쓸 수 있음.
			//입력을 대기하는 상태 = 블락킹
		} catch (IOException e) {
			// TODO: handle exception
		}
		System.out.println("출력 : " + c );
	}
}
