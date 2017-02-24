package com.sds.emp.services.board.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sds.emp.common.EmpException;
import com.sds.emp.services.board.BoardService;
import com.sds.emp.services.board.IBoardDAO;
import com.sds.emp.services.board.vo.BoardVO;
import com.sds.emp.services.board.vo.SearchVO;
import com.sds.emp.services.keygen.KeyGenService;
import com.sds.emp.view.tags.Page;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	@Autowired
	private IBoardDAO boardDAO;
	@Autowired
	private KeyGenService pkGenService;
	
	public void addBoard(BoardVO boardVO) throws EmpException {
		try {
			String boardNo = pkGenService.getNextPk("BOARD", "BOARDNO");
			boardVO.setBoardNo(boardNo);
			boardDAO.addBoard(boardVO);
		} catch (Exception e) {
			BoardService.LOGGER.error("해당 게시글 '" + boardVO.getBoardNo() + "'를 등록하는데 실패하였습니다.", e);
			throw new EmpException("해당 게시글 '" + boardVO.getBoardNo() + "'를 등록하는데 실패하였습니다.", e);
		}
	}
	
	public BoardVO getBoard(BoardVO boardVO) throws EmpException {
		try {
			return boardDAO.getBoard(boardVO);
		} catch (Exception e) {
			BoardService.LOGGER.error("게시글 조회에 실패하였습니다.", e);
			throw new EmpException("게시글 조회에 실패하였습니다.", e);
		}
	}

	public Page getBoardList(SearchVO searchVO) throws EmpException {
		try {
			return boardDAO.getBoardList(searchVO);
		} catch (Exception e) {
			BoardService.LOGGER.error("게시글 목록 조회에 실패하였습니다.", e);
			throw new EmpException("게시글 목록 조회에 실패하였습니다.", e);
		}
	}
}
