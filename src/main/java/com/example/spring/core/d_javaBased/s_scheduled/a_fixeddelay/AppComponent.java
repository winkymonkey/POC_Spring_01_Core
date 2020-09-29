package com.example.spring.core.d_javaBased.s_scheduled.a_fixeddelay;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class AppComponent {
	
	@Scheduled(fixedDelay = 2000)
	public void scheduleFixedDelayTask() {
		System.out.println("Fixed delay task - " + System.currentTimeMillis() / 1000);
	}
}
