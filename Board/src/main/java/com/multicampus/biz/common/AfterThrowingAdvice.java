package com.multicampus.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

//@Service
@Aspect
public class AfterThrowingAdvice {
	@Pointcut("execution(* com.multicampus.biz..*ServiceImpl.*(..))")
	public void boardPointcut(){}
	
	@AfterThrowing(pointcut="boardPointcut()", 
			       throwing="exceptObj")	
	public void exceptionLog(JoinPoint jp, Exception exceptObj){
		String method = jp.getSignature().getName();
		System.out.println("[예외 처리] " + method
				+ "() 메소드 호출됨");
		System.out.println(method + "() 메소드에서 발생된 예외 : " + 
				exceptObj.getMessage());
	}
}
