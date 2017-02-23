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

//TODO1. BoardController 클래스를 Controller Bean으로 등록하는 Annotation 설정
@Controller
public class BoardController {
	//TODO2. BoardServiceImpl 객체를 의존성 주입하는 Annotation 설정
	@Autowired
	private BoardService boardService;
	
	//TODO3. "/addBoardView.do" URL 요청에 대해서 addBoardView() 메소드가 실행되도록 Annotation 설정
	@RequestMapping("/addBoardView.do")
	public String addBoardView() {
		return "addBoard.jsp";
	}
	
	//TODO4. "/addBoard.do" URL 요청에 대해서 addBoard() 메소드가 실행되도록 Annotation 설정
	@RequestMapping("/addBoard.do")
	public String addBoard(@ModelAttribute("board") BoardVO vo, BindingResult result) {
		//구현
		new BoardValidator().validate(vo, result);
		if(result.hasErrors()){
			return "addBoard.jsp";
		}
		boardService.addBoard(vo);
		return "redirect:/getBoardList.do";
	}
	
	//TODO5. "/updateBoard.do" URL 요청에 대해서 addBoard() 메소드가 실행되도록 Annotation 설정
	@RequestMapping("/updateBoard.do")
	public String updateBoard(BoardVO vo) {
		//구현
		boardService.updateBoard(vo);
		return "redirect:/getBoardList.do";
	}
	
	//TODO6. "/deleteBoard.do" URL 요청에 대해서 addBoard() 메소드가 실행되도록 Annotation 설정
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo) {
		//구현
		boardService.deleteBoard(vo);
		return "redirect:/getBoardList.do";
	}
	
	//TODO7. "/getBoard.do" URL 요청에 대해서 addBoard() 메소드가 실행되도록 Annotation 설정
	@RequestMapping("/getBoard.do")
	public String getBoard(BoardVO vo, Model model) {
		//구현
		model.addAttribute("board", boardService.getBoard(vo));
		return "getBoard.jsp";
	}
	
	//TODO8. "/getBoardList.do" URL 요청에 대해서 getBoardList() 메소드가 실행되도록 Annotation 설정
	@RequestMapping("/getBoardList.do")
	public String getBoardList(BoardVO vo, HttpSession session, Model model) {
		//구현
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
