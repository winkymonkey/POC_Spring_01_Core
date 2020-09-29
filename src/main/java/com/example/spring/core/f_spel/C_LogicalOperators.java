package com.example.spring.core.f_spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class C_LogicalOperators {
	
	@Value("#{250 > 200 && 200 < 4000}")	// true
	private boolean and; 
	 
	@Value("#{250 > 200 and 200 < 4000}")	// true
	private boolean andAlphabetic;
	 
	@Value("#{400 > 300 || 150 < 100}")		// true
	private boolean or;
	 
	@Value("#{400 > 300 or 150 < 100}")		// true
	private boolean orAlphabetic;
	 
	@Value("#{!true}")						// false
	private boolean not;
	 
	@Value("#{not true}")					// false
	private boolean notAlphabetic;

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("C_LogicalOperators [and=");
		builder.append(and);
		builder.append(", andAlphabetic=");
		builder.append(andAlphabetic);
		builder.append(", or=");
		builder.append(or);
		builder.append(", orAlphabetic=");
		builder.append(orAlphabetic);
		builder.append(", not=");
		builder.append(not);
		builder.append(", notAlphabetic=");
		builder.append(notAlphabetic);
		builder.append("]");
		return builder.toString();
	}
}
