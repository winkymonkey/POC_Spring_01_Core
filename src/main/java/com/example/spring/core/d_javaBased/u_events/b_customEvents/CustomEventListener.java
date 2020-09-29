package com.example.spring.core.d_javaBased.u_events.b_customEvents;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


@Component
public class CustomEventListener {
    
	@EventListener
	public void handleCustomEvent(CustomEvent event) {
        System.out.println("Received spring custom event - " + event.getMessage());
    }
}
