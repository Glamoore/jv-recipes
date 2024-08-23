package org.example;

import jakarta.persistence.*;

@Entity
class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int Id;

    @Column(name = "filename")
    String name;

    @Column (name = "file_data")
    String data;

    @Column (name = "associated_recipe")
    String associatedRecipe;

    public Image(int id, String name, String data, String associatedRecipe) {
        Id = id;
        this.name = name;
        this.data = data;
        this.associatedRecipe = associatedRecipe;
    }
}
