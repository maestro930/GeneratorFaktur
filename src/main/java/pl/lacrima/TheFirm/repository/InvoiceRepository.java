package pl.lacrima.TheFirm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.lacrima.TheFirm.database.model.Invoice;

import java.util.Date;
import java.util.List;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

    List<Invoice> findByDateOfSaleIsAfter(Date date);
    List<Invoice> findAll();

}
