package com.example.spring.core.d_javaBased.s_scheduled.a_fixeddelay;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;


@Configuration
@ComponentScan("com.example.spring.d_javaBased.r_scheduled.a_fixeddelay")
@EnableScheduling
public class AppConfig {
	
}
