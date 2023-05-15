package com.cos.blog.Controller;

import java.awt.print.Pageable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cos.blog.config.auth.PrincipalDetail;
import com.cos.blog.service.BoardService;

import net.bytebuddy.asm.Advice.OffsetMapping.Sort;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;
	
//	private PrincipalDetail principal;
	
	@GetMapping({"/","/"})
	public String index(Model model, @PageableDefault(size=3, sort="id", direction = Direction.DESC) Pageable pageable) {//컨트롤에서 세션을 어떻게 찾는가?
//		System.out.println("로그인 사용자 아이디 :" + principal.getUsername());
		model.addAttribute("boards",boardService.글목록(pageable));
		return "index";
	}
	
	//user권한 필요
	@GetMapping("/board/saveForm")
	public String saveForm() {
		return "board/saveForm";
	}
}
//@AuthenticationPrincipal PrincipalDetail principal
