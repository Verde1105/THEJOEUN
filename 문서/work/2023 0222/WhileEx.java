package app;

// 반복문(while문)
/*
 표현
 while (조건식){
 			실행구문;
 }
 */
public class WhileEx {
	public static void main(String args[]) {
		/*
		 * while (true) { System.out.println("실행 구문") }
		 */

		int count = 0;
		while (count < 3) {
			// count++;
			System.out.println("count : " + ++count);
			// count++;
		}

		int su = 0;
		int sum = 0;
		while (su < 10) {
			su++;
			if(su % 2  !=  0){
			sum += su;
				}
			}
		System.out.println("sum:  " + sum );
	}
}



ForEx2 {
	public static void main(string[] args) {
		int dan = 0;
		System.out.println('\n전체 구구단 출력');
		for(int su = 1; su < 10; su++) {
			for (dan =2; dan<10; dan++) {
				System.out.println(dan + "*" + su + "=" + (dan*su) + "\t");
			}
			System.out.println();
		}
	}
}