 package Java_2023_02_27.복습;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class 만약캐쉬 {
	public static String 캐쉬() {
		Scanner scan = new Scanner(System.in);
		int 쿠폰 = 0;
		if(쿠폰<=0) {
			System.out.println("꾸미기 쿠폰은 캐쉬상점에서 구매 가능합니다.");
			System.out.println("선택> ");
			
		}else {
			System.out.println("꾸미기 쿠폰 이용 가능, 클릭시 상점으로 이동합니다.");
		}
			
		String A = scan.nextLine();
		
		//	쿠폰 사는 기능
		쿠폰 = 캐쉬;
		//상점에서 아이템 당 쿠폰 하나씩 소모되도록 --i와 브레이크 걸기
		//구매시 하나씩 추가되도록?
		/*for(i;--i) {
			System.out.println("쿠폰을 사용하시겠습니까?");
			break;}*/
		return 10;
	}
}
