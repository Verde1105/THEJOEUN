package Java_2023_02_21.app;

public class VarEx 
{
	public static void main(String args[])
	{
		//변수와 상수 목적에 따라 변하는 값이 변수, 재대입 불가한 수가 상수.
		int su; //final을 앞에 붙이면 상수 선언
		su = 10;
		System.out.println(su);
		su = 20;
		System.out.println(su);
		su = 30;
		System.out.println(su);
		String str = "문자열 값";
		System.out.println(str);
		str = "변경된 문자열 값";
		System.out.println(str);
		String str2 = "새로운 문자열 값";
		System.out.println(str2);
	}
}
