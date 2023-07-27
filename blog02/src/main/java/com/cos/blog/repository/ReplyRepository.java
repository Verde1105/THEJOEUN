package com.cos.blog.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cos.blog.dto.ReplySaveRequestDto;
import com.cos.blog.model.Reply;

public interface ReplyRepository extends JpaRepository<Reply,Integer>{

	@Transactional
	@Query(value = "INSERT INTO reply(userid, boardid, content, createDate) VALUES(?,?,?, now())", nativeQuery = true)
	int mSave(int userid, int boardid, String content);
}
