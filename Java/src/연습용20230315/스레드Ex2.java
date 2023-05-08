package 연습용20230315;

public class 스레드Ex2 {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
	}
}

class Thread1 extends Thread{
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.println("-");
		}
	}
}

class Thread2 extends Thread{
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.println("|");
		}
	}
}