package com.example.spring.core.d_javaBased.t_async.a_asyncMethodWithVoidReturnType;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;


@Component
public class AsyncComponent {

	@Async
	public void asyncMethodWithVoidReturnType() {
		System.out.println("Executing asynchronously. Thread[" + Thread.currentThread().getName() + "]");
	}
}
