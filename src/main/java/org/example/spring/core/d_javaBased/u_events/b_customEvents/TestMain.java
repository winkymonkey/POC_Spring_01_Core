package org.example.spring.core.d_javaBased.u_events.b_customEvents;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestMain {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext("com.example.spring.d_javaBased.t_events.b_customEvents");
		
		CustomEventPublisher customEventPublisher = context.getBean(CustomEventPublisher.class);
		customEventPublisher.doStuffAndPublishEvent("BLAH");
		
		context.close();
	}
}
