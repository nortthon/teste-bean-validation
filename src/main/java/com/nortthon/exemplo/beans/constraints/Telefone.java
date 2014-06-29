package com.nortthon.exemplo.beans.constraints;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.nortthon.exemplo.beans.constraintvalidator.TelefoneValidator;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Constraint(validatedBy= TelefoneValidator.class)
public @interface Telefone {
	String message() default "{telefone.invalido.message}";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}