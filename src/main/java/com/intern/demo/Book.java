package com.intern.demo;

import lombok.*;

@Data
public class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }
}
