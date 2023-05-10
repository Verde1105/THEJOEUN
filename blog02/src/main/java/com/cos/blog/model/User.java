package com.cos.blog.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

@Entity//유저 클래스가  자동으로 데이터베이스에 테이블 생성
public class User {

	@Id//프라이머리키 생성
	@GeneratedValue(strategy = GenerationType.IDENTITY)//프로젝트에서 연결 된 db의 넘버링 전략을 '따라간다.=아이덴티티'
	private int id;
	
	@Column(nullable = false,length = 30)
	private String username;
	
	@Column(nullable = false,length = 100)
	private String password;
	
	@Column(nullable = false,length = 50)
	private String email;

	@ColumnDefault("user")
	private String role;//Enum-이넘 을 쓰는게 좋다. //어드민,유저.매니저(특정 권한을 줄수있다)
	
	@CreationTimestamp//시간이 자동입력
	private Timestamp ecreateDate;;
}
