package Java_2023_03_08;

public class StringEx {
	/*형식
	String str1 = "A";
	String str2 = "A";
	String str3 = new String("A");
	*/
	
	public static void main(String[] args) {//다시 물어보자...
		Object o = "Obj"; //형변환
		String s = "Obj";
		String s2 = "Obj";
		o = "Obj2";
		String z = null;
		String d = "";
		if (o instanceof Object) {
			System.out.println("ok!\n");
		}
		System.out.println(o);
		System.out.println(z = o.toString());
		System.out.println(s.equals(d));
		System.out.println(o == s);
				o=s;
				String s3 = new String("Obj");
				System.out.println("결과1 : " + (s == s3));
				System.out.println("결과2 : " + s.equals(s3));
	}
}
