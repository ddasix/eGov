package com.multicampus.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class TimeCheckAdvice {
	
	@Pointcut("execution(* com.multicampus.biz..*ServiceImpl.*(..))")
	public void boardPointcut(){}
	
	@Around("boardPointcut()")
	public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable{
		Object obj = null;
		// 호출된 메소드 이름 알아내기
		String method = pjp.getSignature().getName();
		// 비즈니스 메소드 수행전 시간
		long start = System.currentTimeMillis();
		
		obj = pjp.proceed();
		
		// 비즈니스 메소드 수행후 시간
		long end = System.currentTimeMillis();
		System.out.println(method + "() 메소드 수행에 걸린 시간 : "
				+ (end - start) + "ms(초)");
		return obj;
	}
}





