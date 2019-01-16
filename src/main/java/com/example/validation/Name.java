/**
 * 
 */
package com.example.validation;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.ElementType.ANNOTATION_TYPE;

import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
/**
 * @AUTHOR UDDHAV
 *
 */

@Target({ TYPE, FIELD, METHOD,ANNOTATION_TYPE, PARAMETER, CONSTRUCTOR })

@Retention(RUNTIME)
//@Repeatable(List.class)
@Documented
@Constraint(validatedBy = {NameValidator.class})
public @interface Name {
	String message() default "Must end with {value}";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
    String value();
    
    @Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
    @Retention(RUNTIME)
    @Documented
    @interface List {
        String[] value();
    }
}
