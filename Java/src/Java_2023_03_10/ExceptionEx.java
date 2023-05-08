package Java_2023_03_10;

public class ExceptionEx {
	/*try {
		예외 발생 예상 지역
	}catch(ExceprionEx e){//캐치를 여러번 사용할 수 있음(다양한 '예상가는' 예외 대응 가능)
	처리지역 //공사중, 관리자 안내 등 메세지 출력가능한 곳.
	}finally{
	반드시 실행처리
	}
	*/
	public static void main(String[] args) {
//		실행시 발생하는 예외 상황
		int[] array = new int[3];
		array[0] = 0;
		array[1] = 10;
		array[2] = 20;
//		고의로 에러유발 : arry의 범위를 벗어나도록 한다.
		for (int i = 0; i < array.length +1; i++) {
			System.out.println("array[" + i + "] =" + array[i]);
		}
	}
}
