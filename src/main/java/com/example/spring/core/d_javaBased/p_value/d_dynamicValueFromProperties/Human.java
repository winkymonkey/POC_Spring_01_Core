package com.example.spring.core.d_javaBased.p_value.d_dynamicValueFromProperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
@PropertySource(value = "classpath:/missing.properties", ignoreResourceNotFound = true)
public class Human {
	
	@Value("${human.name}")
	private String name;

	public String getName() {
		return name;
	}
}
