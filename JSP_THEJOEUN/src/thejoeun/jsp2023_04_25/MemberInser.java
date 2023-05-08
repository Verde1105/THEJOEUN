package thejoeun.jsp2023_04_25;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

public class MemberInser {
	public void insert(Member member) {
		JdbcTemplate Template = new JdbcTemplate();
		KeyHolder keyholder = GeneratedKeyHolder();
		Template.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con)
			throws SQLException{
				PreparedStatement pstmt = con.prepareStatement("insert into MEMBER(EMAIL, PASSWORD, NAME, REGDATE) " + "VALUES ( ? , ? , ? , ?)",new String[] {"id"});
				pstmt.setString(1, member.getemail());
				pstmt.setString(2, member.getpassword());
				pstmt.setString(3, member.getname());
				pstmt.setTimestamp(4, Timestamp.valueOf(member.getregisterDateTime()));
				return pstmt;
			}
		}, keyholder);
		Number keyvalue = keyholder.getKey();
		member.setid(keyvalue.longValue());
	}
}
