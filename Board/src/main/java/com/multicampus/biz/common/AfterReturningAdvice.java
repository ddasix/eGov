package com.multicampus.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

//@Service
@Aspect
public class AfterReturningAdvice {
	@Pointcut("execution(* com.multicampus.biz..*ServiceImpl.*(..))")
	public void boardPointcut(){}
	
	@AfterReturning(pointcut="boardPointcut()", 
			        returning="returnVal")	
	public void afterLog(JoinPoint jp, Object returnVal){
		String method = jp.getSignature().getName();
		System.out.println("[���� ó��] " + method
				+ "() �޼ҵ� ȣ���");
		System.out.println(method + "() �޼ҵ� ���� ���� : " + 
				returnVal);
	}
}
