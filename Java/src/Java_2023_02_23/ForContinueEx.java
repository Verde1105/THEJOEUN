package Java_2023_02_23;
public class ForContinueEx {

	private static void main(String[] args) {
		continue1();
	}
	
	public static void continue1() {
		int k =0;
		for(int i =0; i<10; i++) {
			System.out.println("반복 실행문");
			k++;
			if(k > 4) {
				continue;
			}
			System.out.println("반복실행 제한");
		}
	}
}