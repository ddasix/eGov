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
		System.out.println("[���� ó��] " + method
				+ "() �޼ҵ� ȣ���");
		System.out.println(method + "() �޼ҵ忡�� �߻��� ���� : " + 
				exceptObj.getMessage());
	}
}
