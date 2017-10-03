package pl.lacrima.TheFirm.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneValidator implements ConstraintValidator<Phone, String> {

    @Override
    public void initialize(Phone paramA) {
    }

    @Override
    public boolean isValid(String phoneNumber, ConstraintValidatorContext ctx) {
        if(phoneNumber == null){
            return false;
        }
        //validate format 9 digits 123456789

        if (phoneNumber.matches("\\d{9}")) return true;

            //validating with - , . or spaces

        else if(phoneNumber.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{3}")) return true;

            //validating phone number where area code is in braces ()

        else if(phoneNumber.matches("\\(\\d{3}\\)-\\d{3}-\\d{3}")) return true;

            //return false if nothing matches the input
        else return false;
    }

}
