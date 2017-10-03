package pl.lacrima.TheFirm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServlet;


@Controller
public class ControllerTester extends HttpServlet {

    @RequestMapping( value="hello" , method = RequestMethod.GET  )
    public String main(){
        return "insert";
    }

    @RequestMapping( value="read" , method = RequestMethod.GET  )
    public String read(){
        return "read";
    }




}

