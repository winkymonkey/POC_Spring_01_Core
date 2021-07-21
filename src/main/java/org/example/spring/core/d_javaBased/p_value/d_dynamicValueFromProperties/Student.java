package org.example.spring.core.d_javaBased.p_value.d_dynamicValueFromProperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
@PropertySource("file:/path/to/app1.properties")
public class Student {
	
	@Value("${stu.name}")
	private String name;

	public String getName() {
		return name;
	}
}
