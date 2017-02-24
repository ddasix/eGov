package com.sds.emp.services.board;

import com.sds.emp.services.board.vo.BoardVO;
import com.sds.emp.services.board.vo.SearchVO;
import com.sds.emp.view.tags.Page;

public interface IBoardDAO {
	public void addBoard(BoardVO boardVO) throws Exception;	
	public BoardVO getBoard(BoardVO boardVO) throws Exception;
	public Page getBoardList(SearchVO searchVO) throws Exception;
}
