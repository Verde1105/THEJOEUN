package study;

import study.DAO.ImplementMember;
import study.DTO.User;

public class Main {
	public void name() {
		
	ImplementMember member = new ImplementMember();
	User user = new User();
	
	
	member.updateUser(user);
	}
	
	//이곳은 DTO,DAO의 소스가 멀쩡한지 확인하는 테스트용 메인입니다.
	//실행문 작성은 jsp파일에 부탁드립니다.
}
