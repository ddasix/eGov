package com.sds.emp.services.board.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sds.emp.services.board.BoardService;

public class BoardServiceTest {
	
	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/resources/spring/spring-business-config.xml");
		
		BoardService boardService = (BoardService) ctx.getBean("boardService");
		
		// TODO 1. getBoardList() �޼ҵ带 ȣ���Ͽ� �������� Ȯ���Ѵ�. 

	}
}


