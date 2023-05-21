package com.cos.blog.Controller.thejoeun;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThejoeunController {

	@GetMapping("/thejoeun/index")
	public String index() {//컨트롤에서 세션을 어떻게 찾는가?
		return "thejoeun/index";
	}
	
	@GetMapping("/thejoeun/gen")
	public String gen() {
		return "thejoeun/generic";
	}
	
	@GetMapping("/thejoeun/ele")
	public String ele() {
		return "thejoeun/elements";
	}

}
//@AuthenticationPrincipal PrincipalDetail principal
