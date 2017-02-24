package com.sds.emp.services.board.impl;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.sds.emp.services.board.IBoardDAO;
import com.sds.emp.services.board.vo.BoardVO;
import com.sds.emp.services.board.vo.SearchVO;
import com.sds.emp.view.tags.Page;

@Repository("boardDAO")
public class BoardDAO extends SqlSessionDaoSupport implements IBoardDAO{
	
	public void addBoard(BoardVO boardVO) throws Exception {
		getSqlSession().insert("Board.addBoard", boardVO);
	}
	
	public BoardVO getBoard(BoardVO boardVO) throws Exception {
		BoardVO resultVO = (BoardVO) getSqlSession().selectOne("Board.getBoard", boardVO);
		return resultVO;
	}

	public Page getBoardList(SearchVO searchVO) throws Exception {
		if(searchVO.getSearchCondition() == null || searchVO.getSearchCondition().equals(""))
			searchVO.setSearchCondition("0");
		
		RowBounds rowBounds = new RowBounds((searchVO.getPageIndex() * 3) - 3, 3);	
		ArrayList<BoardVO> boardList = (ArrayList) getSqlSession().selectList("Board.getBoardList", searchVO, rowBounds);
		Integer boardListCnt = (Integer)getSqlSession().selectOne("Board.getBoardListCnt", searchVO);

		Page resultPage = new Page(boardList, searchVO.getPageIndex(), boardListCnt, 5, 3);
		return resultPage;
	}
}
