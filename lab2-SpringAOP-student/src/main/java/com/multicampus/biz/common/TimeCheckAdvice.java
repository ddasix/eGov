package com.multicampus.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Aspect
@Service
public class TimeCheckAdvice {
	@Pointcut("excution(* *(..))")
	public void checking(){}
	
	@Around("checking()")
	public Object timeCheck(ProceedingJoinPoint pjp) throws Throwable{
		String method = pjp.getSignature().getName();
		long start_time = System.currentTimeMillis();
		Object result = pjp.proceed();
		long end_time = System.currentTimeMillis();
		
		System.out.println(method + "() 수행 시간="+(end_time - start_time) + "(ms)초");
		return result;
	}
}