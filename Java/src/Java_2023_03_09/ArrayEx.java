package Java_2023_03_09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;


/*
 * 배열(Array)
 * - 같은 자료형의 데이터를 여러개 저장하기 위한 메모이 공간을 말함.
 * = 생성된 메모리 공간에 index를 이용하여 각 기억 장소를 구분함.
 * - 배열 크기는 length를 사용하여 구함.
 * 
 * 표현)
 * -int[] arr = new int[n];
 			*n개 만큼 0으로 초기화.
 *int[] arr = {1, 2, 3};
 *int[] arr = new int[]{1, 2, 3};
 */
//arr.get
public class ArrayEx {
	public static void main(String[] args) {
//		int[] arr = new int[3];
		ArrayList<Integer> arr = new ArrayList<>(3);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		System.out.println("arr[" +0+"] = " + arr.get(0));
		System.out.println("arr[" +1+"] = " + arr.get(1));
		System.out.println("arr[" +2+"] = " + arr.get(2));

//		int[] a = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("arr["+i+"]="+arr.get(i));
		}
		arr.set(0,10);
		arr.set(1,20);
		arr.set(2,30);
			System.out.println("arr["+0+"]="+arr.get(0));
			System.out.println("arr["+1+"]="+arr.get(1));
			System.out.println("arr["+2+"]="+arr.get(2));

			System.out.println("///////////////////////");
			
			int[] arr1 = new int[3];
			System.out.println("arr[" +0+"] = " + arr.get(0));
			
			arr1[0] = 30;
			arr1[1] = 40;
			arr1[2] = 50;
			for (int j = 0; j < 3; j++) {
				System.out.println("arr1["+j+"]="+arr1[j]);
				System.out.println("arr1["+j+"]="+arr1[j]);
				System.out.println("arr1["+j+"]="+arr1[j]);
			}
//		int[] arr2 = {1,2,3};
			List< Integer> arr2 = Arrays.asList(1, 2, 3);
		for (int i = 0; i < arr2.size(); i++) {
			System.out.println("arr2[" + i + "] = " + arr2.get(i));
		}
			arr2.set(0,100);
			arr2.set(1,200);
			arr2.set(2,300);
			for (int i = 0; i < arr2.size(); i++) {
				System.out.println("arr2[" + i + "] = " + arr2.get(i));
			}
//			System.out.println("arr2[" + i + "] = " + arr2);
//		String[] str = new String[3];
		
		Vector<String> str = new Vector<>(3);
		for (int i = 0; i < str.size(); i++) {
			System.out.println("str[" + i + "] = " + str.get(i));
		}
		str.add("A");
		str.add("B");
		str.add("C");
		for (int i = 0; i < str.size(); i++) {
			System.out.println("str["+i+"]="+str.get(i));

			for (String s : str) {
				System.out.println(s);
			}
		}
		/*복습부분
		int[] dan = new int[9];
		for (int i = 0; i <10; i++) {
			for (int j = 1; j < 10; ) {
				System.out.println("");
			}
		}
		*/
		
		/*System.out.println("단 입력 :");
		int dan1 = new java.util.Scanner(System.in).nextInt();
		int[] arr3 = new int[9];
		for(int i = 1; i <10; i++) {
			//System.out.println(dan+ "*" + i+"="+(dan*i));
			arr3[i-1] = dan1*i;
			}
		for(int result : arr3) {
			System.out.println(result);
		}
		*/
		
		/*Scanner scan= new Scanner(System.in);
		System.out.println("단 입력 :");
		//int dan = new java.util.Scanner(System.in).nextInt();
		int dan1 = 0;
		int[] arr3 = new int[9];
		for(int i = 1; i <10; i++) {
			//System.out.println(dan+ "*" + i+"="+(dan*i));
			arr3[i-1] = dan1*i;
		}
		for(int result : arr3) {
			System.out.println(result);
		}
		*/
		//구구단 답 거꾸로 넣기
		
		//3과목 점수를 입력받는 배열을 만들고 평균, 합계 결과를 출력하시오.평균으로 학점을 출력
		
		
		/*Scanner scan = new Scanner(System.in);
		System.out.println("학점출력 :");
		int score = scan.nextInt();
		int[] ar= new int[3];
			for (int i = 0; i < ar.length; i++) {
				ar[i] = i;
			}
			if (score >= 81 && score <= 100) {
				System.out.println("A학점");
			} else if(score>=61 && score <= 80) {
				System.out.println("B학점");
			} else if(score>=41 && score <= 60) {
				System.out.println("C학점");
			} else {
				System.out.println("낙제");
			}
			*/
		
		
		int[] score = new int[3];
		int avg, total =0;
		for(int i = 0; i < score.length; i++) {
			System.out.println("score " + (i+1) + ":");
			score[i] = new java. util.Scanner(System.in).nextInt();
			total += score[i];
		}
		avg = total /3;
		System.out.println("평균 : " + avg);
		System.out.println("총점 : " + total);
		if(avg > 0 && avg <61) {
			System.out.println("C학점");
			}else if (avg < 81) {
			System.out.println("B학점");
			}else if (avg <101) {
			System.out.println("A학점");
			}

	}
}
