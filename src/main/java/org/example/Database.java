package org.example;

import org.hibernate.SessionFactory;
import java.net.URL;
import static java.lang.Boolean.TRUE;
import static org.hibernate.cfg.JdbcSettings.*;


import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Database {

    public static SessionFactory getSessionFactory(){
            SessionFactory sessionFactory = new Configuration()
                    // use H2 in-memory database
                    .setProperty("hibernate.connection.url", "jdbc:h2:mem:db1")
                    // default username / password
                    .setProperty("hibernate.connection.username", "sa")
                    .setProperty("hibernate.connection.password", "")
                    // options to display SQL in console
                    .setProperty("hibernate.show_sql", "true")
                    .setProperty("hibernate.format_sql", "true")
                    .setProperty("hibernate.highlight_sql", "true")
                    .setProperty("hibernate.agroal.maxSize", "20")
                    .addAnnotatedClass(Category.class)
//                    .addAnnotatedClass(User.class)
                    .buildSessionFactory();

            return sessionFactory;
    };

}
