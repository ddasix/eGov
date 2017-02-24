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
		System.out.println("[���� ó��] " + method
				+ "() �޼ҵ� ȣ���");
		System.out.println(method + "() �޼ҵ� ���� ����");
		Object[] args = jp.getArgs();
		System.out.println(args[0].toString());
	}
}
