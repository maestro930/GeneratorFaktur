package pl.lacrima.TheFirm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.lacrima.TheFirm.database.model.User;
import pl.lacrima.TheFirm.email.SendMsgUsingGmail;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {


        private final SendMsgUsingGmail sMUG = new SendMsgUsingGmail();
        private static final Logger logger = LoggerFactory
                .getLogger(UserController.class);

        private Map<String, User> users = null;

        public UserController(){
            users = new HashMap<String, User>();
        }

        @RequestMapping(value = "/user/save", method = RequestMethod.GET)
        public String saveCustomerPage(Model model) {
            logger.info("Returning userSave.jsp page");
            model.addAttribute("user", new User());
            return "userSave";
        }

        @RequestMapping(value = "/user/save.do", method = RequestMethod.POST)
        public String saveCustomerAction(
                User user,
                BindingResult bindingResult, Model model) {
            if (bindingResult.hasErrors()) {
                logger.info("Returning userSave.jsp page");
                return "userSave";
            }
            logger.info("Returning userSaveSuccess.jsp page");
            model.addAttribute("user", user);
            users.put(user.getEmail(), user);
            sMUG.sendingMailTo(user.getEmail(), user.getLogin());
            return "userSaveSuccess";
        }

    }

//https://stackoverflow.com/questions/7356684/spring-annotation-relation-with-formform-commandname-xy
//https://www.journaldev.com/2668/spring-validation-example-mvc-validator