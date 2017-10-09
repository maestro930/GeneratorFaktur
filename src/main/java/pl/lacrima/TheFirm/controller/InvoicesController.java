package pl.lacrima.TheFirm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.lacrima.TheFirm.database.model.Invoice;
import pl.lacrima.TheFirm.service.InvoiceService;

import java.util.List;

@Controller
public class InvoicesController {

    public final InvoiceService invoiceService;

    public InvoicesController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @RequestMapping("allinvoices")
    public String retrieveAllInvoices(Model model){
        List<Invoice> listOfInvoices = invoiceService.getAllInvoices();
        model.addAttribute( "ALL_INVOICES", listOfInvoices);
        return "retrieveAllInvoices";
    }
}
