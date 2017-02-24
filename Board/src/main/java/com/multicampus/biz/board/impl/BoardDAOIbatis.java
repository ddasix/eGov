package com.multicampus.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.multicampus.biz.board.BoardDAO;
import com.multicampus.biz.board.vo.BoardVO;

@Repository
public class BoardDAOIbatis implements BoardDAO {
	@Autowired
	private SqlMapClientTemplate ibatis;

	public void addBoard(BoardVO vo){
		ibatis.insert("addBoard", vo);
	}
	
	public void updateBoard(BoardVO vo){	
		ibatis.update("updateBoard", vo);
	}	
	
	public void deleteBoard(BoardVO vo){	
		ibatis.delete("deleteBoard", vo);
	}
	
	public BoardVO getBoard(BoardVO vo){	
		return (BoardVO)ibatis.queryForObject("getBoard", vo);
	}
	
	public List<BoardVO> getBoardList(BoardVO vo){		
		return ibatis.queryForList("getBoardList", vo);
	}	
}































