package com.example.spring.core.f_spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class B_RelationalOperators {
	
	@Value("#{1 == 1}")					// true
	private boolean equal;
	 
	@Value("#{1 eq 1}")					// true
	private boolean equalAlphabetic;
	 
	@Value("#{1 != 1}")					// false
	private boolean notEqual;
	 
	@Value("#{1 ne 1}")					// false
	private boolean notEqualAlphabetic;
	 
	@Value("#{1 < 1}")					// false
	private boolean lessThan;
	 
	@Value("#{1 lt 1}")					// false
	private boolean lessThanAlphabetic;
	 
	@Value("#{1 <= 1}")					// true
	private boolean lessThanOrEqual;
	 
	@Value("#{1 le 1}")					// true
	private boolean lessThanOrEqualAlphabetic;
	 
	@Value("#{1 > 1}")					// false
	private boolean greaterThan;
	 
	@Value("#{1 gt 1}")					// false
	private boolean greaterThanAlphabetic;
	 
	@Value("#{1 >= 1}")					// true
	private boolean greaterThanOrEqual;
	 
	@Value("#{1 ge 1}")					// true
	private boolean greaterThanOrEqualAlphabetic;

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("B_RelationalOperators [equal=");
		builder.append(equal);
		builder.append(", equalAlphabetic=");
		builder.append(equalAlphabetic);
		builder.append(", notEqual=");
		builder.append(notEqual);
		builder.append(", notEqualAlphabetic=");
		builder.append(notEqualAlphabetic);
		builder.append(", lessThan=");
		builder.append(lessThan);
		builder.append(", lessThanAlphabetic=");
		builder.append(lessThanAlphabetic);
		builder.append(", lessThanOrEqual=");
		builder.append(lessThanOrEqual);
		builder.append(", lessThanOrEqualAlphabetic=");
		builder.append(lessThanOrEqualAlphabetic);
		builder.append(", greaterThan=");
		builder.append(greaterThan);
		builder.append(", greaterThanAlphabetic=");
		builder.append(greaterThanAlphabetic);
		builder.append(", greaterThanOrEqual=");
		builder.append(greaterThanOrEqual);
		builder.append(", greaterThanOrEqualAlphabetic=");
		builder.append(greaterThanOrEqualAlphabetic);
		builder.append("]");
		return builder.toString();
	}
	
}
