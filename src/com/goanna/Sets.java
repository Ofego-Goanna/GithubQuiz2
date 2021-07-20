package com.goanna;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void setsPlay() {


        /*
         * Write a Java program to create a HashSet and populate it with 10 String values
         * Write a Java program to iterate through all elements in the previously created hash set and print out
         * weather the strings length is Even or Odd
         * Sort your existing Hashset in alphabetical order.
         */


        // Step 1
        Set<String> ourSet = new HashSet<>();
        ourSet.add("Shazza");
        ourSet.add("Bob");
        ourSet.add("Brendon");
        ourSet.add("superman");
        ourSet.add("Batman");
        ourSet.add("Avengers");
        ourSet.add("Aaron");
        ourSet.add("Indie F");
        ourSet.add("Hema");
        ourSet.add("Huncho");

        // Step 2
        for(String names : ourSet){
            if(names.length() % 2 == 0){
                System.out.println("Even Digit found: " + names);
            }
            else{
                System.out.println("Odd Digit found: " + names);
            }
        }

        // Step 3
        Set<String> namesDuplicate = new TreeSet<>(ourSet);

       // namesDuplicate.addAll(ourSet);

    }
}
