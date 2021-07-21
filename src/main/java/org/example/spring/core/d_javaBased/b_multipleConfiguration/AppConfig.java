package org.example.spring.core.d_javaBased.b_multipleConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {
	@Bean
	public Employee empFactory() {
		return new Employee();
	}
}
