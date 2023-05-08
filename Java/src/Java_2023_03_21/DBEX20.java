package Java_2023_03_21;
/*
그룹화하여 데이터 조회(group by)
대표적인 그룹 함수 count(), avg(), min(), max(), sum() 함수 등과 having 절(조건절)을 사용함.
해빙은 웨얼의 부가적인것.
gbtest
create tabe gbtaet()
idx int,
type int,
name varchar(10));
insert into gbtest values(1,1,'홍길동');
insert into gbtest values(2,1,'이순신');
insert into gbtest values(3,2,'만득이');
insert into gbtest values(4,2,'개똥이');
insert into gbtest values(5,3,'칠득이');
insert into gbtest values(6,3,'갑돌이');
insert into gbtest values(7,4,'갑순이');

1. 유형별로 갯수를 가져오고 싶은데, 단순히 count 함수로 데이터를 조회하면 전체 갯수만을
2. 컬럼 그룹화 : type 그룹화하여 name 갯수조회 (칼럼 그룹화)
3. type 1 초과인, type 그룹화하여 name 갯수 조회 (조건 처리 후 칼럼 그룹화)
4. type 1 초과인, type 그룹화하여 name 갯수를 가져온 후, 그 중에 갯수가 2개 이상인 데이터 조회 (조건 처리 후,칼럼 그룹화 이후, 조건처리)
연습문제 ) type 1 초과인, type 그룹화하여 name 갯수를 가져온 후, 그중에 갯수가 2개 이상인 데이터를 type 내림차순 정렬로 조회(내립차순 정렬)
 뱅크 사용자(회원) 회원등급별로 일반 회원 초과 회원(ex:vip)의 생년월일(인원파악)을 출력하시오(ex:기념일)
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBEX20 {
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
			String sql = "create tabe gbtaet("
					+ "idx int,"
					+ "type int, name varchar(10))";
			st.executeUpdate(sql);
			String qu = insert();
			st.executeUpdate(qu);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(st != null )st.close();
				if(rs != null )rs.close();
				if(con != null )con.close();
			} catch (Exception e2) {}
		}
	}
	
	public static String insert() {
		String qu = "insert into gbtest values(1,1,'홍길동')";
//		String sql = "insert into gbtest values(2,1,'이순신')";
//		String sql = "insert into gbtest values(3,2,'만득이')";
//		String sql = "insert into gbtest values(4,2,'개똥이')";
//		String sql = "insert into gbtest values(5,3,'칠득이')";
//		String sql = "insert into gbtest values(6,3,'갑돌이')";
//		String sql = "insert into gbtest values(7,4,'갑순이')";
		return qu;
	}
	
	public static String select() {
//		String sql = "select count(type) from dbtest";
//		String sql = "select type, count(name) as cnt ftom gbtest group by type";
//		String sql = "select type, count(name) as cnt ftom gbtest where type > 1 group by type";
//		String sql = "select type, count(name) as cnt ftom gbtest where type > 1 group by type having cnt >=2";
		String sql = "select type, count(name) as cnt ftom gbtest where type > 1 group by type having cnt >=2 drder by type desc";
		return sql;
	}
}
