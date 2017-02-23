package com.multicampus.view.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.multicampus.biz.board.vo.BoardVO;

public class BoardValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return BoardVO.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		BoardVO board = (BoardVO)target;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "title", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "writer", "required");
		if(board.getContent().length() <= 10){
			errors.rejectValue("content", "error.board.content.tooshort");
		}
	}	
}










