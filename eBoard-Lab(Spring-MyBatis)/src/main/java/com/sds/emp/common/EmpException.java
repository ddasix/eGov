package com.sds.emp.common;

import org.springframework.context.MessageSource;

public class EmpException extends Exception {

	private static final long serialVersionUID = 1L;

	public EmpException(MessageSource messageSource, String messageKey,
			Object[] messageParameters, Throwable wrappedException) {
		
	}

	public EmpException(MessageSource messageSource, String messageKey,
			Object[] messageParameters) {
		
	}

	public EmpException(MessageSource messageSource, String messageKey,
			Throwable wrappedException) {
		
	}

	public EmpException(MessageSource messageSource, String messageKey) {
		
	}

	public EmpException(String message, Throwable exception) {
	
	}
	
	public EmpException(String message) {
		super(message);
	}	
}
