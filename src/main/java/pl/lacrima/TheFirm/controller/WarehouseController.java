package pl.lacrima.TheFirm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pl.lacrima.TheFirm.database.model.Contractor;
import pl.lacrima.TheFirm.database.model.Warehouse;
import pl.lacrima.TheFirm.service.ContractorService;
import pl.lacrima.TheFirm.service.WarehouseService;

import java.util.List;

@Controller
public class WarehouseController {

    // ******************************************************
    public final WarehouseService warehouseService;

    public WarehouseController(WarehouseService warehouseService){
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

    @RequestMapping("deleteproduct")
    public String deleteProduct(@RequestParam("id") Long id) {
        warehouseService.deleteProduct(id);
        return "redirect:allproducts";
    }

    // update
    @RequestMapping(value = "updateproduct", method = RequestMethod.GET)
    public ModelAndView editProduct(@RequestParam("id") Long id) {
        ModelAndView mav = new ModelAndView("updateProduct");
        Warehouse warehouse = warehouseService.findProductById(id);
        mav.addObject("updateProduct", warehouse);
        return mav;
    }

    @RequestMapping(value = "updateproduct", method = RequestMethod.POST)
    public String updateProduct(@ModelAttribute("updateProduct") Warehouse warehouse) {
        warehouseService.save(warehouse);
        return "redirect:allproducts";
    }
}