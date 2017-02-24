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
			BoardService.LOGGER.error("�ش� �Խñ� '" + boardVO.getBoardNo() + "'�� ����ϴµ� �����Ͽ����ϴ�.", e);
			throw new EmpException("�ش� �Խñ� '" + boardVO.getBoardNo() + "'�� ����ϴµ� �����Ͽ����ϴ�.", e);
		}
	}
	
	public BoardVO getBoard(BoardVO boardVO) throws EmpException {
		try {
			return boardDAO.getBoard(boardVO);
		} catch (Exception e) {
			BoardService.LOGGER.error("�Խñ� ��ȸ�� �����Ͽ����ϴ�.", e);
			throw new EmpException("�Խñ� ��ȸ�� �����Ͽ����ϴ�.", e);
		}
	}

	public Page getBoardList(SearchVO searchVO) throws EmpException {
		try {
			return boardDAO.getBoardList(searchVO);
		} catch (Exception e) {
			BoardService.LOGGER.error("�Խñ� ��� ��ȸ�� �����Ͽ����ϴ�.", e);
			throw new EmpException("�Խñ� ��� ��ȸ�� �����Ͽ����ϴ�.", e);
		}
	}
}
