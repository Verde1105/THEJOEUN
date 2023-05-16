package com.cos.blog.service;

//import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
	
	@Transactional(readOnly = true)
	public Page<Board> 글목록(Pageable pageable) {
//		return boardRepository.findAll(pageable);
		return boardRepository.findAll(pageable);
	}
	
	@Transactional(readOnly = true)
	public Board 글상세보기(int id) {
		return boardRepository.findById(id)
				.orElseThrow(()->{
					return new IllegalArgumentException("글상세보기 실패 : 아이디를 찾을수가 없습니다.");
				});
	}
	
	@Transactional(readOnly = true)
	public void 글삭제하기(int id) {
		System.out.println("글삭제하기 : " + id);
		boardRepository.deleteById(id);
		
	}
	
	public void 글수정하기(int id,Board requestBoard) {
		Board board = boardRepository.findById(id)
				.orElseThrow(()->{
					return new IllegalArgumentException("글 찾기 실패 : 대당하는 글을 찾을 수 없습니다.");
				});//영속화 완료
		board.setTitle(requestBoard.getTitle());
		board.setCount(requestBoard.getCount());
	}
}
