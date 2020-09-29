package com.example.spring.core.d_javaBased.u_events.a_builtInEvents;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


@Component
public class CustomEventListener {
	
	@EventListener
	public void handleContextRefreshedEvent(ContextRefreshedEvent event) {
		System.out.println("context refreshed::"+event);
	}
	
	@EventListener
	public void handleContextStartedEvent(ContextStartedEvent event) {
		System.out.println("context started::"+event);
	}
	
	@EventListener
	public void handleContextStoppedEvent(ContextStoppedEvent event) {
		System.out.println("context stopped::"+event);
	}
	
	@EventListener
	public void handleContextClosedEvent(ContextClosedEvent event) {
		System.out.println("context closed::"+event);
	}
}
