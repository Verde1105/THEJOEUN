package com.cos.blog.model;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Board {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false, length = 100)
	private String title;

	@Lob//대용량 데이터
	private String content;
	
	@ColumnDefault("0")//조회수
	private int count;
	
	@ManyToOne(fetch = FetchType.EAGER)//한명의 유저가 많은 게시글을 쓸 수 있음 user = one
	@JoinColumn(name="userId")//데이터베이스는 오브젝트를 저장할 수 없다. fk, 자바는 오브젝트를 저장할수 있다.
	private User user;
	
	@OneToMany(mappedBy = "board", fetch = FetchType.EAGER)//맵바이가 적혀있으면 연관관계의 주인이 아니다(fk가 아님을 선언)db에 칼럼을 만들지 마라.
	private List<Reply> reply;
	
	@CreationTimestamp
	private Timestamp createDate;
}
