package 연습용20230315;

public class 스레드Ex {
	
	public static void main(String[] args) {
		
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("에헤이 진짜");
				for (int i = 0; i < 50; i++) {
					System.out.println("t : " +i);
				}
			}
		});
		
		Thread tt = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("클래스에 클래스를 넣지 맙시다");
				for (int i = 0; i < 50; i++) {
					System.out.println("tt : " +i);
				}
			}
		});
		
		t.start();
		tt.start();
		//일손 남는 경우가 일거리 가져가는게 스레드
	}
}
