package com.intern.demo;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class CapitalizationTest {

    public static List<Book> dataSet(){
        ImportedBook importedBook1 = new ImportedBook("joHN dOE", "IMPORTED book 1", "joHN dOE");
        ImportedBook importedBook2 = new ImportedBook("joHN dOE", "IMPORTED book 2", "joHN dOE");
        ImportedBook importedBook3 = new ImportedBook("joHN dOE", "IMPORTED book 3", "joHN dOE");
        ImportedBook importedBook4 = new ImportedBook("joHN dOE", "IMPORTED book 4", "joHN dOE");

        LocalBook localBook1 = new LocalBook("jaNE stARk", "loCal bOok 1", "gramEDia");
        LocalBook localBook2 = new LocalBook("jaNE stARk", "loCal bOok 2", "gramEDia");
        LocalBook localBook3 = new LocalBook("jaNE stARk", "loCal bOok 3", "gramEDia");
        LocalBook localBook4 = new LocalBook("jaNE stARk", "loCal bOok 4", "gramEDia");

        // TODO CREATE A NEW LIST OBJECT CALLED "inputs" THAT CONSIST OF ALL BOOKS STATED ABOVE
        List<Book> books = Arrays.asList(localBook1,localBook2,localBook3,localBook4,importedBook1,importedBook2,importedBook3, importedBook4);
        return books;
    }
    @Test
    public void convertToMapTest() {
        //TODO COMPLETE THIS
        String expected = "{Jane Stark=[Local Book 1, Local Book 2, Local Book 3, Local Book 4], John Doe=[Imported Book 1, Imported Book 2, Imported Book 3, Imported Book 4]}";
        String result = Capitalization.convertToMap(dataSet()).toString();
        assertEquals(result,expected);
    }
    @Test
    public void capitalizationTest() {
        //TODO COMPLETE THIS
        String expected = "I want to lEARN JAVA";
        String result = "I Want To Learn Java";
        assertEquals(Capitalization.capitalize(expected),result);
    }
}
