package pl.lacrima.TheFirm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.lacrima.TheFirm.database.model.User;
import pl.lacrima.TheFirm.email.SendMsgUsingGmail;
import pl.lacrima.TheFirm.security.service.UserService;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@Controller
public class UserRegistrationController {



    private final SendMsgUsingGmail sMUG = new SendMsgUsingGmail();
        private static final Logger logger = LoggerFactory
                .getLogger(UserRegistrationController.class);
    private UserService userService;
    private Map<String, User> users = null;

        @Autowired
        public UserRegistrationController(UserService userService){
            this.userService = userService;
            users = new HashMap<String, User>();
    }

        @RequestMapping(value = "/user/save", method = RequestMethod.GET)
        public String saveUserPage( Model model) {
            logger.info("Returning userSave.jsp page");
            model.addAttribute("command", new User());
            return "userSave";
        }

        @RequestMapping(value = "/user/saved", method = RequestMethod.POST)
        public String saveUserAction(
                @Valid @ModelAttribute("command") User user,
                BindingResult bindingResult, Model model) {
            if (bindingResult.hasErrors()) {
                logger.info("Returning userSave.jsp page");
                return "userSave";
            }
            logger.info("Returning userSaveSucces.jsp page");
            model.addAttribute(user);
            users.put(user.getEmail(), user);
            sMUG.sendingMailTo(user.getEmail(), user.getLogin());
            userService.registerNewUser(user);
            return "userSaveSucces"; //should be double ss
        }

    }

//https://stackoverflow.com/questions/7356684/spring-annotation-relation-with-formform-commandname-xy
//https://www.journaldev.com/2668/spring-validation-example-mvc-validator
//CGI <- cv tam bluesoft.