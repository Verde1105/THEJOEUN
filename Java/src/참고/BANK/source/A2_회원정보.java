package 참고.BANK.source;

public class A2_회원정보 {
	public static void 회원정보(String[][] database) {
		// 2. 입력된 데이터 확인
		for (int i = 0; i < database.length; i++) {
			System.out.println(i+", ID : " + database[i][0]+", PW : " + database[i][1]+", BALANCE : " + database[i][2] + " , 계좌번호 : "+database[i][3]+ " , 가입날짜 : "+database[i][4]);
		}// The end of for (data select *)
	}
}
