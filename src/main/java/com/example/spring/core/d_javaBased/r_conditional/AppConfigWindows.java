package com.example.spring.core.d_javaBased.r_conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfigWindows {
	
	@Bean
	@Conditional(ConditionForWindows.class)
	public Employee empFactory() {
		return new Employee("Have Windows OS");
	}
}
