package pl.lacrima.TheFirm.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PostalCodeValidator implements ConstraintValidator<PostalCode, String> {

    @Override
    public void initialize(PostalCode paramA) {
    }

    @Override
    public boolean isValid(String postalC, ConstraintValidatorContext ctx) {
        if (postalC == null) {
            return false;
        }
        //validate format 5 digits 12345

        if (postalC.matches("\\d{5}")) return true;

            //validating with - , . or spaces

        else if (postalC.matches("\\d{2}[-\\.\\s]\\d{3}")) return true;

        else return false;
    }
}