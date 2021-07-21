package org.example.spring.core.d_javaBased.q_profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
@Profile("UAT")
public class AppConfigUAT {
	
	@Bean
	public Employee empFactory() {
		return new Employee("Tester");
	}
}
