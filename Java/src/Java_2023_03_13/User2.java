package Java_2023_03_13;

public class User2 extends Thread{
	private Calculator calculator;
	public void setCalculator(Calculator calculator) {
		this.setName("User2");
		this.calculator = calculator;
	}
	public void run() {
		calculator.setmemory(50);
		
	}
}
