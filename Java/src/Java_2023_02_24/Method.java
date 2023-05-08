import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

/*
 * -[접근제어지][수정자][반환형] 메소드 명 (인자툴){
 * 실행구문(구현);
 * }
 * 접근 제어자(Modifiers)
 * :private, dafault(friendly),
 * protected,public
 * 수정자 : staric, final, abstract, native...
 * 반환형(return type) :
 * -자바 데이터 자료형(기본형, 참조형)
 * 전부 사용 할 수 있음.
 * -void : 반환형이 없는 메소드 정의시 사용.
 * 메소드 명 : 식별자로 임의의 이름 정의.
 * 인자(Argumennts) : 매개 변수라고 하며//하드코딩같은거
 * 메소드 호출시 데이터를
 * 전달 하기 위한 용도로 사용함.
 * 표현 -1)
 * public int intA
 *(){
 *구현;
 *return n; // n -> int 기본 자료형에 맞는 데이터 변환
 *}
 *표현 - 2)
 *pubilc void intB(int a, ...){
 *구현;
 *return 구문을 사용하지 않음.
 *
 */
public class Method {

	public static int intA() {
		System.out.println("A");
		return 10;
	}

	public static void intB(int a) {
		System.out.println("B");
		// return 구문을 사용하지 않음.
	}

	public static int intC(int su, int su2) {
		int result = su;
		result += su2; // result = result + 10
		return result;
	}

	public static void main(String[] args) {
		//int a = 0;
		//System.out.println(연습문제2(a));
		//int dan= 2, dan2=8;
		//System.out.println(응용문제1(dan,dan2));
		arr133();
	}
	/*
	 * public static void main(String[]args) { int result = intA();
	 * System.out.println(result); intB(50); result = intC(10,20);//메소드 특징, 이름으로 해당
	 * 메소드 찾아가는 방식 System.out.println(result); 구구단((int dan,int b)); }
	 */

	// 구구단을 출력하시오(메소드 사용)
	// ex) void guguDan(int dan)
	// 리턴이 있을때 > 메인에서 값이 불러와짐. 결과가 불러온곳에서 나옴.
	// 리턴 없는 보이드 > 메인에서 답이 불러와지진 않음. 결과는 식에서 나옴.
	// 소괄호()안에는 변수타입이 포함된 계산식을 쓰고, 호출하는곳에서는 변수의 이름만을 적는다. 	
	public static int 구구단(int dan, int b) {
		Scanner scan = new Scanner(System.in); // 입력
		 dan = scan.nextInt(); // 입력한것을 프린트
		 b = new Scanner(System.in).nextInt(); // 입력한것을 프린트
		int c = 0;
		c = dan * b;
		return c;
		/*
		 * static void guguDan(int dan){ for(int i = 1; i <10; i++}
		 */
	}

	// 연습문제 2 1~100까지 합을 구하는 함수를 정의하고 결과를 받아 출력하시오.
	// (return type 사용)
	public static int 연습문제2(int a) {
		for (int i = 2; i <= 100; i++) {
			a = a+i;
		}
		return a;
	}
	/*
	 * result = returnSum();
	 * System,out.print....
	 */
	
	/*
	 * static int returnSum(){
	 * int su = 0, sum = 0;
	 * while(su <100) {
	 * su++;
	 * -if(su % 2==0)
	 * sum+= su;
	 * return sum
	 */
// 연습문제 3 입력한 수 범위에서 짝수 와 홀수 각각의 합을 구하시오. (메소드를 각각 사용)
	/*
	 * static void oddSum(int su){
	 * int sum = 0;
	 * for(int i =0; i<= su; i++){
	 * if(i%2==){
	 * System.out.println(i)0;
	 * sum += i;
	 * }
	 * }
	 * System.out.println("sum : " +sum);
	 * }
	 * static void avanSum(int su){
	 * int sum = 0;
	 * for(int i = 0; i <= su; i++){
	 * if(i%2 == 0){
	 * System.out.print(i);
	 * sum +=i;
	 * }
	 * }
	 * System.out.println("sum : " + sum);
	 */
	//메소드 1에서 나온 값 + 메소드2에서 나온 값 = 메소드 3에서 담아 호출.
	
// 응용문제 1) public static void method(int dan, int dan2) {코드를 작성하시오. (dan ~ dan2 구구단 출력)}
	
		public static int 응용문제1(int dan, int dan2) {
			System.out.println("첫번째 수 입력");
				Scanner scan = new Scanner(System.in);
						dan = scan.nextInt();
						System.out.println("두번째 수 입력");
						dan2 = scan.nextInt();
						for (int dan3 =2 ; dan3 <10; dan3++) {
							for (int dan4 = 1; dan4 <10; dan4++) {
							}
						}
						return dan*dan2;
		}
		/*
		 * static void mathod(int dan, ivt dan2){
		 * for(int i = danl i<= dan2; i++){
		 * for(int j = 1; j <10; j++){
		 * Dydtem.out.print
		 * (i+"*"+j+"="+(i*j)+"\t"
		 * }
		 * System.out.print();
		 * }
		 * }
		 */
	
// 응용문제 2) {2, 5, 7, 3, 9} -> 인자값, 구구단출력 함수구현
		/*
		 * int[] arr = {2,5,7,3,9};
		 * method2(arr);
		 * }
		 * static void guguDan()
		 */
// 인자값이란게 뭔지 도통..
		public static void arr132() {
			//원본 배열
			int[] arrInt = {1,2,3};
			
			//복사할 배열
			int[] arrInt2 = new int[5];
			
			//복사할 배열에 값 대입
			for (int i=0; i<arrInt.length; i++) {
				arrInt2[i] = arrInt[i];
			}
			
			//배열 값 출력
			for (int i=0; i<arrInt2.length; i++) {
				System.out.println(arrInt2[i]);
			}
		}
		public static void arr133() {
			//원본 배열
			int[] arrInt = {1,2,3};
			
			//복사할 배열
			int[] arrInt2 = new int[5];
			
			System.arraycopy(arrInt, 0, arrInt2, 2, arrInt.length);
			
			//배열 값 출력
			for (int i = 0; i < arrInt2.length; i++) {
				System.out.println(arrInt2[i]);
				
			}
		}
		
		
	}
