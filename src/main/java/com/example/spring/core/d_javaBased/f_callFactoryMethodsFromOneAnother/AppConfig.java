package com.example.spring.core.d_javaBased.f_callFactoryMethodsFromOneAnother;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {
	
	@Bean("e1")
	public Employee empFactory1() {
		System.out.println(getSal().getBasicPay());
		return new Employee("Tom");
	}
	
	@Bean("e2")
	public Employee empFactory2() {
		System.out.println(getSal().getBasicPay());
		return new Employee("John");
	}
	
	@Bean
	public Salary getSal() {
		int basicPay = (int)(Math.random()*1000);
		return new Salary(basicPay);
	}
}
