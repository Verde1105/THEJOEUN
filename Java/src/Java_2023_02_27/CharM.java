package Java_2023_02_27;

import org.omg.CORBA.PUBLIC_MEMBER;

import jdk.internal.dynalink.beans.StaticClass;

public class CharM {
	public static void main(String[] args) {
		// 인스턴스 호출방식
//		Char cr = new Char();//포탈생성
//		cr.닉네임 = "차라";
//		cr.속도 = 4;
//		cr.인벤토리 = "24칸";
//		cr.무기 = "목검";
//		cr.신발 = "샌들";
//		cr.악세사리 = "초보자반지";
//		cr.꾸미기슬롯 = "없음";//리턴값 있으면 이프문으로 캐시안내 가능할듯
		/*
		 * public void 이벤트쿠폰() {
		 * int 쿠폰 += 10; /이런것도 가능할것같다.
			}
		 */
		//메소드 내에 메소드 생성은 가급적 피할것
		// 클래스 내에서 메소드를 선언할것
		/*
		public void setSpeed(int speed) {
			this.setspeed = speed;
		}
		public int getSpeed(int speed) {
			return this.speed;
		}
		*/
		
		// static 변수, 함수 호출방식
//		Char.휘두르기();
//		Char.줍기();
		
		// instance 변수, 함수 호출방식
//		cr.statusWindow();
		
//		System.out.println("캐릭터 이름 :" + cr.닉네임);
//		System.out.println("속도 :" + cr.속도);
//		System.out.println("악세사리 :" + cr.악세사리);
//		System.out.println("꾸미기슬롯 :" + cr.꾸미기슬롯);
		
		// Qzize static을 사용하지 않고, 
		// 새로운 인스턴스를 생성하여
		// 선언된 statusWindow()함수를 호출하는 방법!
		//Char.statusWindow();
		
		//1. 인스턴스 생성
		Char charactor = new Char();
		
		//2. 함수 호출
//		charactor.statusWindow();
	
		Char charactor1 = new Char("꾸데기", "목도","10","샌들","토큰","없음");
		charactor1.statusWindow();
		
		
	}
	
}

