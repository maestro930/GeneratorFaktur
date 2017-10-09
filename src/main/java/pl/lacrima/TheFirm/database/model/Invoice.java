package pl.lacrima.TheFirm.database.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "invoice")
public class Invoice {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateOfSale;

    @ManyToOne
    @JoinColumn(name = "contractor_id")
    private Contractor contractor;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "invoice")
    private List<WarehouseHasInvoice> warehouseHasInvoices;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Invoice(){}

    public Invoice(Date dateOfSale, Contractor contractor, List<WarehouseHasInvoice> warehouseHasInvoices, User user) {
        this.dateOfSale = dateOfSale;
        this.contractor = contractor;
        this.warehouseHasInvoices = warehouseHasInvoices;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateOfSale() {
        return dateOfSale;
    }

    public void setDateOfSale(Date dateOfSale) {
        this.dateOfSale = dateOfSale;
    }

    public Contractor getContractor() {
        return contractor;
    }

    public void setContractor(Contractor contractor) {
        this.contractor = contractor;
    }

    public List<WarehouseHasInvoice> getWarehouseHasInvoices() {
        return warehouseHasInvoices;
    }

    public void setWarehouseHasInvoices(List<WarehouseHasInvoice> warehouseHasInvoices) {
        this.warehouseHasInvoices = warehouseHasInvoices;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
