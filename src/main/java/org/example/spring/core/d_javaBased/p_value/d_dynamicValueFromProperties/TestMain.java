package org.example.spring.core.d_javaBased.p_value.d_dynamicValueFromProperties;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestMain {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext("com.example.spring.d_javaBased.o_value.d_dynamicValueFromProperties");
		
		Employee emp = context.getBean(Employee.class);
		System.out.println(emp.getName() + "\t" + emp.getAge());
		
		Vehicle veh = context.getBean(Vehicle.class);
		System.out.println(veh.getBrand());
		
		context.close();
	}
}
