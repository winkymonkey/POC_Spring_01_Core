package com.example.spring.core.d_javaBased.m_scanAdditionalBeans;

import org.springframework.stereotype.Component;


@Component
public class Student {
	public void greet() {
		System.out.println("Welcome Student");
	}
}
