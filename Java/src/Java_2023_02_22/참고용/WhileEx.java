package Java_2023_02_22.참고용;

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