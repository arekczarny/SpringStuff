package com.codeblazing.perf;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author: Arek Czarnoglowski
 * @created: 09.03.2018 23:20
 * @version: 1.0
 */
@Aspect
@Component
public class BeanPerformanceKeeper {

	@Pointcut("within(@org.springframework.stereotype.Service *)")
	public void serviceClassMethods() {};

	@Around("serviceClassMethods()")
	public Object measureMethodExecutionTime(ProceedingJoinPoint joinPoint)
			throws Throwable {
		long start = System.nanoTime();
		Object returnValue = joinPoint.proceed();
		long end = System.nanoTime();
		String methodName = joinPoint.getSignature().getName();
		System.out.println("!!!!!! Execution of " + methodName + " took " + TimeUnit.NANOSECONDS.toMillis(end - start) + " ms");
		return returnValue;
	}

}
