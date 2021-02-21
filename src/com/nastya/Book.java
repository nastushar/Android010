package com.nastya;

import java.util.*;

public class Book {

    private Map<String, List<String>> phonebook = new HashMap<> ();

    public void add(String name, String number){
       phonebook.computeIfPresent(name, (kay, value) -> {
            value.add(number);
            return value;
        });
       phonebook.putIfAbsent(name, new ArrayList<> (Arrays.asList(number)));


    }

    public List<String> get(String name){
        return phonebook.getOrDefault(name, Arrays.asList ());
    }
    public void info() {
        System.out.println (phonebook);
    }
}