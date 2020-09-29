package com.example.spring.core.d_javaBased.i_lazy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;


@Lazy
@Configuration
public class AppConfig {
	
	@Bean
	public Employee empFactory() {
		return new Employee();
	}
}
