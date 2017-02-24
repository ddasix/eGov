package com.sds.emp.services.board;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sds.emp.common.EmpException;
import com.sds.emp.services.board.vo.BoardVO;
import com.sds.emp.services.board.vo.SearchVO;
import com.sds.emp.view.tags.Page;

public interface BoardService {
	Log LOGGER = LogFactory.getLog(BoardService.class);
	public void addBoard(BoardVO boardVO) throws EmpException;
	public BoardVO getBoard(BoardVO boardVO) throws EmpException;
	public Page getBoardList(SearchVO searchVO) throws EmpException;	
}
