package Java_2023_02_22;

import java.util.Scanner;

/*
1. ++i 이러면 i에 1을 더한다 맞꾸뎅?
2. &&는 뭐가되는건가요? 책에 기호들대신 응용식만 있어서.. 다른 기호들은 또 뭔지 모르게꾸..
3. 연산자랑 반복문 가지고 놀고싶꾸뎅..같이 놀수있꾸?
4. 별찍기가 뭔가요? 반에서 마름모 만드는사람들 생기꾸. 누구는 별만들었다는데. 어찌하는거꾸?
5. 대입연산, 비교연산< > <= >=, 삼항? 연산 아예 못들었는데 이걸로도 놀수 있나요?
6. 스프링 메모장 작성방법 알려주꾸
 */
public class 복습 {

	public static void main(String[] args) {
		좌표();
//		quize3();
		
	}
	
	public static void 좌표() {
		//Q. 다중 for문일때, 두번째 괄호 안에서 곱셈이 들어가야만 하는가?
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("["+i+","+j+"]");
			}
			System.out.println("");
		}// The end of for
		System.out.println("\n");
	}
	
	/* ------------------------------- */
	
	public static void 별찍기1() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 2) {
					System.out.print("[ * ]");
				}else {
					System.out.print("[   ]");
				}
			}
			System.out.println("");
		}// The end of for
	}
	
	public static void 별찍기2() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 2) {
					System.out.print("[ * ]");
				}else {
					System.out.print("[   ]");
				}
			}
			System.out.println("");
		}// The end of for
	}
	public static void 별찍기3() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 2 || i == 2) {
					System.out.print("[ * ]");
				}else {
					System.out.print("[   ]");
				}
			}
			System.out.println("");
		}// The end of for
	}
	public static void 별찍기4() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == i) {
					System.out.print("[ * ]");
				}else {
					System.out.print("[   ]");
				}
			}
			System.out.println("");
		}// The end of for
	}
	public static void 별찍기5() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j + i == 4) {
					System.out.print("[ * ]");
				}else {
					System.out.print("[   ]");
				}
			}
			System.out.println("");
		}// The end of for
	}
	public static void 별찍기6() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if ((j + i == 4) || (i + j ==5)) {
					System.out.print("[ * ]");
				}else {
					System.out.print("[   ]");
				}
			}
			System.out.println("");
		}// The end of for
	}
	
	/* ------------------------------- */
	
	public static void 대입연산() {
		
		int a = 0;
		a = a+1;
		System.out.println("a : "+a);
		
		int b = 0;
		b++;
		System.out.println("b : "+b);
		
		
		int aa = 0;
		int bb = 0;
		int cc = 0;
		
		// <<<
		bb = ++aa;
		cc = aa++;
		System.out.println("bb : "+ bb);
		System.out.println("cc : "+ cc);
		
		int count = 0;
		int score = 0;
		
		// i : 1 , count:0, score :0
		// i : 2 , count:1, score : 1
		// i : 3 , count:2, score : 2
		// i :10 , count:9, score : 9
		for (int i = 1; i <= 10; i++) {
			score = count++;
		}
		System.out.println("score : "+score);
		
		int count1 = 0;
		int score1 = 0;
		
		// i : 1 , count:1, score :1
		// i : 2 , count:1, score : 1
		// i : 3 , count:2, score : 2
		// i :10 , count:9, score : 9
		for (int i = 1; i <= 10; i++) {
			score1 = ++count1;
		}
		System.out.println("score1 : "+score1);
	}
	
	public static void andOr() {
		
		/*
		And 연산 : 교집합
		: 둘중에 하나라도 false(0)면 무조건 0
		 
			true(1) && true(1) = true
			true(1) && false(0) = false
			false(0) && false(0) = false
			1 && 0 = 0,  1 * 0 = 0 
			1 && 1 = 1,  1 * 1 = 1
			
		OR 연산 : 합집합
		: 둘중에 하나라도 true(1)면 무조건 1

			true(1) OR true(1) = true
			true(1) OR false(0) = true
			false(1) OR true(0) = true
			false(0) OR false(0) = true
			
			1 || 1 = 1,  1 + 1 = 1 
			1 || 0 = 1,  1 + 0 = 1
			0 || 1 = 1,  0 + 1 = 1
			0 || 0 = 0,  0 + 0 = 0
			
		응용
		(true || false) && false = false
		
		*/
		
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if ( i==2 || j==2 ) {
					System.out.print("[ * ]");
				}else {
					System.out.print("[   ]");
				}
			}
			System.out.println("");
		}// The end of for
	}
	
	/* ------------------------------- */
	//학점 표시(100~80점은 A등급 이런식으로)
	public static void quize1() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = scan.nextInt();
		
		// 점수가 100점인 경우 S 등급 
		// 90점 이상 100점 미만인 경우 A 등급 
		// 80점 이상 90점 미만인 경우 B 등급
		if (score == 100) {
			System.out.println("S 등급");
		}else if(score >= 90 && score <= 99) {
			System.out.println("A 등급");
		}else if(score >= 80 && score <= 89) {
			System.out.println("B 등급");
		}else{
			System.out.println("C 등급");
		}
	}
	//1~10까지 홀수만 출력하기. 출력한 홀수 전부 더하기
	public static void quize2() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if(i % 2 == 1) {
				sum = sum + i;
				System.out.println(i);
			}
		}
		System.out.println(sum);
	}
	
	//1~10까지 짝수만 출력하기. 출력한 짝수 전부 더하기
	public static void quize3() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				sum = sum + i;
				System.out.println(i);
			}
		}
		System.out.println(sum);
	}
	//1~100까지 전부 더하기
	public static void quize4() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
