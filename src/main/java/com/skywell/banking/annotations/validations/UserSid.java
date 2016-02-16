package com.skywell.banking.annotations.validations;

import com.skywell.banking.views.BaseRequest;
import com.skywell.banking.views.user.UserLoginAuth;

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
@Constraint(validatedBy = UserSid.UserSidValidator.class)
public @interface UserSid {

    String message() default "{NotNull.BaseRequest.sid}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    @Provider
    class UserSidValidator implements ConstraintValidator<UserSid, BaseRequest> {

        public void initialize(UserSid userSid) {
        }

        public boolean isValid(BaseRequest value, ConstraintValidatorContext context) {
            return value.getSid() != null && !value.getSid().isEmpty();
        }
    }

}
