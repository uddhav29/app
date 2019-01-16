package com.example.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NameValidator implements ConstraintValidator<Name, String> {
	String name;

    @Override
    public void initialize(Name name) {
        this.name = name.value();
    }
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(value.endsWith(name)) {
			return true;
		}
		return false;
	}
  
}
