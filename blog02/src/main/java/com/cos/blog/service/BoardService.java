package com.cos.blog.service;

//import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties.Build;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cos.blog.dto.ReplySaveRequestDto;
import com.cos.blog.model.Board;
import com.cos.blog.model.Reply;
import com.cos.blog.model.RoleType;
import com.cos.blog.model.User;
import com.cos.blog.repository.BoardRepository;
import com.cos.blog.repository.ReplyRepository;
import com.cos.blog.repository.UserRepository;

//스프링이 컴포넌트 스캔을 통해서 빈에 등록을 해줌(ioc해주는거임)
@Service
public class BoardService {

	@Autowired
	private BoardRepository boardRepository;

	@Autowired
	private ReplyRepository replyRepository;

	@Autowired
	private UserRepository userRepository;
	
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
	
	@Transactional
	public void 글수정하기(int id,Board requestBoard) {
		Board board = boardRepository.findById(id)
				.orElseThrow(()->{
					return new IllegalArgumentException("글 찾기 실패 : 대당하는 글을 찾을 수 없습니다.");
				});//영속화 완료
		board.setTitle(requestBoard.getTitle());
		board.setCount(requestBoard.getCount());
		//해당 함수 종료시(서비스 조욜시) 트랜잭션 종료, 자동 업데이트가 되어서 db에 갱신
	}
	
	@Transactional
	public void 댓글쓰기(ReplySaveRequestDto replySaveRequesDto) {
//		User user = userRepository.findById(replySaveRequesDto.getUserid()).orElseThrow(()->{
//			return new IllegalArgumentException("댓글쓰기 실패 : 유저아이디를 찾을수 없습니다.");
//		});//영속화 완료
//		
//		Board board = boardRepository.findById(replySaveRequesDto.getBoardid()).orElseThrow(()->{
//			return new IllegalArgumentException("댓글쓰기 실패 : 게시글 아이디를 찾을수 없습니다.");
//		});//영속화 완료 // 리플리 세이프 리퀘스트 dto에서 쿼리문 실행을 만들었기때문에 영소고하가 필요가 없다.
		
//		Reply reply = Reply.builder()
//				.user(user)
//				.board(board)
//				.content(replySaveRequesDto.getContent())
//				.build();
		
//		Reply reply = new Reply();
//		reply.update(user, board, replySaveRequesDto.getContent()); 이렇게 만드는 방식도 있지만 사용하지 않음
		
		int result = replyRepository.mSave(replySaveRequesDto. getUserid(), replySaveRequesDto.getBoardid(), replySaveRequesDto.getContent());
	}
}
