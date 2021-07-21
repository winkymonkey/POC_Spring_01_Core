package org.example.spring.core.f_spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class A_ArithmeticOperators {

	@Value("#{19 + 1}") 			// 20
	private double add;

	@Value("#{'str1 ' + 'str2'}")	// "str1 str2"
	private String addString;

	@Value("#{20 - 1}")				// 19
	private double subtract;

	@Value("#{10 * 2}")				// 20
	private double multiply;

	@Value("#{36 / 2}")				// 19
	private double divide;

	@Value("#{36 div 2}")			// 18 (the same as for / operator)
	private double divideAlphabetic;

	@Value("#{37 % 10}")			// 7
	private double modulo;

	@Value("#{37 mod 10}")			// 7 (the same as for % operator)
	private double moduloAlphabetic;

	@Value("#{2 ^ 9}")				// 512
	private double powerOf;

	@Value("#{(2 + 2) * 2 + 9}")	// 17
	private double brackets;

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("A_ArithmeticOperators [add=");
		builder.append(add);
		builder.append(", addString=");
		builder.append(addString);
		builder.append(", subtract=");
		builder.append(subtract);
		builder.append(", multiply=");
		builder.append(multiply);
		builder.append(", divide=");
		builder.append(divide);
		builder.append(", divideAlphabetic=");
		builder.append(divideAlphabetic);
		builder.append(", modulo=");
		builder.append(modulo);
		builder.append(", moduloAlphabetic=");
		builder.append(moduloAlphabetic);
		builder.append(", powerOf=");
		builder.append(powerOf);
		builder.append(", brackets=");
		builder.append(brackets);
		builder.append("]");
		return builder.toString();
	}

}
