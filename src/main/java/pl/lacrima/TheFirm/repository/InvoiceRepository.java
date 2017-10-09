package pl.lacrima.TheFirm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.lacrima.TheFirm.database.model.Invoice;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice,Long>{

}
