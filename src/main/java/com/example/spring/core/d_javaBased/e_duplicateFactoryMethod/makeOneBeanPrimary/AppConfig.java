package com.example.spring.core.d_javaBased.e_duplicateFactoryMethod.makeOneBeanPrimary;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class AppConfig {
	
	@Bean
	public Employee empFactory() {
		return new Employee("Good");
	}
	
	@Bean
	@Primary
	public Employee empFactory2() {
		return new Employee("Bad");
	}
}
