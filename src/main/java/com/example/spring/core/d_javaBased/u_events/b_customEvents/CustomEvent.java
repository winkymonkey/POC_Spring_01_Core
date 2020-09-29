package com.example.spring.core.d_javaBased.u_events.b_customEvents;

import org.springframework.context.ApplicationEvent;


public class CustomEvent extends ApplicationEvent {
	private static final long serialVersionUID = -2263018041000980131L;
	
	private String message;

	public CustomEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

	public String getMessage() {
		return message;
	}
}
