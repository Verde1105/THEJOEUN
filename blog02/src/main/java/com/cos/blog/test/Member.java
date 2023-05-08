package com.cos.blog.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {
	
	private int id = 1;
	private String username = "test";
	private String password = "0001";
	private String email = "test@nate.com";

}
