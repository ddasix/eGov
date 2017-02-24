package com.sds.emp.services.user;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sds.emp.common.EmpException;
import com.sds.emp.services.user.vo.UserVO;

public interface UserService {
	Log LOGGER = LogFactory.getLog(UserService.class);

	public UserVO getUser(String userId) throws EmpException;
}
