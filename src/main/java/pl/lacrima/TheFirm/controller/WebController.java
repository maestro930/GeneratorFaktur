package pl.lacrima.TheFirm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pl.lacrima.TheFirm.database.model.Contractor;
import pl.lacrima.TheFirm.database.model.Warehouse;
import pl.lacrima.TheFirm.service.ContractorService;
import pl.lacrima.TheFirm.service.WarehouseService;

import java.util.List;

@Controller
public class WebController {

    // ******************************************************
    public final WarehouseService warehouseService;

    public WebController(WarehouseService warehouseService){
        this.warehouseService = warehouseService;
    }
    // ******************************************************


    @RequestMapping(value = "newProduct", method = RequestMethod.GET)
    public ModelAndView redirectToJSP() {
        return new ModelAndView("newProduct");
    }


    @RequestMapping(value = "wareweblist", method = RequestMethod.GET)
    public String WarehouseWebList() {
        return "warehouseWebList";
    }

    @RequestMapping("allproducts")
    public String retrieveAllProducts(Model model) {
        List<Warehouse> list = warehouseService.findAll();
        model.addAttribute("ALL_PRODUCTS", list);
        return "retrieveAllProducts";
    }

    @RequestMapping(value = "newproduct", method = RequestMethod.POST)
    public String createNewProduct(@ModelAttribute("warehouse") Warehouse warehouse) {
        warehouseService.save(warehouse);
        return "redirect:allproducts";
    }
}