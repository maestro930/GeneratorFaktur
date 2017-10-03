package pl.lacrima.TheFirm.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = NipValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Nip {

    String message() default "{Nip}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
