package com.nortthon.exemplo.beans;

import java.util.Set;

import static org.junit.Assert.*;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.Before;
import org.junit.Test;

public class ClienteTest {
	
	Validator validator;
	
	@Before
	public void initialize(){
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();    	
    	validator = factory.getValidator();    	
	}
	
	@Test
	public void deveValidarDadosCliente(){
		Cliente cliente = new Cliente("Lucas Augusto", "nomeemail@provedor.com", "+55 (11) 3231 944", "323.418.448-78", "411231231");
		
		Set<ConstraintViolation<Cliente>> constraintViolations =  validator.validate(cliente);
		
		// Esperamos 2 mensagens. Uma na validação do CPF
		// e outra na validação do numero de telefone.
		assertEquals(2, constraintViolations.size());
		
		// imprimindo as mensagens no console.
		for (ConstraintViolation<Cliente> error : constraintViolations) {
			System.out.println(error.getMessage());
		}
		
	}
	
}
