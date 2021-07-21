package org.example.spring.core.f_spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class E_RegEx {
	
	@Value("#{'100' matches '\\d+' }")								// true
	private boolean validNumericStringResult;
	 
	@Value("#{'100fghdjf' matches '\\d+' }")						// false
	private boolean invalidNumericStringResult;
	 
	@Value("#{'valid alphabetic string' matches '[a-zA-Z\\s]+' }")			// true
	private boolean validAlphabeticStringResult;
	 
	@Value("#{'invalid alphabetic string #$1' matches '[a-zA-Z\\s]+' }") 	// false
	private boolean invalidAlphabeticStringResult;
	 
	@Value("#{someBean.someValue matches '\\d+'}") 					// true if someValue contains only digits
	private boolean validNumericValue;
	
}
