package Java_2023_02_22.참고용;

/* 제어문 (조건문)
 if, else의 조건식에 따라 프로그램의 흐름을 변경
 표현방법
 if(조건식){
 		실행구문;
 		}
 		
 if(조건식){
 		실행구문1;
 		}else{
 		실행구문2;
 		}
  else는 if 없이 쓸 수 없어용
  
 */
public class IfEx {
	public static void main (String args[]){
		int num = 10;
		if (num >= 10) {
			System.out.println("참입니다.");
		}
		System.out.println("실행 구문");
		
		if (num>10){
			System.out.println("참 입니다.");
		}else{
			System.out.println("거짓 입니다.");
		}
		
	}

}
