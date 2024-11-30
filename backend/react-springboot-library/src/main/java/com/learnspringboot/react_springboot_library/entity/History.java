package com.learnspringboot.react_springboot_library.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "history")
public class History {

    public History(String userEmail, String checkoutDate, String returnedDate, String title, String author, String img, String description) {
        this.userEmail = userEmail;
        this.checkoutDate = checkoutDate;
        this.returnedDate = returnedDate;
        this.title = title;
        this.author = author;
        this.img = img;
        this.description = description;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "checkout_date")
    private String checkoutDate;

    @Column(name = "returned_date")
    private String returnedDate;

    private String title;
    private String author;
    private String description;
    private String img;
}
