package Java_2023_03_10;

public class ThreadEx3 implements Runnable{
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("잡업1");
			}
		}
	}
	public static void main(String[] args) {
		ThreadEx3 threadEx3 = new ThreadEx3();
		Thread thread1 = new Thread(threadEx3);
		thread1.start();
		ThreadEx threadEx = new ThreadEx();
		threadEx. start();
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("ThreadMain");
			}
		}
	}
}
