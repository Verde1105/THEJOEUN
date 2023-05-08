package Java_2023_02_22.참고용;
/*
 삼항 연산자 
 -형식
 	데이터형 변수 = 조건식 ? 값1 : 값2 ;
 	
 */
public class OperEx3 {
	public static void main(String args[]){
		int su = 10, su2 = 20;
		String result = su < su2 ? "참" : "거짓";
		System.out.println("결과 : "  + result);

	}
}
