package Java_2023_02_28;

public class PlantEx {

	public static void main(String args[]) {
		Plant plt = new Plant(); // 객체 생성 및 사용
		plt.name = "틔움";
		plt.humidity = 30;
		plt.Temperatures = "25도";
		plt.water = 200;
		plt.sunshine = 5;
		plt.auto = 7; 
		plt.on();
		
//		정보 변경
		plt.setSpeed();
		plt.on();
		
	}

}

class Plant {

	String name; // 이름
	int humidity; // 습도
	String Temperatures; // 온도 //int로 쓰되 사용할 때 문자열 결합
	int water; // 현재 남아있는 물 양
	int sunshine; // 일조량
	int auto; // 자동 물 공급 시간

	public void on() {
		System.out.println("식물 이름: " + name + ", 습도 : " + humidity + ", 온도 : " + Temperatures +", 물: " + water + ", 일조량: " + sunshine + ", 공급 시간: " + auto);
	}
	
	// 정보 변경 함수
	public void setSpeed() {
		humidity -= 10;
	}
}