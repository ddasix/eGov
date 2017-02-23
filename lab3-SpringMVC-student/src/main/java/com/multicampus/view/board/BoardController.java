package com.multicampus.view.board;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.multicampus.biz.board.BoardService;
import com.multicampus.biz.board.vo.BoardVO;
import com.multicampus.view.validators.BoardValidator;

//TODO1. BoardController Ŭ������ Controller Bean���� ����ϴ� Annotation ����
@Controller
public class BoardController {
	//TODO2. BoardServiceImpl ��ü�� ������ �����ϴ� Annotation ����
	@Autowired
	private BoardService boardService;
	
	//TODO3. "/addBoardView.do" URL ��û�� ���ؼ� addBoardView() �޼ҵ尡 ����ǵ��� Annotation ����
	@RequestMapping("/addBoardView.do")
	public String addBoardView() {
		return "addBoard.jsp";
	}
	
	//TODO4. "/addBoard.do" URL ��û�� ���ؼ� addBoard() �޼ҵ尡 ����ǵ��� Annotation ����
	@RequestMapping("/addBoard.do")
	public String addBoard(@ModelAttribute("board") BoardVO vo, BindingResult result) {
		//����
		new BoardValidator().validate(vo, result);
		if(result.hasErrors()){
			return "addBoard.jsp";
		}
		boardService.addBoard(vo);
		return "redirect:/getBoardList.do";
	}
	
	//TODO5. "/updateBoard.do" URL ��û�� ���ؼ� addBoard() �޼ҵ尡 ����ǵ��� Annotation ����
	@RequestMapping("/updateBoard.do")
	public String updateBoard(BoardVO vo) {
		//����
		boardService.updateBoard(vo);
		return "redirect:/getBoardList.do";
	}
	
	//TODO6. "/deleteBoard.do" URL ��û�� ���ؼ� addBoard() �޼ҵ尡 ����ǵ��� Annotation ����
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo) {
		//����
		boardService.deleteBoard(vo);
		return "redirect:/getBoardList.do";
	}
	
	//TODO7. "/getBoard.do" URL ��û�� ���ؼ� addBoard() �޼ҵ尡 ����ǵ��� Annotation ����
	@RequestMapping("/getBoard.do")
	public String getBoard(BoardVO vo, Model model) {
		//����
		model.addAttribute("board", boardService.getBoard(vo));
		return "getBoard.jsp";
	}
	
	//TODO8. "/getBoardList.do" URL ��û�� ���ؼ� getBoardList() �޼ҵ尡 ����ǵ��� Annotation ����
	@RequestMapping("/getBoardList.do")
	public String getBoardList(BoardVO vo, HttpSession session, Model model) {
		//����
		String userId = (String) session.getAttribute("userId");
		if(userId == null){
			return "login.jsp";
		}
		if(vo.getSearchCondition() == null){
			vo.setSearchCondition("TITLE");
		}
		
		if(vo.getSearchKeyword() == null){
			vo.setSearchKeyword("");
		}
		ArrayList<BoardVO> boardList = boardService.getBoardList(vo);
		model.addAttribute("boardList",boardList);
		return "getBoardList.jsp";
	}
}
