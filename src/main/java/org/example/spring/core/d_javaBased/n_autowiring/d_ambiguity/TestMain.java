package org.example.spring.core.d_javaBased.n_autowiring.d_ambiguity;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestMain {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext("com.example.spring.d_javaBased.m_autowiring.d_ambiguity");
		
		Traveller traveller = context.getBean(Traveller.class);
		traveller.travel();
		
		context.close();
	}
}
