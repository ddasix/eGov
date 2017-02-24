package com.multicampus.biz.board;

import java.util.List;

import com.multicampus.biz.board.vo.BoardVO;

public interface BoardService {
	public void addBoard(BoardVO vo);
	public void updateBoard(BoardVO vo);
	public void deleteBoard(BoardVO vo);
	public BoardVO getBoard(BoardVO vo);
	public List<BoardVO> getBoardList(BoardVO vo);
}








