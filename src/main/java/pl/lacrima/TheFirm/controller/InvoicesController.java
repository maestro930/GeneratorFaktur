package pl.lacrima.TheFirm.controller;

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
import pl.lacrima.TheFirm.service.WarehouseService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class InvoicesController {

    public final ContractorService contractorService;
    public final WarehouseService warehouseService;
    public final InvoiceService invoiceService;

    public InvoicesController(ContractorService contractorService, WarehouseService warehouseService, InvoiceService invoiceService) {
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
    public String addNewInvoice(@ModelAttribute("invoice") Invoice invoice){

        Contractor con = invoice.getContractor();
        System.out.println("!!!contractor = " + con);

        Date date = new Date();
        invoice.setDateOfSale(new java.sql.Date(date.getTime()));
        invoiceService.save(invoice);
        return "redirect:allinvoices";
    }

//    @RequestMapping("newinvoice")
//    public String addNewInvoice(Model model){
//        List<Invoice> listOfInvoices = invoiceService.getAllInvoices();
//        model.addAttribute( "ALL_INVOICES", listOfInvoices);
//        return "retrieveAllInvoices";
//    }


}
