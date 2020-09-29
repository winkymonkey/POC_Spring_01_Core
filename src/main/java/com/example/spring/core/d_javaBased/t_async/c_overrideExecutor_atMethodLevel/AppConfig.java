package com.example.spring.core.d_javaBased.t_async.c_overrideExecutor_atMethodLevel;

import java.util.concurrent.Executor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;


@Configuration
@ComponentScan("com.example.spring.d_javaBased.q_async.c_overrideExecutor_atMethodLevel")
@EnableAsync
public class AppConfig {

	@Bean(name = "customTaskExecutor")
	public Executor cusomTaskExecutor() {
		return new ThreadPoolTaskExecutor();
	}
}
