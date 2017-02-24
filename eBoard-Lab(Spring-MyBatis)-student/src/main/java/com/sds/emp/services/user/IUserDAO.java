package com.sds.emp.services.user;

import com.sds.emp.services.user.vo.UserVO;

public interface IUserDAO {
	public UserVO getUser(String userId) throws Exception;
}
