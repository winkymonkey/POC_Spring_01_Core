package com.example.spring.core.d_javaBased.p_value.d_dynamicValueFromProperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
@PropertySource("classpath:${ENV}.properties")
public class Vehicle {
	
	@Value("${vehicle.brand}")
	private String brand;

	public String getBrand() {
		return brand;
	}
}
