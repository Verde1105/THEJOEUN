package Java_2023_03_10;

import org.omg.CORBA.PUBLIC_MEMBER;

public class 시험예상문제 {
	String str = "";
	public void foo(int i) {
		try {
			if (i == 1) {
				throw new Exception();
			}
			str += "1";
		} catch (Exception e) {
			str += "2";
			return;
		}finally {
			str += "3";
		}
		str += "4";
	}
	
	public static void main(String[] args) {
		시험예상문제 ee = new 시험예상문제();
			ee.foo(0);
			ee.foo(1);
		System.out.println(ee.str);
			
		}
}
