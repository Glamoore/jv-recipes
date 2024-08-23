package org.example;

import jakarta.persistence.*;

import java.util.Date;

@Entity
class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "rating_value")
    @Enumerated(EnumType.STRING)
    private RatingValue value;

    @Column (name = "date_rated")
    Date dateRated;

    @Column (name = "associated_recipe")
    String associatedRecipe;

    @Column (name = "rater")
    @ManyToOne
    User rater;

    public Rating(int id, RatingValue value, Date dateRated, String associatedRecipe, User rater) {
        this.id = id;
        this.value = value;
        this.dateRated = dateRated;
        this.associatedRecipe = associatedRecipe;
        this.rater = rater;
    }
}
