package com.multicampus.biz.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.multicampus.biz.user.vo.UserVO;

@Repository
public class UserDAO {
	@Autowired
	private SqlMapClientTemplate sqlMapClientTemplate;
	
	public UserVO getUser(UserVO userVO) {
		return (UserVO)sqlMapClientTemplate.queryForObject("getUser", userVO);
	}
}

