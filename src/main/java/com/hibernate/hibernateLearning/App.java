package com.hibernate.hibernateLearning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        
       


        
        Configuration config = new Configuration();
        config.configure();
        SessionFactory factory = config.buildSessionFactory();
        
        Session session = factory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        
        
        session.save(tx);
        tx.commit();
        factory.close();
        
        
        
    }
}
