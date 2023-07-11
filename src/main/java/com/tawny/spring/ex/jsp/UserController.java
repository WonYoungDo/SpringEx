package com.tawny.spring.ex.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tawny.spring.ex.jsp.domain.User;
import com.tawny.spring.ex.jsp.service.UserService;

@RequestMapping("/jsp/user")
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	// 이름, 생년월일, 이메일, 자기소개 전달 받고 데이터 저장
//	@RequestMapping(path="/jsp/user/add", method=RequestMethod.POST)
	@PostMapping("/add")
	@ResponseBody
	public String creatUser(
			@RequestParam("name") String name
			, @RequestParam("birthday") String birthday
			, @RequestParam("email") String email
			, @RequestParam("introduce") String introduce) {
		int count = userService.addUser(name, birthday, email, introduce);
		return "입력성공 : " + count;
	}

	// userInput 페이지 보여주기
	@GetMapping("/input")
	public String userInput() {
		return "jsp/userInput";
	}

	
	// 가장 최근에 등록된 사용자 정보
	@GetMapping("/lastuser")
	public String lastUser(Model model) { // jsp 경로를 보여주기 위함 String으로
		
		User user = userService.getLastUser();
		
		model.addAttribute("result", user);
		
		return "/jsp/userInfo";
		
		
	}

}
