package com.cognizant.demodiffjpaandhib.hibernate;
import com.cognizant.demodiffjpaandhib.model.Employee;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Hib {
    private static final SessionFactory sessionFactory = new Configuration()
            .configure() // uses hibernate.cfg.xml
            .addAnnotatedClass(Employee.class)
            .buildSessionFactory();

    @SuppressWarnings("deprecation")
    public Integer addEmployee(Employee employee) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        Integer employeeID = null;
        try {
            tx = session.beginTransaction();
            employeeID = (Integer) session.save(employee);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return employeeID;
    }
}
