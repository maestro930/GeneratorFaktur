package pl.lacrima.TheFirm.database.model;

import pl.lacrima.TheFirm.validator.Phone;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "contractor")
public class Contractor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long    id;
    private String  contractorName;
    private String  nip;
    private String  street;
    private String  city;
    private String  postalCode;
    @Phone
    private String phone;

    private String  email;

    @OneToMany(mappedBy = "contractor", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Invoice> invoices;

    public Contractor(){};

    public Contractor(String contractorName, String nip, String street, String city, String postalCode, String phone, String email) {
        this.contractorName = contractorName;
        this.nip = nip;
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.phone = phone;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getContractorName() {
        return contractorName;
    }

    public void setContractorName(String contractorName) {
        this.contractorName = contractorName;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contractor{" +
                "id=" + id +
                ", contractorName='" + contractorName + '\'' +
                ", nip='" + nip + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}
