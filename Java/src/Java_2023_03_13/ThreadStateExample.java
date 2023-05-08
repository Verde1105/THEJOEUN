package Java_2023_03_13;

public class ThreadStateExample {
		public static void main(String[]argas) {
			StatePrintThread statePrintThread 
			= new StatePrintThread(new TargetThread());
			
//			= new StatePrintThread(new TargetThread());
			statePrintThread.start();
		}
}
