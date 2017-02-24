package com.sds.emp.services.board.test;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sds.emp.services.board.BoardService;
import com.sds.emp.services.board.vo.BoardVO;
import com.sds.emp.services.board.vo.SearchVO;
import com.sds.emp.view.tags.Page;

public class BoardServiceTest {
	
	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/resources/spring/spring-business-config.xml");
		
		BoardService boardService = (BoardService) ctx.getBean("boardService");
		SearchVO searchVO = new SearchVO();
		searchVO.setSearchCondition("0");
		searchVO.setSearchKeyword("");
		Page resultPage = boardService.getBoardList(searchVO);
		ArrayList<BoardVO> boardList = (ArrayList<BoardVO>)resultPage.getList();
		for (BoardVO boardVO : boardList) {
			System.out.println(boardVO);
		}
	}
}


