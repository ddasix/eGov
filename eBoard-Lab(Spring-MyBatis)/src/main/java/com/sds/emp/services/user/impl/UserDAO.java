package com.sds.emp.services.user.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.sds.emp.services.user.IUserDAO;
import com.sds.emp.services.user.vo.UserVO;

@Repository("userDAO")
public class UserDAO extends SqlSessionDaoSupport implements IUserDAO {

	public UserVO getUser(String userId) throws Exception {
		return (UserVO) getSqlSession().selectOne("User.getUser", userId);
	}
}
