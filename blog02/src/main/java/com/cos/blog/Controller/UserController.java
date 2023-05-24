package com.cos.blog.Controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.cos.blog.config.auth.PrincipalDetail;

@Controller
public class UserController {

	@GetMapping("/auth/joinForm")
	public String joinForm() {
		return "user/joinForm";
	}
	
	@GetMapping("/auth/loginForm")
	public String loginForm() {
		System.out.println("Success Login");
		return "user/loginForm";
	}
	@GetMapping("/auth/kakao/callback")
	public @ResponseBody String kakaoCallback(String code) {//@ResponseBody = 데이터를 리턴해주는 컨트롤러 함수
		RestTemplate rt = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-type","application/x-www-form-urlencoded;charset=utf-8");
		
		MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
		params.add("grant_type", "authorization_code");
		params.add("client_id", "e629bfd8e3ae75a62fdc225cda9c4a9c");
		params.add("redirect_uri", "http://localhost:8080/auth/kakao/calback");
		params.add("code", code);
		//좋은 방법들은 아님. 지금은 그저 익히기 위해서일뿐, 더 좋은방법은 많음.
	
		//http body를 하나의 오브젝트에 담기
		HttpEntity<MultiValueMap<String, String>> kakaoTokenRequest = new HttpEntity<>(params,headers);
		
		//http 요청하기 post 방식으로 그리고 리스폰스 변수의 응답받음.
		ResponseEntity<String> response = rt.exchange(
					"https://kauth.kakao.com/oauth/token", HttpMethod.POST,kakaoTokenRequest,String.class
				);
		
		return "카카오 토큰 요청 완료" + response;
	}
	
	@GetMapping("/user/updateForm")
	public String updateForm(@AuthenticationPrincipal PrincipalDetail principal) {
		System.out.println("회원정보 수정!");
		return "user/updateForm";
	}
}
