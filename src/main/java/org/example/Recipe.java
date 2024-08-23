package org.example;

import jakarta.persistence.*;

import java.util.Date;

@Entity
class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column (name = "title")
    String title;

    @Column (name = "description")
    String description;

    @Column (name = "instructions")
    String instructions;

    @Column (name = "preparation_time")
    int preparation_time;

    @Column (name = "servings")
    int serving;

    @Column (name = "difficulty_level")
    int difficultyLevel;

    @Column (name = "ratings")
    Rating rating;

    @Column (name = "list_ingredients")
    Ingredient listOfIngredients;

    @Column (name = "list_categories")
    Category listOfCategories;

    @Column (name = "creator")
    @ManyToOne
    User creator;

    @Column (name = "date_created")
    Date dateCreated;

     @Column (name = "last_modified")
    Date lastModified;
}
