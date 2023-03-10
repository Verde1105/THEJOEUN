package Java_2023_03_10;

public class ThreadEx2 implements Runnable{
	@Override
	public void run() {
		try {
			Thread.sleep(500);;
			System.out.println("작업1");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ThreadEx2 threadEx2 = new ThreadEx2();
		Thread thread = new Thread(threadEx2);
		thread.start();
	}
		
}
