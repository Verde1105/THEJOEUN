package com.cos.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class BoardController {
//
//	@GetMapping("/http/lombok")
//	public String test() {
////		BoardDTO DTO = new BoardDTO(01, 01, "아깽" , "게시판테스트" , "내용" , "date");
////		System.out.println(DTO.getClass());
//		return "롬복 테스트 완료";
//	}
//	
//	@GetMapping("/http/get")
//	public String  getBoard(@RequestParam BoardDTO DTO) {
//		return "get" + DTO.getClass();
//	}
//	@PostMapping("/http/post+보드로 주소 되게끔.")
//	public String postTest(@RequestBody BoardDTO DTO) {
//		return "post" + DTO.getClass(); 
//	}
//	@PutMapping("/http/put")
//	public String putTest(@RequestBody BoardDTO DTO) {
//		return "put" + DTO.getClass();
//	}
//	@DeleteMapping("/http/delete")
//	public String deleteTest() {
//		return "delete";
//	}
//	
//}
