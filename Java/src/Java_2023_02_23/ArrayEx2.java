package Java_2023_02_23;
/*
 * 다차원 배열(array) 행과 열

표현)
-int[][] arr = new int[n][n];
-int[][] arr = {
{n,n},
{n,n},
{n,n}
};
 */
// 위의 예시처럼 만들어 보기
// 구구단 전체 중 답만 배열안에 넣기

public class ArrayEx2 {
	public static void main(String[]args) {
		int[][] arr = new int[3][2];
		arr[0][0] =1;
		arr[0][0] =2;
		arr[1][0] =3;
		arr[1][1] =4;
		arr[2][0] =5;
		arr[2][1] =6;
		System.out.println("arr[0][0] :" + arr[0][0]);
		
		for (int i = 0; i < 3; i++) {//app.lenght
			for (int j = 0; j < 2; j++) {
				System.out.println("arr[" +i + "] ["+j+"] : ");
			}
		}
		for(int i=0; i < arr. length; i++) {
			for(int j =0; j < arr [i].length; j++) {
				System.out.println("arr["+i+"]["+j+"] :" +arr[i][j]);
			// arr[i][j] = ++cnt;
			}
		}
		System.out.println();
		int[][] arr2 = {{10, 20},
						{30, 40, 50},
						{60,70,80,90}};
		
		
		
		//학생 이름을 저장한 배열을 만들고, 국,영,수 점수를 저장한 배열을 만들어 출력하시오. 총합과 평균도 구하시오.
		/*
		 * ex)
		 * {{국,영,수]
		 * {국,영,수}
		 * {국,영,수}};
		 */
		
		}
	}
