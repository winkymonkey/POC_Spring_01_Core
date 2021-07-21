package org.example.spring.core.d_javaBased.u_events.b_customEvents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;


@Component
public class CustomEventPublisher {
	
	@Autowired
    private ApplicationEventPublisher applicationEventPublisher;
 
    public void doStuffAndPublishEvent(final String message) {
        System.out.println("Publishing custom event. ");
        CustomEvent customEvent = new CustomEvent(this, message);
        applicationEventPublisher.publishEvent(customEvent);
    }
}
