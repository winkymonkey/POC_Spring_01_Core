package com.example.spring.core.d_javaBased.h_lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;


@Component
public class SecondBeanPostProcessor implements BeanPostProcessor, Ordered {
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeforeInit (SecondBeanPostProcessor)::" + bean + "---" +beanName);
		return bean;
	}
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("AfterInit (SecondBeanPostProcessor)::" + bean + "---" + beanName);
		return bean;
	}
	public int getOrder() {
		return 2;
	}
}
