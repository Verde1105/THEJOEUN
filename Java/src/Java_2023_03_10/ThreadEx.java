package Java_2023_03_10;

public class ThreadEx extends Thread{
	@Override
	public void run() {
		try {
			while (true) {
				Thread.sleep(500);
				System.out.println("작업1");

			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("작업");
	}

	public static void main(String[] args) {//슬립은 시간설정이 가능하다.
		ThreadEx thread = new ThreadEx();
		int i = 0;
		while (true) {
			try {
				Thread.sleep(1000);
				System.out.println((++i)+"메인작업");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
//		ThreadEx thread = new ThreadEx();
//		thread.start();
	}
}
