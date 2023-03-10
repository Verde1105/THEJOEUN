package Java_2023_03_10;

public class BeerThreadEx2 {
	public static void main(String[] args) {
		Thread thread = new BeerThread();
		thread.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
		}
	}
}
