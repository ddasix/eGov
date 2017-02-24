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
		// ȣ��� �޼ҵ� �̸� �˾Ƴ���
		String method = pjp.getSignature().getName();
		// ����Ͻ� �޼ҵ� ������ �ð�
		long start = System.currentTimeMillis();
		
		obj = pjp.proceed();
		
		// ����Ͻ� �޼ҵ� ������ �ð�
		long end = System.currentTimeMillis();
		System.out.println(method + "() �޼ҵ� ���࿡ �ɸ� �ð� : "
				+ (end - start) + "ms(��)");
		return obj;
	}
}





