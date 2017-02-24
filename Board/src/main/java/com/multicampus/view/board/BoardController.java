package com.multicampus.view.board;

import java.io.FileOutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.multicampus.biz.board.BoardService;
import com.multicampus.biz.board.vo.BoardVO;

@Controller
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/addBoard.do")
	public String addBoard(@ModelAttribute("board") BoardVO vo, BindingResult result) throws Exception {
		// 유효성 체크
		new BoardValidator().validate(vo, result);
		if(result.hasErrors()){
			return "addBoard.jsp";
		}
		
		// 파일업로드 구현
		MultipartFile uploadFile = vo.getUploadFile();
		if(uploadFile != null && uploadFile.getOriginalFilename().length() > 0){
			String fileName = uploadFile.getOriginalFilename();
			byte[] fileData = uploadFile.getBytes();
			FileOutputStream output = new FileOutputStream("C:/eGovFrame-2.5/workspace.edu/BoardWebAnnotation/WebContent/uploadFiles" + fileName);
			output.write(fileData);
		}
		// 새글 등록
		boardService.addBoard(vo);
		return "getBoardList.do";
	}
	
	@RequestMapping("/updateBoard.do")
	public String updateBoard(BoardVO vo) {
		boardService.updateBoard(vo);
		return "getBoardList.do";
	}
	
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo) {
		boardService.deleteBoard(vo);
		return "getBoardList.do";
	}
	
	@RequestMapping("/getBoard.do")
	public String getBoard(BoardVO vo, Model model) {
		model.addAttribute("board", boardService.getBoard(vo));
		return "getBoard.jsp";
	}
	
	@RequestMapping("/getBoardList.do")
	public String getBoardList(BoardVO vo, Model model) {
		if(vo.getSearchCondition() == null) vo.setSearchCondition("TITLE");
		if(vo.getSearchKeyword() == null) vo.setSearchKeyword("");
		model.addAttribute("boardList", boardService.getBoardList(vo)); // Model 정보
		return "getBoardList.jsp";
	}
}
