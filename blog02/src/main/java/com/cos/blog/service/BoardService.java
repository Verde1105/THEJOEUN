package com.cos.blog.service;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cos.blog.model.Board;
import com.cos.blog.model.RoleType;
import com.cos.blog.model.User;
import com.cos.blog.repository.BoardRepository;
import com.cos.blog.repository.UserRepository;

//스프링이 컴포넌트 스캔을 통해서 빈에 등록을 해줌(ioc해주는거임)
@Service
public class BoardService {

	@Autowired
	private BoardRepository boardRepository;

	@Transactional
	public void 글쓰기(Board board, User user) {//받는거 두가지 타이블 + 컨텐츠
		board.setCount(0);
		board.setUser(user);
		boardRepository.save(board);
	} 
	
	public Page<Board> 글목록(Pageable pageable) {
		return boardRepository.findAll(pageable);
	}
}
