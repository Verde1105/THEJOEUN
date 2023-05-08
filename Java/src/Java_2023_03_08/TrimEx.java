package Java_2023_03_08;
//공백을 잘라주는것
public class TrimEx {
	public static void main(String[] args) {
		String tell = "  02";
		String tel2 = "123   ";
		String tel3 = "   1234   ";
		String tel = tell.trim() + tel2.trim() + tel3.trim();
		String tel_old = tell + tel2 + tel3;
		System.out.println(tel_old);
		System.out.println(tel);
	}
}
