package org.example.spring.core.f_spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class D_ConditionalOperator {
	
	@Value("#{2 > 1 ? 'a' : 'b'}")		// "a"
	private String ternary;
	
	@Value("#{someBean.someProperty != null ? someBean.someProperty : 'default'}")
	private String ternaryAnother;
	
	@Value("#{someBean.someProperty ?: 'default'}")		// Will inject provided string if someProperty is null
	private String elvis;
	
}
