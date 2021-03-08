package com.intern.demo;

import lombok.*;

@Data
public class ImportedBook extends Book{
    private String translator;

    public ImportedBook(String author, String title, String translator) {
        super(author, title);
        this.translator = translator;
    }
}
