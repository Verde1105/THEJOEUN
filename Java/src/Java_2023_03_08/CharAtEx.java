package Java_2023_03_08;

public class CharAtEx {
	public static void main(String[] args) {
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7);
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		}
		String str1 = String.valueOf(10);//투스트링이랑 비슷한
		String str2 = String.valueOf(10.5);
		String str3 = String.valueOf(true);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
	
}
