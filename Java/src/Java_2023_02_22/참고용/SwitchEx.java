package Java_2023_02_22.참고용;

import java.io.IOException;

/*
 switch ~ case // if는 조건문이었다면 switch는 값이 들어간다, if는 차례대로 식 진행하는데 switch는 해당 식을 바로 실행
 표현
 	switch (값) {
 	case 값 1 :
  		실행 구문1;
  		break; (선택)
  	case 값 2:
  		실행 구문2;
  		break; (선택)
  	case 값 3:
  		실행 구문3;
  		break; (선택)
  		.
  		.
  		.
  	default :
  		실행 구문4;
  		break; (선택)
 */

public class SwitchEx {
	public static void main(String args[]) throws IOException {
		switch (2) {
		case 1:
			System.out.println("실행구문1");
			break;
		case 2:
			System.out.println("실행구문2");
			// break;
		case 3:
			System.out.println("실행구문3");
			// break;

		default:
			System.out.println("기본 실행구문");
			// break;
		}

		System.out.println("Yes/No?");
		char c = (char) System.in.read();
		switch (c) {
		case 'y':
		case 'Y':
			System.out.println("Yes");
			break;
		case 'n':
		case 'N':
			System.out.println("No");
			break;
		default:
			System.out.println("wrong answer");
			break;
		}

	}
}
