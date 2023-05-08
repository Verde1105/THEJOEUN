package Java_2023_02_22.참고용;
/*
  
  논리 연산자
  	| or
  	참 = 참 | 거짓 (그럼 하나짜리 쓰는 이유는? 실행 카운트 세기 위해서? 로그 체크하기 위해서? 과정 체크용 등등)
  	참 = 거짓 | 참
  	
  	& and
  	참 = 참 & 참
  	거짓 = 거짓 & 참
  	거짓 = 거짓 & 거짓
 
 
 	||
 	참 = 참 || 거짓 (||은 "앞"이 참이라면 뒤의 거짓 생략함. |과의 차이점이 이것. 그래서 속도적 차이가 생김.)
 	참 = 거짓 || 참 (||에서 "앞"이 거짓이라면 뒤의 참 확인해야 함.)
 	
 	&&
 	참 = 참 && 참
 	거짓 = 거짓  && 참
 	거짓 = 참  && 거짓
 	
 */
public class OperEx4 {

	public static void main(String args[]){
		int su1 = 10;
		int su2 = 20;
		boolean result1 = su1<su2;
		System.out.println(result1);
		boolean result2 = su1 > su2;
		System.out.println(result2);
		boolean result3 = result1 || result2;
		System.out.println(result3);
		boolean result4 = result1 && result2;
		System.out.println(result4);
		boolean result5 = su1 <= su2;
		System.out.println(result5);
		boolean result6 = su1 >= su2;
		System.out.println(result6);
		boolean result7 = su1 == su2;
		System.out.println(result7);
		boolean result9 = ! result1;
		System.out.println(result9);
				
		
		boolean result8 
			= su1 < su2 || (su1=5)> su2;
			System.out.println(result8);
			System.out.println("su1 = " + su1);
			
		
		boolean result10
			= su1 > su2 && su1 < (su2 = 5+5);
			System.out.println(result10);
			System.out.println("su2 = " + su2);
			
			
	}
}
