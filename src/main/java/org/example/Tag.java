package org.example;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;

@Entity
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "name")
    String name;

    public Tag(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
