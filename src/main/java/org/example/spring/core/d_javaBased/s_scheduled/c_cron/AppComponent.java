package org.example.spring.core.d_javaBased.s_scheduled.c_cron;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class AppComponent {

	@Scheduled(cron = "0 15 10 15 * ?")
	public void scheduleTaskUsingCronExpression() {
		System.out.println("Cron job task - " + System.currentTimeMillis() / 1000);
	}
}
