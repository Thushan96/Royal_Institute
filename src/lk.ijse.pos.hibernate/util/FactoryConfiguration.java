package lk.ijse.pos.hibernate.util;

import lk.ijse.pos.hibernate.entity.Course;
import lk.ijse.pos.hibernate.entity.Registration;
import lk.ijse.pos.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.Properties;


public class FactoryConfiguration {

    private static SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        StandardServiceRegistry standardServiceRegistry =
                new StandardServiceRegistryBuilder().loadProperties("hibernate.properties").build();

        Metadata metadata = new MetadataSources(standardServiceRegistry)
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Registration.class)
                .addAnnotatedClass(Course.class)
                .getMetadataBuilder().build();
        return metadata.getSessionFactoryBuilder().build();
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }

}


