package pl.lacrima.TheFirm.validator;

import org.springframework.beans.factory.annotation.Autowired;
import pl.lacrima.TheFirm.database.model.User;
import pl.lacrima.TheFirm.security.service.UserService;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class LoginValidator implements ConstraintValidator<Login, String> {

    private UserService userService;

    @Autowired
    public LoginValidator(UserService userService) {
        this.userService = userService;

    }

    @Override
    public void initialize(Login paramA) {
    }

    @Override
    public boolean isValid(String login, ConstraintValidatorContext ctx) {
//        if (login.equals(userService.findAll().stream().filter(c->c.getLogin().equals(login)))){
//            return true;
//        }
//        else return false;
//    }
        return true;
    }
}
