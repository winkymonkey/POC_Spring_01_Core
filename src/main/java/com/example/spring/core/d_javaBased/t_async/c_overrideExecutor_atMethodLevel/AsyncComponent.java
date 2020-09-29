package com.example.spring.core.d_javaBased.t_async.c_overrideExecutor_atMethodLevel;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;


@Component
public class AsyncComponent {

	@Async("customTaskExecutor")
	public void asyncMethodWithConfiguredExecutor() {
		System.out.println("Executing with custom executor - " + Thread.currentThread().getName());
	}
}
