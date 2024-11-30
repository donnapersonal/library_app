package com.learnspringboot.react_springboot_library.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "messages")
public class Message {
    public Message() {}

    public Message(String title, String question) {
        this.title = title;
        this.question = question;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_email")
    private String userEmail;

    private String title;
    private String question;

    @Column(name = "admin_email")
    private String adminEmail;

    private String response;
    private boolean closed;
}
