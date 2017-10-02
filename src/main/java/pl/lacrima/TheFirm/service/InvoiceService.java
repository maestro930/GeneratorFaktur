package pl.lacrima.TheFirm.service;

import pl.lacrima.TheFirm.database.model.Contractor;
import pl.lacrima.TheFirm.database.model.Invoice;
import pl.lacrima.TheFirm.repository.ContractorRepository;
import pl.lacrima.TheFirm.repository.InvoiceRepository;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.List;

public class InvoiceService {

    private final InvoiceRepository invoiceRepository;

    public InvoiceService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }



    public Invoice createInvoice(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    public List<Invoice> findAll() {
        return invoiceRepository.findAll();
    }

    public Invoice findOne(long id) {
        return invoiceRepository.findOne(id);
    }
}
