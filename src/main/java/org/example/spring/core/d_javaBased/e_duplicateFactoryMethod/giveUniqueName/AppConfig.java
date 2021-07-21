package org.example.spring.core.d_javaBased.e_duplicateFactoryMethod.giveUniqueName;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {
	
	@Bean(name="e1")
	public Employee empFactory() {
		return new Employee("Good");
	}
	
	@Bean(name="e2")
	public Employee empFactory2() {
		return new Employee("Bad");
	}
}
