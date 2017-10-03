package pl.lacrima.TheFirm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.lacrima.TheFirm.database.model.Invoice;
import pl.lacrima.TheFirm.repository.InvoiceRepository;

import java.util.List;

@Service
public class InvoiceService {

    private final InvoiceRepository invoiceRepository;

    @Autowired
    public InvoiceService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }


    public void save(Invoice invoice){
        invoiceRepository.save(invoice);
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
