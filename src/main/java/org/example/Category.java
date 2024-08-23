package org.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
class Category {

    @Id
    int id;

    @Column (name = "name")
    String name;

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
