package org.example.spring.core.d_javaBased.s_scheduled.b_fixedrate;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class AppComponent {
	
	@Scheduled(fixedRate = 500)
	public void scheduleFixedRateTask() {
		System.out.println("Fixed rate task - " + System.currentTimeMillis() / 1000);
	}
}
