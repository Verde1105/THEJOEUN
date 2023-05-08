package Java_2023_02_22.참고용;

/*
 다종 If문
 제어문 (다중 조건문)
 
 표현방법
 	if (조건식 1){
 		실행구문 1;
 		}else if (조건식 2){
 		실행구문
 		}
 		else if 아닐 때만 실행
 		
 		esle if 다 안 맞을 경우 마지막 else가 실행됨
 		
 */
public class IfEx2 {
	public static void main(String agrs[]) {
		int score = 95;
		if (score > 50 && score < 81) {
			System.out.println("실행 구문 1");
		} else if (score < 91) {
			System.out.println("실행구문 2");
		} else if (score < 100) {
			System.out.println("실행 구문 3");
		}

		int score1 = 70;
		if (score1 > 0 && score1 < 61) {
			System.out.println("문자열 A");
		} else if (score1 < 81) {
			System.out.println("문자열 B");
		} else if (score1 < 101) {
			System.out.println("문자열 C");
		}
	}
}
