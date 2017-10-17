package pl.lacrima.TheFirm.service;

import org.springframework.stereotype.Service;
import pl.lacrima.TheFirm.database.model.Invoice;
import pl.lacrima.TheFirm.repository.InvoiceRepository;

import java.util.List;

@Service
public class InvoiceService {

    public final InvoiceRepository invoiceRepository;

    public InvoiceService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public List<Invoice> getAllInvoices(){
        return invoiceRepository.findAll();
    }

    public void save(Invoice invoice){
        invoiceRepository.save(invoice);
    }

    public void delete(Long id){
        invoiceRepository.delete(id);
    }

}
