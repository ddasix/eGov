package com.multicampus.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//@Service
@Aspect // Aspect = Pointcut + Advice(before, after, around...)
public class LogAdvice {
	@Pointcut("execution(* com.multicampus.biz..*ServiceImpl.*(..))")
	public void boardPointcut(){}
	
	@Before("boardPointcut()")
	public void printLog(JoinPoint jp){
		String method = jp.getSignature().getName();
		System.out.println("[사전 처리] " + method
				+ "() 메소드 호출됨");
		System.out.println(method + "() 메소드 인자 정보");
		Object[] args = jp.getArgs();
		System.out.println(args[0].toString());
	}
}
