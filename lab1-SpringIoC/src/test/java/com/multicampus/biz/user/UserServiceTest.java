package com.multicampus.biz.user;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.multicampus.biz.user.vo.UserVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
"file:./src/main/resources/applicationContext.xml"})
public class UserServiceTest {
	@Autowired
	private UserService userService;

	@Test
	public void testGetUser() {
		UserVO vo = new UserVO();
		vo.setId("test");
		vo.setPassword("test");
		UserVO user = userService.getUser(vo);
		assertNotNull(user);
		assertEquals("°ü¸®ÀÚ", user.getName());
	}

}
