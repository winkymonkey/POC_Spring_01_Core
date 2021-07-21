package org.example.spring.core.d_javaBased.t_async.b_asyncMethodWithReturnType;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestMain {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		AsyncComponent asyncComponent = context.getBean(AsyncComponent.class);
		
		System.out.println("Start - invoking async method. Thread[" + Thread.currentThread().getName() + "]");
		Future<String> future = asyncComponent.asyncMethodWithReturnType();
		while (true) {
	        if (future.isDone()) {
	            System.out.println("Result from async method::" + future.get());
	            break;
	        }
	        System.out.println("Continue doing something else. Thread[" + Thread.currentThread().getName() + "]");
	        Thread.sleep(1000);
	    }
		
		context.close();
	}
}
