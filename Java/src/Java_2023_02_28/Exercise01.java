package Java_2023_02_28;

import java.util.*;

public class Exercise01 {

	public static void main(String args[]) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------");
			System.out.println("1. 학생수 | 2. 점수 입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
			System.out.println("-------------------");
			System.out.println("선택 > ");

			int selectNo = scanner.nextInt();    	 // 흐름 제어
			if (selectNo == 1) {					 // 다중 if문
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];		//배열의 수만큼 반복수행
			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]>");	
					scores[i] = scanner.nextInt();
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]:" + scores[i]);
				}
			} else if (selectNo == 4) {
				int max = 0;
				int sum = 0;											//평균으로 사용하려고 입력함
				double avg = 0;
				for (int i = 0; i < scores.length; i++) {
					max = (max < scores[i]) ? scores[i] : max; 			// 삼항연산자 (max < scores[i]) 값을 max에 집어 넣어~
 					sum += scores[i];
				}
				avg = (double) sum / studentNum;
				System.out.println("최고 점수: " + max); 					// 평균
				System.out.println("평균 점수: " + avg);
			} else if (selectNo == 5) {
				run = false;
			} else
				;
			System.out.println("잘못된 선택입니다.");

		}

		System.out.println("프로그램 종료");
	}
}
