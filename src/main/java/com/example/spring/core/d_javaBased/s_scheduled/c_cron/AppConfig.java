package com.example.spring.core.d_javaBased.s_scheduled.c_cron;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;


@Configuration
@ComponentScan("com.example.spring.d_javaBased.r_scheduled.c_cron")
@EnableScheduling
public class AppConfig {
	
}
