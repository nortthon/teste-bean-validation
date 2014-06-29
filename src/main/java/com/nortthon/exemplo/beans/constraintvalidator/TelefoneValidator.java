package com.nortthon.exemplo.beans.constraintvalidator;

import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.nortthon.exemplo.beans.constraints.Telefone;

public class TelefoneValidator implements ConstraintValidator<Telefone, String> {

	public void initialize(Telefone constraintAnnotation) {
		
	}
	
	public boolean isValid(String value, ConstraintValidatorContext context) {
				
		/*
		 * Um breve exemplo de numeros de telefone sendo validado com a utilização de regex.
		 * Este exemplo analiza um conjunto de números para um contexto expecífico. Portanto,
		 * não contempla todas as possibilidades de números telefonicos válidos.
		 * Exemplo de valores aceitos: 
		 * 		+9 (99) 9999-9999, +9 99 9999-9999, +9 (99) 9999 9999, +9 99 9999 9999 
		 * 		+99 (99) 9999-9999, +99 99 9999-9999, +99 (99) 9999 9999, +99 99 9999 9999 
		 * 		(99) 9999-9999, 99 9999-9999, (99) 9999 9999, 99 9999 9999 
		 */
		return Pattern.matches("(\\+[\\d]{1,2} )*\\({0,1}[\\d]{2,3}\\){0,1} [\\d]{3,4}(-| )[\\d]{4}", value);
		
	}
	
}
