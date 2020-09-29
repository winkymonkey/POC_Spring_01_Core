package com.example.spring.core.d_javaBased.h_lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


@Component
public class Employee implements BeanNameAware, BeanFactoryAware, ApplicationContextAware,
		InitializingBean, DisposableBean {

	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public void setBeanName(String name) {
		System.out.println("setBeanName::"+name);
	}
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("setBeanFactory::"+beanFactory);
	}
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("setApplicationContext::"+applicationContext);
	}
	@PostConstruct
	public void postConstructMethod() {
		System.out.println("@PostConstruct");
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
	}
	@PreDestroy
	public void preDestroy() {
		System.out.println("@PreDestroy");
	}
	public void destroy() throws Exception {
		System.out.println("destroy");
	}

}
