package com.example.spring.core.d_javaBased.t_async.d_overrideExecutor_atApplicationLevel;

import java.util.concurrent.Executor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;


@Configuration
@ComponentScan("com.example.spring.d_javaBased.q_async.d_overrideExecutor_atApplicationLevel")
@EnableAsync
public class AppConfig implements AsyncConfigurer {

	@Bean(name = "customTaskExecutor")
    public Executor getAsyncExecutor() {
        return new ThreadPoolTaskExecutor();
    }
}
