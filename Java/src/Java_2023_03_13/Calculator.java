package Java_2023_03_13;

public class Calculator {
	private int memory;
	public int getmemory() {
		return memory;
	}
//	public void setmemory(int memory) {
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
}
