package org.example;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Date;


public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        SessionFactory firstSession = Database.getSessionFactory();

        if(firstSession != null) {
            System.out.println("Schema exported successfully");
            Session ss = firstSession.openSession();
//            ss.persist(new Category(1, "Desserts"));
            ss.persist(new User(1, "James", "jamesSmith@email.com", "password", "23-08-2024"));
        } else {
            System.out.println("Failed to export the schema");
        }

        firstSession.close();

    }

}