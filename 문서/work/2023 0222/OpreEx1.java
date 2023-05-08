package app;

/*
 데이터 연산자
 수학적(산술) 연산자
 
 표현
 + => 더하기
 0 => 빼기
 * => 곱하기
 / => 나누기 혹은 목 연산자라고도 함
 % => 나머지

 */

public class OpreEx1 {
	public static void main(String args[]){
	 	int su1 = 10; // 선언과 동시에 초기화하는 식이기도 함
	 	int su2 = 20;
	 	int result = 0;
	 	result = su1 + su2;
	 	System.out.println("결과 1: " + result);
	 	
	 	result = su1 - su2;
	 	System.out.println("결과 2: " + result);
	 	
	 	result = su1 * su2;
	 	System.out.println("결과3 : " + result);
	 	
	 	result = su1 / su2;
	 	System.out.println("결과4: " + result);
	 	
	 	result = su1 % su2;
	 	System.out.println("결과5: " + result);
	 	
	 	
	 	
	 	/* -- 궁금해서 --
	 	result = su1 * su2;
	 	System.out.println('B' + result);
	 	System.out.println('B: ' + result);
	*/
	 	
	  //1부터 10까지 합 결과 출력 , 반복문 할 때 한 번 더 살펴보기 1
	    int o = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8+ 9 + 10;	
	 	System.out.println(o);
	 	
	 	// 1부터 10까지 다른 예시 2
	 	int a = 1;
	 	int b = 2;
	 	int c = 3;
	 	int d = 4;
	 	int e = 5;
	 	int f = 6;
	 	int g = 7;
	 	int h = 8;
	 	int i = 9;
	 	int j = 10;
	 	result = a + b + c + d + e + f + g+ h + i + j;
	 	System.out.println(result); 
	 	
	 	
	 	
	}
}
