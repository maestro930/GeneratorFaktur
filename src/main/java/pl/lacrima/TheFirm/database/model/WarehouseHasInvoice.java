package pl.lacrima.TheFirm.database.model;

import org.hibernate.annotations.Generated;

import javax.persistence.*;

@Entity
@Table(name = "warehouse_has_invoice")
public class WarehouseHasInvoice {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "warehouse_id")
    private Warehouse warehouse;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "invoice")
    private Invoice invoice;

    @Column(name = "quantity_of_products_on_invoice")
    private Long quantityOfProductsOnInvoice;

    public WarehouseHasInvoice() {};

    public WarehouseHasInvoice(Warehouse warehouse, Invoice invoice, Long quantityOfProductsOnInvoice) {
        this.warehouse = warehouse;
        this.invoice = invoice;
        this.quantityOfProductsOnInvoice = quantityOfProductsOnInvoice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Long getQuantityOfProductsOnInvoice() {
        return quantityOfProductsOnInvoice;
    }

    public void setQuantityOfProductsOnInvoice(Long quantityOfProductsOnInvoice) {
        this.quantityOfProductsOnInvoice = quantityOfProductsOnInvoice;
    }
}
