package dao.Custom.Impl;


import dao.Custom.ResgistrationDAO;
import entity.Registration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.FactoryConfiguration;

import java.io.Serializable;
import java.util.List;

public class RegistrationDAOImpl implements ResgistrationDAO {
    private SessionFactory sessionFactory;

    public RegistrationDAOImpl(){
        this.sessionFactory = FactoryConfiguration.getSessionFactory();
    }


    @Override
    public boolean save(Registration entity) throws Exception {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Serializable save = session.save(entity);
        session.getTransaction().commit();
        return save != null;
    }

    @Override
    public boolean update(Registration entity) throws Exception {
        try{
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.update(entity);
            session.getTransaction().commit();
            return true;
        }catch (Exception e){
        }
        return false;
    }

    @Override
    public boolean delete(Registration entity) throws Exception {
        try{
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.delete(entity);
            session.getTransaction().commit();
            return true;
        }catch (Exception e){
        }
        return false;
    }

    @Override
    public Registration search(Registration entity) throws Exception {
        try{
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            Registration registration = session.find(Registration.class, entity.getR_id());
            session.getTransaction().commit();
            return registration;
        }catch (Exception e){
        }
        return null;
    }

    @Override
    public List<Registration> getAll() throws Exception {
        try{
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            List<Registration> registrationList = session.createNativeQuery("SELECT * FROM registration",Registration.class).list();
            session.getTransaction().commit();
            return registrationList;
        }catch (Exception e){
        }
        return null;
    }

    @Override
    public List<Registration> getAllRegistration(String studentID) throws Exception {
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            List<Registration> registrationList = session.createNativeQuery("SELECT * FROM registration WHERE course_courseId=?",Registration.class).setParameter(1,studentID).list();
            session.getTransaction().commit();
            return registrationList;
        }catch (Exception e){
        }
        return null;
    }

}
