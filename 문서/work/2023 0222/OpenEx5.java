package app;

/*
 연산 후 대입 연산자
 형식
  +=
  -=
  *=
  *=
  %=
  
  ex)
  int su = 5;
  su %= 10; -> su = su % 10;
 */

public class OpenEx5 {
	public static void main(String args[]){
		int su = 5;
		su %= 10;
		su = su % 10;
		System.out.println("결과값 : " + su);
		
		int su1 = 0;
		int su2 = 0;
		int sum = 0;
		
		su1 = 10;
		su2 = 20;
		sum = su1 + su2;
		System.out.println(sum);
		
		sum += su1; // sum = sum + su1;
		System.out.println(sum);
		
		sum -= su2;
		System.out.println(sum);
		
		// 1 부터 10까지 합과 곱의 결과를 출력하시오
	
		su = 1;
		su += 2;
		su += 3;
		su += 4;
		su += 5;
		su += 6;
		su += 7;
		su += 8;
		su += 9;
		su += 10;
		System.out.println(su);
		
		su = 1;
		su *= 2;
		su *= 3;
		su *= 4;
		su *= 5;
		su *= 6;
		su *= 7;
		su *= 8;
		su *= 9;
		su *= 10;
		System.out.println(su);
		
		
		
	
	
		
	}
}
