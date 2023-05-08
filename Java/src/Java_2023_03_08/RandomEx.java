package Java_2023_03_08;

import java.lang.reflect.Array;
import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		
		Object[] obj = new Object[2];
		Integer i = new Integer(10);
		int i2 = i;
		obj[0] = i2;
		
		Random run = new Random();
//		난수 1번째 방법
		int su = run.nextInt(3);//범위지정가능
//		int su = run.nextInt(3); + 1
//		난수 2번째 방법
		int su2 = (int)(Math.random() * 3);//더블로 사용 가능함. 숫자 바꾸기 가능
//		int su2 = (int)(Math.random() * 3) + 1
		
			/*
			 *로또 게임 만들기(가챠)
			조건
				1. 1 ~ 45숫자중 6개 난수 발생
				2. 6개 난수중 중복 x
			*/
		로또();
		
	}
public static int 로또(int d) {
	Array[] a = new Array[6];
	a[0] = d;
		Random run2 = new Random();
		for (int i = 0; i < 6; i++) {
			if (a == null) {
				int s = run2.nextInt(45);
				return d = s;
			}
		}
//		System.out.println();
		
}
}
