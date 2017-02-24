package com.multicampus.biz.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.multicampus.biz.user.UserDAO;
import com.multicampus.biz.user.UserService;
import com.multicampus.biz.user.vo.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	@Qualifier("userDAOIbatis")
	private UserDAO userDAO;
	
	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}

}
