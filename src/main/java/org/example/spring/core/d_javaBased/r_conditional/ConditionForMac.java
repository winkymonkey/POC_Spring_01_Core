package org.example.spring.core.d_javaBased.r_conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;


public class ConditionForMac implements Condition {
	
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		String os = System.getProperty("os.name");
		if(os.contains("Mac"))
			return true;
		else
			return false;
	}
}
