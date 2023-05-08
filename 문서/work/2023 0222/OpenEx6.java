package app;

/*
 증가, 감소 연산자
 형식
 --
 ++
 int a = 0;
 ++a;  // => 결과 : 1  출력할 때 바로 1 증가
 a++;  // => 결과 : 1  먼저 출력한 후 다음 출력부터 1 증가
 --a;  // => 결과 : 0  출력할 때 바로 1 감소
 a--;  // => 결과 : 0  나중에 1 감소
 */
public class OpenEx6 {
	public static void main(String args[]) {
		//int a = 0;
		// System.out.println(a++);
		// System.out.println(a);
		// System.out.println(a--);
		// System.out.println(a);

		//System.out.println(a++ + a++);
		//System.out.println(a + --a + ++a);
		//System.out.println(--a + a++);
		//System.out.println(a);

		int a = 10;
		++a;
		System.out.println("++a: " +a);
	
		
	}

}
