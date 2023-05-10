package com.cos.blog.model;

import java.util.List;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cos.blog.repository.UserRepository;

import net.bytebuddy.asm.Advice.OffsetMapping.Sort;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

@RestController
public class DummyControllerTest {

	@Autowired//의존성 주입
	private UserRepository userRepository;
	
	@GetMapping("/dummy/users")
	public List<User> list(){
	   return userRepository.findAll();
	}
	
	@GetMapping("/dummy/user")//size 갯수에 따라 한 페이지에 몇개나 가져올지 정할 수 있음.
	public List<User> pageList(@PageableDefault(size = 2, sort = "id", direction = Direction.DESC)Pageable pageble){
		Page<User> pagingUser = userRepository.findAll(pageble);
		if(pagingUser.isLast()) {
			
		}
		List<User> users = pagingUser.getContent();
		return users;
	}
	
//	http://localhost:8000/blog/dummy/user/
//	{id} 주소로 파라미터를 전달받을 수 있음.
	@GetMapping("/dummy/user/{id}")
//	public User detail(@PathVariable int id) {
////		옵션으로 유저 객체를 감싸서 가져온다
////		이후 널인지 아닌지 판단해서 리턴
//		User user = userRepository.findById(id).orElseGet(new Supplier<User>() {//.orElseGet = 널 값일때 새 서플라이어를 만들어서 보여줘
//			@Override
//			public User get() {
//				return new User();
//			}
//			
//		});
//		//.get이라 하면 널값이 날리 없는 확신범일때 쓰는것.
//		return user;
//	}덜좋아하는 방법
	
	public User detail(@PathVariable int id) {
		User user = userRepository.findById(id).orElseThrow(new Supplier<IllegalArgumentException>() {
			@Override
			public IllegalArgumentException get() {
				return new IllegalArgumentException("존재하지 않는 유저입니다! id : " + id);
			}
		});
		return user;
	}
	
	//http://localhost:8000/blog/dummy/join
	@PostMapping("/dummy/join")
	public String join(User user) {
		System.out.println("username : " + user.getClass());
		System.out.println("password : " +user.getClass() );
		System.out.println("email : " + user.getClass() );
		
		userRepository.save(user);
		return"회원가입이 완료되었습니다.";
	}
	
}
