package com.multicampus.biz.board.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multicampus.biz.board.BoardService;
import com.multicampus.biz.board.vo.BoardVO;

//TODO1. BoardServiceImpl 클래스를 Bean 으로 등록하는 Annotation 을 설정하시오.
//UserServiceImpl 은 클라이언트에서 "boardService" 라는 이름으로 llokup 한다.
@Service("boardService")
public class BoardServiceImpl implements BoardService {
	//TODO2. BoardDAO 클래스에 대한 DI 관련 Annotation 을 설정하시오.
	@Autowired
	private BoardDAO boardDAO;
	
	public void addBoard(BoardVO vo) {
		boardDAO.addBoard(vo);
	}

	public void updateBoard(BoardVO vo) {
		boardDAO.updateBoard(vo);
	}

	public void deleteBoard(BoardVO vo) {
		boardDAO.deleteBoard(vo);
	}

	public BoardVO getBoard(BoardVO vo) {
		return boardDAO.getBoard(vo);
	}

	public ArrayList<BoardVO> getBoardList(BoardVO vo) {
		//vo.setSearchKeyword("%"+vo.getSearchKeyword()+"%");
		return boardDAO.getBoardList(vo);
	}
}








