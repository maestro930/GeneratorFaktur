package pl.lacrima.TheFirm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.lacrima.TheFirm.database.model.Warehouse;
import pl.lacrima.TheFirm.service.WarehouseService;

import javax.servlet.http.HttpServlet;
import java.util.List;


@Controller
public class ControllerTester extends HttpServlet {

    public final WarehouseService warehouseService;

    public ControllerTester(WarehouseService warehouseService) {
        this.warehouseService = warehouseService;
    }


    @RequestMapping( value="tester" , method = RequestMethod.GET  )
    public String tester(){
        return "tester";
    }


    @RequestMapping( value="read" , method = RequestMethod.GET  )
    public String read(){
        return "read";
    }



}

