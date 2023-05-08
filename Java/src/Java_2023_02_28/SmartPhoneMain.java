package Java_2023_02_28;

public class SmartPhoneMain {

		public static void main(String args[]) {
			Phone p = new Phone();					//객체 생성
			p.name = "전화기";						// 폰 정보 대입
			p.company = "현대";
			p.color = "화이트";
			
			System.out.println("Phone 출력");			//출력
			System.out.println(p.name);
			System.out.println(p.company);
			System.out.println(p.color);
			p.call();
			p.receive();
			
			SmartPhone sp = new SmartPhone();
			sp.name="갤럭시";
			sp.company="삼성";
			sp.color="그린";
			
			System.out.println("SmartPhone 출력");
			System.out.println(sp.name);
			System.out.println(sp.company);
			System.out.println(sp.color);
			sp.call();
			sp.receive();
			sp.installApp();
		}
}
