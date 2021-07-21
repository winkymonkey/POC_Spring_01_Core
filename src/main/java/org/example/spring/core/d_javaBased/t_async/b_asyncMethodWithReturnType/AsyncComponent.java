package org.example.spring.core.d_javaBased.t_async.b_asyncMethodWithReturnType;

import java.util.concurrent.Future;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;


@Component
public class AsyncComponent {
	
	@Async
	public Future<String> asyncMethodWithReturnType() {
		System.out.println("Executing asynchronously. Thread[" + Thread.currentThread().getName() + "]");
		try {
			Thread.sleep(5000);
			return new AsyncResult<String>("ASYNC_RESULT");
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}
}
