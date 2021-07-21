package org.example.spring.core.c_xmlBased.a_instantiate_ioc;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class TestMain {
	public static void main(String[] args) {
		exampleBeanFactory();
		exampleFileSystemXmlApplicationContext();
		exampleClassPathXmlApplicationContext();
	}
	
	
	
	private static void exampleBeanFactory() {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(new ClassPathResource("com/example/spring/core/c_xmlBased/a_instantiate_ioc/Beans.xml"));
		Account acc = (Account) factory.getBean("account");
		acc.print();
	}
	
	
	
	
	private static void exampleFileSystemXmlApplicationContext() {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("D:\\Code\\POC\\git_Spring\\4_Spring_Core\\src\\main\\java\\com\\example\\spring\\c_instantiate_ioc\\Beans.xml");
		Account acc = (Account)context.getBean("account");
		acc.print();
		context.close();
	}
	
	private static void exampleClassPathXmlApplicationContext() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/example/spring/core/c_xmlBased/a_instantiate_ioc/Beans.xml");
		Account acc = (Account)context.getBean("account");
		acc.print();
		context.close();
	}
}



