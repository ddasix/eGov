package com.multicampus.view.board;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multicampus.biz.board.BoardService;
import com.multicampus.biz.board.vo.BoardVO;
import com.multicampus.view.validators.BoardValidator;

@Controller
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/addBoardView.do")
	public String addBoardView() {
		return "addBoard.jsp";
	}
	
	@RequestMapping("/addBoard.do")
	public String addBoard(@ModelAttribute("board") BoardVO vo, 
			               BindingResult result) {
		new BoardValidator().validate(vo, result);
		if(result.hasErrors()){
			return "addBoard.jsp";
		}
		boardService.addBoard(vo);
		return "redirect:/getBoardList.do";
	}
	
	@RequestMapping("/updateBoard.do")
	public String updateBoard(BoardVO vo) {
		boardService.updateBoard(vo);
		return "redirect:/getBoardList.do";
	}
	
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo) {
		boardService.deleteBoard(vo);
		return "redirect:/getBoardList.do";
	}
	
	@RequestMapping("/getBoard.do")
	public String getBoard(BoardVO vo, Model model) {
		BoardVO board = boardService.getBoard(vo);
		model.addAttribute("board", board);
		return "getBoard.jsp";
	}
	
	@RequestMapping("/getBoardList.do")
	public String getBoardList(BoardVO vo, HttpSession session, Model model) {
		String userId = (String)session.getAttribute("userId");
		if(userId == null){
			return "login.jsp";
		}
		if(vo.getSearchCondition() == null)
			vo.setSearchCondition("TITLE");
		if(vo.getSearchKeyword() == null)
			vo.setSearchKeyword("");

		ArrayList<BoardVO> boardList = boardService.getBoardList(vo);
		model.addAttribute("boardList", boardList);		
		return "getBoardList.jsp";
	}
}
