package org.example.spring.core.d_javaBased.i_lazy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;


@Configuration
public class AppConfig2 {
	
	@Lazy(true)
	@Bean
	public Employee empFactory() {
		return new Employee();
	}
}
