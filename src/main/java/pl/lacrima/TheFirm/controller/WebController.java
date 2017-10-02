package pl.lacrima.TheFirm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {

    @RequestMapping(value = "newProduct", method = RequestMethod.GET)
    public ModelAndView redirectToJSP() {
        return new ModelAndView("newProduct");
    }
}
