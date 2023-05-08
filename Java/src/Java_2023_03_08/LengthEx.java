package Java_2023_03_08;

public class LengthEx {

	public static void main(String[] args) {
		String ssn = "7306241230123";
		int lenght = ssn.length();
		if (lenght == 13) {
			System.out.println("주민번호 자리수가 맞습니다.");
		}else {
			System.out.println("주민번호 자리수가 틀립니다.");
		}
	}
}
