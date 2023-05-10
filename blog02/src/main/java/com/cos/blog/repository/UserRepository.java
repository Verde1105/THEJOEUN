package com.cos.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cos.blog.model.User;

//DAO
//자동으로 빈 등록이 된다.
//전에는 어노테이션 레파지토리라고 해주었어야하지만 지금은 생략가능
public interface UserRepository extends JpaRepository<User,Integer>{
	
	
	
	
	
	
}
