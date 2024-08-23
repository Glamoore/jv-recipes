package org.example;


import jakarta.persistence.*;
import org.hibernate.mapping.Set;

import java.util.Date;

@Entity
@Table (name = "User")
class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "username")
    String userName;

    @Column (name = "email")
    String email;

    @Column (name = "password")
    String password;

    @Column (name = "roles")
    @Enumerated(EnumType.STRING)
    private Roles roles;

    @Column (name = "date_registered")
    String dateRegistered;

    public User(int id, String userName, String email, String password, String dateRegistered) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.roles = roles;
        this.dateRegistered = dateRegistered;
    }
}
