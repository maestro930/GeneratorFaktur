package pl.lacrima.TheFirm.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NipValidator implements ConstraintValidator<Nip, String> {

    @Override
    public void initialize(Nip paramA) {
    }

    @Override
    public boolean isValid(String nipNumber, ConstraintValidatorContext ctx) {
        if(nipNumber == null){
            return false;
        }
        //validate format 10 digits 1234567890

        if (nipNumber.matches("\\d{10}")) return true;

            //validating with - , . or spaces

        else if(nipNumber.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{2}[-\\.\\s]\\d{2}")) return true;


        else return false;
    }
}
