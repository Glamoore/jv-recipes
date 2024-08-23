package org.example;

import jakarta.persistence.*;

import java.util.Date;

@Entity
class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column (name = "text")
    String text;

    @Column (name = "date_posted")
    Date datePosted;

    @Column (name = "author")
    @ManyToOne (fetch = FetchType.LAZY)
        @JoinColumn(name = "id")
    User author;

    @Column (name = "associated_recipe")
    Recipe recipe;

    public Comment(int id, String text, Date datePosted, User author, Recipe recipe) {
        this.id = id;
        this.text = text;
        this.datePosted = datePosted;
        this.author = author;
        this.recipe = recipe;
    }

//    @Entity
//public class Item {
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "fk_order")
//    private PurchaseOrder order;
//    ...
//}
//@Entity
//public class PurchaseOrder {
//
//    @OneToMany(mappedBy = "order")
//    private List<Item> items = new ArrayList<Item>();
//    ...
}
