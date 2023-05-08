package Java_2023_03_15;

public class DBEx {
	
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
//		String driver = "oracle.jdbc.driver.OracleDriver";
		
		try {
			Class.forName(driver);
			System.out.println("데이터베이스 드라이버 로딩 성공!");
		} catch (Exception e) {
			System.out.println("데이터베이스 드라이버 로딩 실패!");
		}
		
	}
}
