package 연습용20230315;

//싱글스레드 : 위에서부터 하나씩 순차적으로 내려옴
public class 스레드Ex1 {
	public static void main(String[] args) {
		for (int i = 0; i < 300; i++) {
			System.out.println("-");
		}
		
		for (int i = 0; i < 300; i++) {
			System.out.println("|");
		}
	}
	
	
}
