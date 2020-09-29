package com.example.spring.core.d_javaBased.t_async.e_uncaughtExceptionHandling;

import java.lang.reflect.Method;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;


public class CustomAsyncExceptionHandler implements AsyncUncaughtExceptionHandler {
	
	public void handleUncaughtException(Throwable throwable, Method method, Object... obj) {
		System.out.println("Exception message - " + throwable.getMessage());
		System.out.println("Method name - " + method.getName());
		for (Object param : obj) {
			System.out.println("Parameter value - " + param);
		}
	}
}
