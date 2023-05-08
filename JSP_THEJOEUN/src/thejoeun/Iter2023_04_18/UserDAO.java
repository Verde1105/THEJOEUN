package thejoeun.Iter2023_04_18;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;import study.DTO.User;
import thejoeun.Servlet2023_04_13.UserInfo;

public interface UserDAO {
	List<UserInfo> selectList()throws Exception;
	int insert(UserInfo userInfo)throws Exception;
	int delete(String id)throws Exception;
	UserInfo selectOne(String id)throws Exception;
	int update(UserInfo userInfo)throws Exception;
	UserInfo exist(String id, String password)throws Exception;
}
