package pl.lacrima.TheFirm.database.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import pl.lacrima.TheFirm.validator.Login;
import pl.lacrima.TheFirm.validator.Nip;
import pl.lacrima.TheFirm.validator.Phone;
import pl.lacrima.TheFirm.validator.PostalCode;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import java.util.List;

@Entity
@Table(name = "user")
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long    id;
    @NotBlank(message = "This is a required field")
        private String  contractorName;

       @Nip(message = "Nip number is not valid, valid formats are 1234567890, 123-456-78-90")
        private String  nip;

    @NotBlank(message = "This is a required field")
        private String  street;
    @NotBlank(message = "This is a required field")
        private String  city;
       @PostalCode(message = "Postal code is not valid, valid formats are 12-345, 12345")
        private String  postalCode;

       @Phone(message = "Phone number is not valid, valid formats are 123456789, 123-456-789")
        private String phone;

       @Email(message = "Email address is not valid")
        private String  email;


        @Column(unique = true)
        @Login(message = "This login exists")
        @NotBlank(message = "This is a required field")
        private String login;

        @NotBlank(message = "This is a required field")
        private String password;

        @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
        private List<Invoice> invoices;
        public User(){};


    public User(String contractorName, String nip, String street, String city, String postalCode, String phone, String email) {
        this.contractorName = contractorName;
        this.nip = nip;
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.phone = phone;
        this.email = email;
        this.login = login;
        this.password = password;

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
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!login.equals(user.login)) return false;
        return password.equals(user.password);
    }

    @Override
    public int hashCode() {
        int result = login.hashCode();
        result = 31 * result + password.hashCode();
        return result;
    }


}
