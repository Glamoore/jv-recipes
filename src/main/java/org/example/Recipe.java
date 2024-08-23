package org.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
class Recipe {
    @Id
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
    int rating;

    @Column (name = "list_ingredients")
    Ingredient listOfIngredients;

    @Column (name = "list_categories")
    Category listOfCategories;

//    @Column (name = "creator")
//    User creator;

    @Column (name = "date_created")
    Date dateCreated;

     @Column (name = "last_modified")
    Date lastModified;
}
