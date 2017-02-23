package com.multicampus.biz.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.multicampus.biz.user.vo.UserVO;

public class UserServiceClient {

	public static void main(String[] args) {
		ApplicationContext factory = 
			new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = 
				(UserService)factory.getBean("userService");
		
		UserVO vo = new UserVO();
		vo.setId("test");
		vo.setPassword("test");
		
		UserVO user = userService.getUser(vo);
		if(user != null){
			System.out.println(user.getName() + "님 로그인 환영합니다.");
		}else{
			System.out.println("로그인 실패");
		}
	}
}
