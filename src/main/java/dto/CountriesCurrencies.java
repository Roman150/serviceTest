package dto;


import javax.persistence.*;

@Entity
@Table(name = "countriescurrencies")
public class CountriesCurrencies {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private int id;

    @Column(name = "Country", nullable = false, unique = true)
    private String Country;

    @Column(name = "Currency", nullable = false, unique = true)
    private String Currency;

    public int getId() {
        return id;
    }


    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public CountriesCurrencies() {
    }

    public CountriesCurrencies(String country, String currency) {
        this.Country = country;
        this.Currency = currency;
    }

    @Override
    public String toString() {
        return "CountriesCurrencies{" +
                "id=" + id +
                ", Country='" + Country + '\'' +
                ", Currency='" + Currency + '\'' +
                '}';
    }
}
