package pl.lacrima.TheFirm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.lacrima.TheFirm.database.model.Contractor;
import pl.lacrima.TheFirm.database.model.Invoice;
import pl.lacrima.TheFirm.database.model.Warehouse;
import pl.lacrima.TheFirm.service.ContractorService;
import pl.lacrima.TheFirm.service.InvoiceService;
import pl.lacrima.TheFirm.service.UserFirmService;
import pl.lacrima.TheFirm.service.WarehouseService;

import java.util.Date;
import java.util.List;

@Controller
public class InvoicesController {

    public final UserFirmService userService;
    public final ContractorService contractorService;
    public final WarehouseService warehouseService;
    public final InvoiceService invoiceService;

    @Autowired
    public InvoicesController(UserFirmService userService, ContractorService contractorService, WarehouseService warehouseService, InvoiceService invoiceService) {
        this.userService = userService;
        this.contractorService = contractorService;
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
        List<Contractor> listOfContractors  = contractorService.findAllContractors();
        List<Warehouse> listOfProducts      = warehouseService.findAll();
        List<Invoice> listOfInvoices        = invoiceService.getAllInvoices();
        model.addAttribute( "ALL_CONTRACTORS",  listOfContractors);
        model.addAttribute( "ALL_INVOICES",     listOfInvoices);
        model.addAttribute( "ALL_WAREHOUSE",    listOfProducts);
        return "newInvoice";
    }

    @RequestMapping(value = "addinvoice" ,method = RequestMethod.POST)
    public String addNewInvoice(@ModelAttribute("invoice") Invoice invoice, Contractor contractor){

        Date date = new Date();
        invoice.setDateOfSale(new java.sql.Date(date.getTime()));

        invoice.setUser(userService.getUser());

        if (contractor.getId() != null) {
            invoiceService.save(invoice);
        }
        return "redirect:allinvoices";
    }
}
