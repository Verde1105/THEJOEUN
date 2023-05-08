package Java_2023_03_21;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Java_2023_03_20.DBaction;
/*
 alter문
attest [테이블 생성]
create table attest(id varchar(10) not null, pw varchar(10))
실습1) 테이블에 새로운 컬럼 추가
실습2) 테이블의 컬럼타입 수정
실습 3) 테이블의 컬럼 이름 변경
실습4) 테이블의 컬럼 삭제

문제1) mamber테이블에 primary key 추가(pk : 계좌번호 // fk : 거래내역)
문제2) 회원탈퇴 만들기 ()
문제3) 회원 등급제 만들기
문제4) 관리자 모드 만들기
문제5) 생일 입력하여 이벤트 챙겨주기
문제6) 뱅크 사용자(회원)의 출력페이지를 만들고 5명씩 페이지별로 자르기(오름차순 내림차순)
문제7) 거래내역 출력(거래내역 = transaction)
문제8) 회원가입일 입력하시오
문제9) 회원가입 수정 가능하게 만들기(수정가입 창)
문제10) 
개별문제 // 주소 리스트(서울 부산 등 겹치지 않도록) 만들어서 일반적인 주소 검색창 만들기 (시.도 선택>> 군.구 선택>> 동 입력하면 해당하는 주소들만 awt리스트에 출력되도록)

*/

public class DBEx16 {
	public static void main(String[] args) {
		Connection con = DBaction.getInstance().getConnection();
//		PreparedStatement pstmt = null;
		Statement st = null;
		ResultSet rs = null;
		try {
//			String sql = "create table DBaction(ID varchar(5), PW varchar(15), age int)";//id = 컬럼
//			st.executeUpdate(sql);
			String qu = alter();
			st = con.createStatement();//얼터로 테이블을 갈아엎어
			st.executeUpdate(qu);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)rs.close();
//				if(pstmt != null)pstmt.close();
				if(st != null)st.close();
				if(con != null)con.close();
			} catch (SQLException e2) {
			}
		}
	}
	
	public static String alter() {
		String qu = "alter table attest add column age varchar(10) not null";//age 칼럼에 varchar(10)을 준다.
//		String qu = "alter table attest modify column age int";//age 칼럼을 int로 바꾸기
//		String qu = "alter table attest change column pw password varchar(30)not null";//칼럼의 pw라는 이름을 password로 바꾸겠다.
//		String qu = "alter table attest drop column age";//전부삭제
		return qu;
	}
}
