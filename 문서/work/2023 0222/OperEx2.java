package app;

/* 비교 연산자
 
 <
 >
 <=
 >=
 ==
 != 
 ! true false 반대값 도출
 
 boolean 값을 도출함 
 
 */
public class OperEx2 {
	public static void main(String args[]){
		int x = 30;
		int y = 20;
		boolean result = x < y;
		System.out.println("결과 1: " + result);
		boolean result2 = x > y;
		System.out.println("결과 2: " + result2);
		boolean result3 =  x <= y;
		System.out.println("결과3 : " + result3);
		boolean result4 = x >= y;
		System.out.println("결과4 : " + result4);
		boolean result5 = x != y;
		System.out.println("결과 5 : " + result5);
		boolean result6 = x != y;
		System.out.println("결과 6: " + result6);
		boolean result7 = ! result;
		System.out.println("결과 7: " + result7);
	}
}
