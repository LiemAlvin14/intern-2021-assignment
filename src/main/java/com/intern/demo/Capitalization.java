package com.intern.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class Capitalization {

    public static String capitalize (String input) {
        //TODO Add logic to capitalize String Input
        //TODO Input = "I want to lEARN JAVA"
        //TODO Output = "I Want To Learn Java"
        String[] split = input.split(" ");
        String output = "";
        for(String str:split){
            String upperCase = str.substring(0, 1).toUpperCase() + str.substring(1);
            String spaceInTheEnd =str.equals(split[split.length-1])? "" : " ";
            output = output+upperCase+ spaceInTheEnd;
        }
        return output;
    }

    public static Object convertToMap (Object object) {
        // TODO Add logic to capitalize Author and Title Of Books to Map with Key: Author, Value: List of Title Grouped By Author
        // TODO INPUT: List<Book>
        // TODO OUTPUT: Map<String, List<String>>
        return null;
    }
}
