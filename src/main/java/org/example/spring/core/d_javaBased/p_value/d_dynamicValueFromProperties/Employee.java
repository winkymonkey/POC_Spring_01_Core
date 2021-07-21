package org.example.spring.core.d_javaBased.p_value.d_dynamicValueFromProperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
@PropertySource({"classpath:/app1.properties", "classpath:/app2.properties"})
public class Employee {
	
	@Value("${emp.name}")
	private String name;
	
	@Value("${emp.age}")
	private int age;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
