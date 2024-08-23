package org.example;

import jakarta.persistence.*;

@Entity
class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "name")
    String name;

    @Column(name = "name")
    int quantity;

    @Column (name = "unit_of_measurement")
    String unitOfMeasurement;

    public Ingredient(int id, String name, int quantity, String unitOfMeasurement) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.unitOfMeasurement = unitOfMeasurement;
    }
}
