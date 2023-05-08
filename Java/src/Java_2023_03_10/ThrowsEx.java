package Java_2023_03_10;

public class ThrowsEx {//메인에게 떠넘기기
	public static void main(String[] args) throws Exception{
		Class clazz = Class.forName("java.lang.String2");
		a();
	}
	static void a() throws Exception{
		Class clazz = Class.forName("java.lang.String2");
		throw new Exception();
	}
}
