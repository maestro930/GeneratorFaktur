package pl.lacrima.TheFirm.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PhoneValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Phone {


    String message() default "Invalid format, valid formats are 123456789, 123-456-789";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}