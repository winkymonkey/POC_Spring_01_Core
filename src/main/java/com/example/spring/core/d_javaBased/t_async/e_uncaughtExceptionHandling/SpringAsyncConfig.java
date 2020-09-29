package com.example.spring.core.d_javaBased.t_async.e_uncaughtExceptionHandling;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;


@Configuration
@ComponentScan("com.example.spring.d_javaBased.q_async.e_uncaughtExceptionHandling")
@EnableAsync
public class SpringAsyncConfig implements AsyncConfigurer {

	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
	    return new CustomAsyncExceptionHandler();
	}
}
