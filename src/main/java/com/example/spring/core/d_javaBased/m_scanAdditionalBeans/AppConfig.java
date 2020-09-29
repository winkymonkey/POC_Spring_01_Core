package com.example.spring.core.d_javaBased.m_scanAdditionalBeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages={"com.example.spring.d_javaBased.h_scanAdditionalBeans"})
public class AppConfig {
	
	@Bean
	public Employee empFactory() {
		return new Employee();
	}
}
