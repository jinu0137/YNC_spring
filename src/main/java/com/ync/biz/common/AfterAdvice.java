package com.ync.biz.common;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AfterAdvice {
	@Pointcut("execution(* com.ync.biz..*Impl.*(..))")
	public void allPointcut() {}
	
	@After("allPointcut()")
	public void finallyLog() {
		System.out.println("[사후 처리] 비지니스 로직 수행 후 무조건 동작");
	}
}
