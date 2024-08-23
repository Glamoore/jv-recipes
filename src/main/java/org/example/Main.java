package org.example;

import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;


public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        SessionFactory firstSession = Database.getSessionFactory();

        if(firstSession != null) {
            System.out.println("Schema exported successfully");
        } else {
            System.out.println("Failed to export the schema");
        }

        firstSession.close();

    }

}