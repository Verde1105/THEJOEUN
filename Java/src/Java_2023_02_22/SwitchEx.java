package Java_2023_02_22;
import java.io.IOException;

/* Switch ~ case문
 * 표현)
 * Switch (값) {
 * case 값 1 :
 * 실행구문1;
 * break; (선택)
 * case 값 2 :
 * 실행구문2;
 * break; (선택)
 * case 값 3 :
 * 실행구문3;
 * break; (선택)-케이스 하나씩만 수행 가능하게 끊는 용도
 * .
 * .
 * .
 * default :
 * 실행구문4;
 * break; (선택)
 * }
 * */

public class SwitchEx {
	public static void main(String arge[]) throws IOException{
		switch (2){
		case 1:
			System.out.println("실행구문1");
			break;
		case 2:
			System.out.println("실행구문2");
			break;
		case 3:
			System.out.println("실행구문3");
			break;
		default :
			System.out.println("기본실행구문");
			break;	
		}	
		
		
		System.out.print("Yes/No ? ");
		char c = (char)/*캐릭터 닉네임*/ System.in.read();
		switch (c) {
		case 'Y' :
		case 'y' :
			System.out.println("Yes");
			break;
		case 'N' :
		case 'n' :
			System.out.println("No");
			break;
		default :
			System.out.println("Wrong answer");
			break;
		}
		
		
	}
}
