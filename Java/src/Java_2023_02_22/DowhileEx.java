package Java_2023_02_22;
//반복문 (do~while문)
	/* 표현
	 	* do{
	 		* 실행 구문;-단 한번이라도 반드시 실행.
	 	* }while(조건식);
 */

public class DowhileEx {
	public static void main(String[] arge) {
		/*int count = 0;
		do {
			count++;
			System.out.println("실행 구문" + count);
		} while(count <10);
		*/
		int h = 0;
		do {
			h++;
			System.out.println("구구단을 외자" + h * 2);
		} while(h <10);
		System.out.println("~2단 끝~");
		int a = 0;
		do {
			a++;
			System.out.println("구구단을 외자" + a * 3);
		} while(a <10);
		System.out.println("~3단 끝~");
		int b = 0;
		do {
			b++;
			System.out.println("구구단을 외자" + b * 4);
		} while(b <10);
		System.out.println("~4단 끝~");
		int c = 0;
		do {
			c++;
			System.out.println("구구단을 외자" + c * 5);
		} while(c <10);
		System.out.println("~5단 끝~");
		int d = 0;
		do {
			d++;
			System.out.println("구구단을 외자" + d * 6);
		} while(d <10);
		System.out.println("~6단 끝~");
		int e = 0;
		do {
			e++;
			System.out.println("구구단을 외자" + e * 7);
		} while(e <10);
		System.out.println("~7단 끝~");
		int f = 0;
		do {
			f++;
			System.out.println("구구단을 외자" + f * 8);
		} while(f <10);
		System.out.println("~8단 끝~");
		int g = 0;
		do {
			g++;
			System.out.println("구구단을 외자" + g * 9);
		} while(g <10);
		System.out.println("~9단 끝~");
		
		int dan =3;
		int cnt =1;
		do {
			++cnt;
			System.out.println(dan+"*" + cnt + " = " + (dan * cnt++) + "\t");
		}while(cnt <10);
		
	}
}
