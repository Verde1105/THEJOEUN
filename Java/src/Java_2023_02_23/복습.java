package Java_2023_02_23;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] 배열gs) {
		/*
			구구단 전체 중 답만 배열안에 넣기
		*/
		
//		Q1_구구단_거꾸로();
//		배열이해();
//		Q2_배열문제();
//		Q3_배열문제();
//		Q4_학생점수();
	}// The end of method
	
	
	public static void Q1_구구단_거꾸로() {
		// Q1. 구구단 답 거꾸로 넣기
		for (int a = 9; a >= 2; a--) {
			System.out.println("구구단을 외자!" + a + "단!");
			for (int a1 = 1; a1 < 10; a1++) {
				System.out.println(a+"곱하기"+(10-a1)+"는"+ a * (10-a1));
			}
		}
	}// The end of method
	
	public static void 배열이해() {
		Scanner 소포 = new Scanner(System.in);
		String[] 아파트 = new String[3];
		
		// String배열 	= [ "초콜릿","해바라기씨","애들간식", "1" ]; 4
		// int배열 		= [ 0,123,1000 ];
		
		// 1. 배달
		for (int i = 0; i < 아파트.length; i++) {
			System.out.println("아파트 "+i+" 호에 전달할 소포 이름 입력:");
			아파트[i] = 소포.nextLine();
		}
		
		// 2. 확인
		for (int i = 0; i < 아파트.length; i++) {
			System.out.println("아파트 "+i+" 호에 배달된 소포 이름:"+아파트[i]);
		}
		
	}
	
	public static void Q2_배열문제() {
		// Q2. 
		// 1. 3과목 점수를 입력받는 배열을 만들고 
		// 2. 평균, 합계 결과를 출력하시오.
		// 3. 평균으로 학점을 출력
		
		//new scanner(System.in).naxtInt();
		Scanner scan = new Scanner(System.in);
		int score = 0;
		int[] 배열= new int[3];
		// 0, 1, 2
		
		// 1. 점수 입력
		
		// i는 0부터 시작해서 
		// 배열 길이(배열.length)만큼 
		// i가 1씩 증가
		for (int i = 0; i < 배열.length; i++) {
			System.out.println("index"+i+" 번째 점수를 입력하세요 :");
			score = scan.nextInt(); // 점수를 입력
			배열[i] = score;			// i 번쨰 index에 점수 대입
		}
		
		// 2. 점수 출력
		for (int i = 0; i < 배열.length; i++) {
			System.out.println(i+"번째 배열 값 :"+배열[i]);
		}
		
		// 3. 평균
		int 평균 = 0;
		for (int i = 0; i < 배열.length; i++) {
			평균 += 배열[i];//평균 = 평균 + 배열[i];
			System.out.println(i+"번째 avg 값 :"+평균);
		}
		System.out.println("평균 : "+평균/배열.length);
		
		// 4. 등급
		if (평균/배열.length >= 81 && 평균/배열.length <= 100) {
			System.out.println("A학점");
		} else if(평균/배열.length>=61 && 평균/배열.length <= 80) {
			System.out.println("B학점");
		} else if(평균/배열.length>=41 && 평균/배열.length <= 60) {
			System.out.println("C학점");
		} else {
			System.out.println("낙제");
		}
	}// The end of method
	
	public static void Q3_배열문제() {
		/*
			다차원 배열(배열ray) 행과 열
			표현)
			-int[][] 배열r = new int[n][n];
			-int[][] 배열r = {
			{n,n},
			{n,n},
			{n,n}
			};
			위의 예시처럼 만들어 보기
		*/
		int 행 = 3;
		int 열 = 2;
		int[][] a2차원배열 = new int[행][열];
		
		// 2차원 배열
		for (int i = 0; i < 행; i++) {
			for (int j = 0; j < 열; j++) {
//				System.out.print("["+i+","+j+"]");
				System.out.print("["+a2차원배열[i][j]+"]");
			}
			System.out.println("");
		}// The end of for
		System.out.println("\n");
		
	}// The end of method

	public static void Q4_학생점수() {
		/*
		1. 학생 이름을 저장한 배열을 만들고, 
		2. 국,영,수 점수를 저장한 배열을 만들어 출력하시오. 
		3. 총합과 평균도 구하시오.
			ex)
			[
				[국,영,수]
				[국,영,수]
				[국,영,수]
			];
		*/
		// 1. 학생명단 배열 생성
		String[] 학생명단 = {"허윤서","김현민","김꾸딸"}; // 3명
		
		// 2. 학과목
		String[] 과목 = {"국어","영어","수학"}; 
		
		int 학생수 = 학생명단.length;
		int 과목수 = 과목.length;
		
		// 3. 학생 성적표
		int[][] 학생점수 = new int[ 학생수 ][ 과목수 ]; // 국, 영, 수 3과목 
		
		// 4. 학생 점수 입력받기
		
		//	[0,0][0,1][0,2]
		//	[1,0][1,1][1,2]
		//	[2,0][2,1][2,2]
		
		for (int i = 0; i < 학생수; i++) {
			for (int j = 0; j < 과목수; j++) {
				System.out.print("["+i+","+j+"] "+학생명단[i]+" 학생의"+과목[j]+"점수 입력:");
				int 점수 = new Scanner(System.in).nextInt();
				학생점수[i][j] = 점수;
			}
		}
		
		// 5. 학생 점수 확인하기
		// 학생명단 = {"허윤서","김현민","김꾸딸"}
		// 과목 = {"국어","영어","수학"}
		for (int i = 0; i < 학생수; i++) {
			System.out.println("**"+학생명단[i]+"**");
			for (int j = 0; j < 과목수; j++) {
				System.out.print("["+과목[j]+" : "+학생점수[i][j]+"] \n");
			}
			System.out.println();
		}
		
		// 표로 보기
		for (int i = 0; i < 학생수; i++) {
			for (int j = 0; j < 과목수; j++) {
				System.out.print("["+과목[j]+" : "+학생점수[i][j]+" | "+i+","+j+" ] \t");
			}
			System.out.println();
		}
		
	}
}
