package com.intern.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Slf4j
public class Capitalization {

    public static String capitalize (String input) {
        //TODO Add logic to capitalize String Input
        //TODO Input = "I want to lEARN JAVA"
        //TODO Output = "I Want To Learn Java"
        String[] split = input.toLowerCase().split(" ");
        String output = "";
        for(String str:split){
            String upperCase = str.substring(0, 1).toUpperCase() + str.substring(1);
            String spaceInTheEnd =str.equals(split[split.length-1])? "" : " ";
            output = output+upperCase+ spaceInTheEnd;
        }
        return output;
    }

    public static Map<String,List<String>> convertToMap (List<Book> booksInput) {
        // TODO Add logic to capitalize Author and Title Of Books to Map with Key: Author, Value: List of Title Grouped By Author
        // TODO INPUT: List<Book>
        // TODO OUTPUT: Map<String, List<String>>
        Map<String,List<String>> result = new HashMap<>();
        for(Book b:booksInput){
            String author = capitalize(b.getAuthor());
            String title = capitalize(b.getTitle());
            if(result.get(author)!=null){
                result.get(author).addAll(Collections.singletonList(title));
            }else{
                List<String> names = new ArrayList<>();
                names.add(title);
                result.put(author, names);
            }
        }
        return result;
    }
}
