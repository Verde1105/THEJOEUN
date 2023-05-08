package Java_2023_03_22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DELx1 {
	public static void main(String[] args) {
		String dr = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/app";
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName(dr);
			con = DriverManager.getConnection(url,"root", "java");
			st = con.createStatement();
//			String sql = "create table del("
//					+ "id int primary key auto_increment,"//얘를 pk로 지정하고 이후 하나씩 값이 증가되게 할것이다.
//					+ "ID varchar(15)," 
//					+ "PW varchar(20),"
//					+ "Balance INT,"
//					+ "계좌번호 varchar(20))";
//			st.executeUpdate(sql);
			String de = insert();
			st.executeUpdate(de);
		} catch (Exception e) {
		}finally {
			try {
				if(st != null) st.close();
				if(rs != null) rs.close();
				if(con != null) con.close();
			} catch (Exception e2) {
			}
		}
	}
	public static String insert() {
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("성함을 입력해주세요.");
		System.out.print(">>");
		String name = sc.next();
		System.out.println("계좌를 입력해주세요!");
		System.out.print(">>");
		String num = sc.next();
		System.out.println("가입하신 핸드폰 번호를 입력해주세요.");
		System.out.println("해당 번호로 인증 메세지가 발송 됩니다!");
		//만약 otp설정하려면, 랜덤 돌려서 '개인번호' 만들어주고, 폰번호 맞을시 otp 발송. 이후 otp+계좌번호 입력하면 삭제.
		System.out.print(">>");
		String phone = sc.next();
//		String de = "insert into plan where name =" + "('"+name+"')" + " and where 계좌번호 =" + "('"+num+"')" + " and where phone =" + "('"+phone+"') ";//두개 교집합으로 합해야함+합함.
		ALTER TABLE 테이블명 DROP PRIMARY KEY DROP INDEX; << '인덱스랑 프라이머키도 동시에 삭제가능한 코드'.
		System.out.println("계정이 삭제되었습니다!");
		System.out.println("삭제를 취소하고 싶으시다면 일주일 안에 고객센터로 문의 바랍니다!");//코드는 사용가능
		 */
		//해당 수식이 사용 가능이라면 앞에 이름이든 계좌든 달자.
		//System.out.println("기존 비밀번호를 입력해주세요!");
		//System.out.print(">>");
		//String pw = sc.next();
		//System.out.println("신규 비밀번호를 입력해주세요!");
		//System.out.print(">>");
		//String password = sc.next();
		System.out.println("아이디를 입력해주세요.");
		System.out.print(">>");
		String id = sc.next();
		System.out.println("확인되었습니다!");//연동(getid(i)getid.equals(database))
		System.out.println("수정 할 비밀번호를 입력해주세요.");
		System.out.print(">>");
		String up = "Update plan SET PW = " + "('"+Update+"')" + ", where ID = " + "('"+id+"')";
//		String de = "alter table attest change from plan where pw =" + "('"+pw+"')" + "('"+password+"') varchar(30)not null";
//		String de = "delete from plan where name =" + "('"+name+"')" + " and where 계좌번호 =" + "('"+num+"')" + " and where phone =" + "('"+phone+"')";//두개 교집합으로 합해야함+합함.
//		String qu = "alter table attest change column pw password varchar(30)not null";//칼럼의 pw라는 이름을 password로 바꾸겠다.//비번 수정문으로 고치기
		//		String de = "delete from del where id = '아_이'";
//		String de = "insert into del where id = '토%'";
	}
}
