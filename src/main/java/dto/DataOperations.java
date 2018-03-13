package dto;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class DataOperations {
    private static List<CountriesCurrencies> countriesCurrenciesList;

    public void insertData(String Country, String Currency) {
        CountriesCurrencies countriesCurrencies = new CountriesCurrencies(Country, Currency);
        Session session = HibernateConnectivity.createSessionFactory().openSession();
        session.beginTransaction();
        session.save(countriesCurrencies);
        session.getTransaction().commit();
        session.close();
    }

    public List<CountriesCurrencies> getAllTableData() {
        Session session = HibernateConnectivity.createSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from CountriesCurrencies");
        countriesCurrenciesList = query.list();
        transaction.commit();
        session.close();
        return countriesCurrenciesList;
    }


    public void updateCurrency(){

    }

    public void updateCountry(){

    }

    public void deleteData(){

    }


}
