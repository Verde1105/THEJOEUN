package Home_Java;

public class 파라미터 {

//	public static void power(int number) {
//		int result = number * number;
//		System.out.println(number + "의 2 승은" + result);
//		
//	}
	public static int getPower(int number) {
		int result = number * number;
		return result;
	}
//	public static void powerByExp(int number, int exponent) {
//		int result = 1;
//		for (int i =0; i < exponent; i++) {
//			result *= number;
//		}
//		System.out.println(number+ "의" + exponent + "승은" + result);
	
	public static int powerByExp(int number, int exponent) {
		int result = 1;
		for (int i = 0; i < exponent; i++) {
			result *= number;
		}
	}
	
	public static void main(String[] args) {
		int retVal getPower(number2); // 2 * 2 = 4;
		System.out.println(retVal);
		
		retVal = getPower(number3);
		System.out.println(retVal);// 3 * 3 =9
		
		retVal = getPowerByExp(number3, exponent3);
		System.out.println(retVal);// 3 * 3 * 3 = 27
		
		System.out.println(getPowerByExp(number2,exponent4)); // 2 * 2 * 2 * 2 = 16
	}
		//전달값, 패러미터
		//2 > 2*2 =4
		//3 > 3*3 =9
		
		//아규먼츠, 인수
//		power(number2); //2 * 2 = 4
//		power(number3); //3 * 3 = 9
//		powerByExp(number2, exponent3); // 2 * 2 * 2 = 8
//		powerByExp(number3, exponent3); // 3 * 3 * 3 = 27
//		powerByExp(number10,exponent10); // 1
		
}
