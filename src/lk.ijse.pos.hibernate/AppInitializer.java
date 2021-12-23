package lk.ijse.pos.hibernate;


import lk.ijse.pos.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppInitializer {

    public static void main(String []args){

        Session session = FactoryConfiguration.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        transaction.commit();
        session.close();

    }

}
