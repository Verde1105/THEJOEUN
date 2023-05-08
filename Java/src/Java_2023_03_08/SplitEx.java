package Java_2023_03_08;

import java.util.Iterator;

public class SplitEx {
	public static void main(String[] args) {
		String text = "홍길동&이수홍, 박연수,김자바-최명호";
		String[] names = text.split("&|,|-");//"" 안에 해당 기호들이 들어가는 부분을 잘라라
		for(String name : names) {
			System.out.println(name);
		}
	}
}
