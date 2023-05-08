package Java_2023_03_02;

import sun.applet.Main;

public class SmartPhone extends Phone{

	public SmartPhone() {
			System.out.println("앱 설치");
//		여기다가 작성(앱 기능)
	String	기종 = "삼성 갤럭시 노트 21"; 
	String	색 = "핑크";
	int 무게 = 104;
	}
	

	public static void main(String[] args) {
		SmartPhone ph = new SmartPhone();
		ph.게임();
	}
}
class Phone{
	public void 전화걸기() {
		System.out.println("전화 수신");
	}
	public void 전화받기() {
		System.out.println("전화 발신");
	}
	public void 사진() {
		System.out.println("사진을 찍습니다");
	}
	public void 은행() {
		System.out.println("공인인증서 요구");
	}
	public void 게임() {
		System.out.println("~발열중~");
	}
	public void 플레이어1() {
		System.out.println("음악을 재생합니다.");
	}
	public void 플레이어2() {
		System.out.println("영상을 재생합니다.");
	}
}