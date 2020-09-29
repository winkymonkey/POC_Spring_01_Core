package com.example.spring.core.d_javaBased.t_async.e_uncaughtExceptionHandling;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestMain {
	
	public static void main(String[] args) throws InterruptedException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringAsyncConfig.class);
		AsyncComponent asyncComponent = context.getBean(AsyncComponent.class);
		
		System.out.println("Start - invoking async method. Thread[" + Thread.currentThread().getName() + "]");
		asyncComponent.asyncMethodWithVoidReturnType();
		System.out.println("End - invoking async method. Thread[" + Thread.currentThread().getName() + "]");
		Thread.sleep(250);
		
		context.close();
	}
}
