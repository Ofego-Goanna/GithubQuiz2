package com.goanna;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps {

    public static void mapsPlay() {

        //MAPS:
        //(PLEASE WRITE YOUR CODE INSIDE THE MAPS CLASS)
        //* Write a Java program to create a HashMap and populate it with 10 Integer Keys and 10 String values
        //* Loop through your Map, if the Key is a multiple of 2, print out the value to the console.
        //* Print out Every String value from the previous Map that contains the character ‘g’ g at the end of the string.



        // step 1
        Map<Integer, String> raceCars = new HashMap<>();

        raceCars.put(1, "Volkswagen beattle");
        raceCars.put(2, "Batmobile");
        raceCars.put(5, "Lambo");
        raceCars.put(3, "Au Falcon");
        raceCars.put(6, "Holden Commodor turbo vl");
        raceCars.put(7, "Chevy Impala");
        raceCars.put(8, "Skyline");
        raceCars.put(10, "RX-7 Mazda");
        raceCars.put(11, "Car ending with g");
        raceCars.put(12, "Mustang");

        // Step 2
        for(Integer key : raceCars.keySet()){
            if( key % 2 == 0 ){
                System.out.println("This key value is a multiple of 2: " + raceCars.get(key));
            }
        }

        // Step 3
        for(String values : raceCars.values()){
            if(values.charAt(values.length()-1) == 'g'){
                System.out.println("Values ending with a g: " + values);
            }
        }


    }
}