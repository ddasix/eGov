package com.multicampus.biz.board.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.multicampus.biz.board.vo.BoardVO;

@Repository
public class BoardDAO {
	@Autowired
	private SqlMapClientTemplate sqlMapClientTemplate;
	
	public BoardVO getBoard(BoardVO boardVO) {
		return (BoardVO)sqlMapClientTemplate.queryForObject("getBoard", boardVO);
	}
	
	public ArrayList<BoardVO> getBoardList(BoardVO boardVO) {
		return (ArrayList)sqlMapClientTemplate.queryForList("getBoardList", boardVO);
	}
	
	public void addBoard(BoardVO boardVO){
		sqlMapClientTemplate.insert("addBoard", boardVO);
	}
	
	public void updateBoard(BoardVO boardVO){
		sqlMapClientTemplate.update("updateBoard", boardVO);
	}
	
	public void deleteBoard(BoardVO boardVO){
		sqlMapClientTemplate.delete("deleteBoard", boardVO);
	}

}
