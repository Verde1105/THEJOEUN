package Java_2023_03_10;

public class NumberFormatEx {
	public static void main(String[] args) {
//		디버깅 처리
		String data1 = "100";
		String data2 = "100";
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		int result = value1 + value2;
//		System.out.println(data1 + "+" + data2 + "+" + result);
		int su = Integer.parseInt(args[0]);
		System.out.println(su);
	}
}
