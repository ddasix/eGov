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
				throw new EmpException("User Id�� '" + userId + "'�� ȸ�� ������ �������� �ʽ��ϴ�. �ű� ȸ������ ����Ͻñ� �ٶ��ϴ�.");
			}
			return userVO;
		} catch (Exception e) {
			if (e instanceof EmpException)
				throw (EmpException) e;
			else {
				throw new EmpException("User Id�� '" + userId + "'�� ȸ���� �� ������ ��ȸ�ϴµ� �����Ͽ����ϴ�.", e);
			}
		}
	}
}
