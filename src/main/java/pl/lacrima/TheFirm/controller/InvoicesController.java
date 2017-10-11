package pl.lacrima.TheFirm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.lacrima.TheFirm.database.model.Invoice;
import pl.lacrima.TheFirm.database.model.Warehouse;
import pl.lacrima.TheFirm.service.InvoiceService;
import pl.lacrima.TheFirm.service.WarehouseService;

import java.util.List;

@Controller
public class InvoicesController {

    public final  WarehouseService warehouseService;
    public final InvoiceService invoiceService;

    public InvoicesController(WarehouseService warehouseService, InvoiceService invoiceService) {
        this.warehouseService = warehouseService;
        this.invoiceService = invoiceService;
    }


    @RequestMapping("allinvoices")
    public String retrieveAllInvoices(Model model){
        List<Invoice> listOfInvoices = invoiceService.getAllInvoices();
        model.addAttribute( "ALL_INVOICES", listOfInvoices);
        return "retrieveAllInvoices";
    }

    @RequestMapping(value = "newinvoice" ,method = RequestMethod.GET)
    public String newInvoice(Model model){
        List<Warehouse> warehouseList = warehouseService.findAll();
        List<Invoice> listOfInvoices = invoiceService.getAllInvoices();
        model.addAttribute( "ALL_INVOICES", listOfInvoices);
        model.addAttribute( "ALL_WAREHOUSE", warehouseList);
        return "newInvoice";
    }

//    @RequestMapping(value = "addinvoice" ,method = RequestMethod.POST)
//    public String addNewInvoice(@ModelAttribute("invoice") Invoice invoice){
//        invoiceService.save(invoice);
//        return "redirect:allinvoices";
//    }

//    @RequestMapping("newinvoice")
//    public String addNewInvoice(Model model){
//        List<Invoice> listOfInvoices = invoiceService.getAllInvoices();
//        model.addAttribute( "ALL_INVOICES", listOfInvoices);
//        return "retrieveAllInvoices";
//    }


}
