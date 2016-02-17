package com.skywell.banking.annotations.validations;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import javax.ws.rs.ext.Provider;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by viv on 16.02.2016.
 */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NotEmptyNull.FieldValidator.class)
public @interface NotEmptyNull {

    String message() default "{NotEmptyNull.String}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String field() default "";

    @Provider
    class FieldValidator implements ConstraintValidator<NotEmptyNull, String> {

        public void initialize(NotEmptyNull userSid) {
        }

        public boolean isValid(String value, ConstraintValidatorContext context) {
            return value != null && !value.isEmpty();
        }
    }

}
