package org.example.spring.core.e_combineJavaAndXml.a_xmlCentric1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {
	
	@Bean
	public Employee empFactory() {
		return new Employee();
	}
}
