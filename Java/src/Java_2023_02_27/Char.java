package Java_2023_02_27;

import javax.print.DocFlavor.STRING;

// char라는 타입이 존재하기 때문에 가급적 동일한 변수병(메소드명, 클래스명 등..)은 피해야함
public class Char { // 데이터를 정의(만든다. 창조한다.)하는 장소
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
	// 리턴타입이 없다.
	public Char() {
		
	}
	
	public Char(String 닉네임, String 무기, String 인벤토리, String 신발, String 악세사리, String 꾸미기슬롯) {
		this.닉네임 = 닉네임;		
		this.무기 = 무기;		
		this.인벤토리 = 인벤토리;		
		this.신발 = 신발;		
		this.악세사리 = 악세사리;		
		this.꾸미기슬롯 = 꾸미기슬롯;		
		
	}
	
//	기능 >> 함수
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
	
	
	// Quize. 케릭터의 상태정보를 불러오는 함수 구현
	//상태창 불러오기
	//	char test;
	//	String 닉네임;
	//	String 인벤토리;
	//	String 무기;
	//	String 신발;
	//	String 꾸미기슬롯;
	//	String 악세사리;
	//	int 속도;
	public void statusWindow() {
		System.out.println("==== 상태창 불러오기. ====");
		System.out.println("==== 닉네임 :" + 닉네임);
		System.out.println("==== 인벤토리 :" + 인벤토리);
		System.out.println("==== 무기 :" + 무기);
		System.out.println("==== 신발 :" + 신발);
		System.out.println("==== 속도 :" + 속도);
		System.out.println("==== 악세사리 :" + 악세사리);
		System.out.println("==== 꾸미기슬롯 :" + 꾸미기슬롯);
		System.out.println("==== 상태창 불러오기 끝 ====");
		
	}
}
