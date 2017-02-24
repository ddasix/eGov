package com.sds.emp.services.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sds.emp.common.EmpException;
import com.sds.emp.services.user.IUserDAO;
import com.sds.emp.services.user.UserService;
import com.sds.emp.services.user.vo.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private IUserDAO userDAO;
	
	public UserVO getUser(String userId) throws EmpException {
		try {
			UserVO userVO = userDAO.getUser(userId);
			System.out.println("#############"+userVO);
			if (userVO == null) {
				throw new EmpException("User Id가 '" + userId + "'인 회원 정보가 존재하지 않습니다. 신규 회원으로 등록하시기 바랍니다.");
			}
			return userVO;
		} catch (Exception e) {
			if (e instanceof EmpException)
				throw (EmpException) e;
			else {
				throw new EmpException("User Id가 '" + userId + "'인 회원의 상세 정보를 조회하는데 실패하였습니다.", e);
			}
		}
	}
}
