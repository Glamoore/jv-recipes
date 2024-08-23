package org.example;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        SessionFactory firstSession = Database.getSessionFactory();

        if(firstSession != null) {
            System.out.println("Schema exported successfully");
            Session ss = firstSession.openSession();
            ss.persist(new Category(1, "Desserts"));
        } else {
            System.out.println("Failed to export the schema");
        }

        firstSession.close();

    }

}