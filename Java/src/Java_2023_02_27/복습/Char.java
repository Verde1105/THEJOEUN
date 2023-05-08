package Java_2023_02_27.복습;

import javax.print.DocFlavor.STRING;

// char라는 타입이 존재하기 때문에 가급적 동일한 변수병(메소드명, 클래스명 등..)은 피해야함
public class Char {
//	속성
	char test;
	String 닉네임;
	String 인벤토리;
	String 무기;
	String 신발;
	String 꾸미기슬롯;
	String 악세사리;
	int 속도;
	
	
//	생성자
	public void Char() {
		
	}
	
//	기능
	public static void 이동() {
		System.out.println("클릭한 장소로 이동합니다.");
	}
	public static void 줍기() {
		System.out.println("물건을 주웠다!");
	}
	public static void 휘두르기() {
		System.out.println("공격개시");
	}
	public static void 구르기() {
		System.out.println("휴! 피했어요.");
	}
	
}
