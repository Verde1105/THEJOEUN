package com.cos.blog.handler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GlobalExceptionHandler {

	@ExceptionHandler(value = IllegalArgumentException.class)
	public String handleAgumentException(IllegalArgumentException e) {
		return " <h1>" + e.getMessage()+"</h1>";
	}
}
