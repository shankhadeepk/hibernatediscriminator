package com.sample.config;

import com.sample.beans.Employee;
import com.sample.beans.Hat;
import com.sample.beans.Product;
import com.sample.beans.Socks;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class HibernateConfiguration {

    public static void main(String... args){
        Configuration configuration=new Configuration();
        configuration.configure("hibernate.cfg.xml");

        ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

        System.out.println("Service Registry :"+ serviceRegistry);

        SessionFactory sessionFactory=configuration.buildSessionFactory(serviceRegistry);

        System.out.println("Session Factory "+ sessionFactory);
        Session session=sessionFactory.openSession();

        Transaction transaction=session.beginTransaction();

       /* Employee emp=new Employee(10,"Shankha");
        session.save(emp);*/

        Product p1=new Product(10,"Phone");

        session.persist(p1);

        Product p2=new Hat(30,"Cowboy","Large");

        session.persist(p2);

        Product p3=new Socks(20,"American","42");

        session.persist(p3);
        transaction.commit();

        System.out.println("Transaction saved successfully");



    }
}
