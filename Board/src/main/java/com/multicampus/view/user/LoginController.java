package com.multicampus.view.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.multicampus.biz.user.UserService;
import com.multicampus.biz.user.vo.UserVO;

@Controller("/login.do")
public class LoginController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String loginView(@ModelAttribute("user") UserVO vo){
		vo.setId("test");
		vo.setPassword("test");
		return "login.jsp";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String login(UserVO vo) {
		if(userService.getUser(vo) != null){
			return "getBoardList.do";
		} else {
			return "login.jsp";
		}
	}
}










