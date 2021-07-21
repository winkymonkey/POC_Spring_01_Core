package org.example.spring.core.d_javaBased.d_importConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@Import(AppConfig2.class)
public class AppConfig {
	@Bean
	public Employee empFactory() {
		return new Employee();
	}
}
