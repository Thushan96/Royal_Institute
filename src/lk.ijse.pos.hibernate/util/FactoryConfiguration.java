package lk.ijse.pos.hibernate.util;

import lk.ijse.pos.hibernate.entity.Course;
import lk.ijse.pos.hibernate.entity.Registration;
import lk.ijse.pos.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.boot.Metadata;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class FactoryConfiguration {


    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;

    private FactoryConfiguration() {

        Properties properties=new Properties();
        try {
            properties.load(new FileInputStream("hibernate.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Configuration configuration = new Configuration().addAnnotatedClass(Student.class);
        sessionFactory = configuration.buildSessionFactory();
    }

    public static FactoryConfiguration getInstance() {
        return (factoryConfiguration == null) ? factoryConfiguration = new FactoryConfiguration()
                : factoryConfiguration;
    }
    public Session getSession() {
        return sessionFactory.openSession();
    }

}


