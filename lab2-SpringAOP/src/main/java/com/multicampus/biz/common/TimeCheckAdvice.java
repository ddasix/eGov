package com.multicampus.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Aspect
@Service
public class TimeCheckAdvice {
	@Pointcut(
   "execution(* com.multicampus.biz..*Service.get*(..))")
	public void checking(){}

	@Around("checking()")
	public Object timeCheck(ProceedingJoinPoint process) throws Throwable {
		String method = process.getSignature().getName();
		long start = System.currentTimeMillis();
		Object result = process.proceed();
		long end = System.currentTimeMillis();
		System.out.println(method + "() �޼ҵ� ���࿡ �ɸ� �ð� : " + (end - start)+"(ms ��)");
		return result;
	}
}
