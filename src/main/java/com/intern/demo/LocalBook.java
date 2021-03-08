package com.intern.demo;


import lombok.*;
@Data
public class LocalBook extends Book{
    private String store;

    public LocalBook(String author, String title, String store) {
        super(author, title);
        this.store = store;
    }
}
