package org.launchcode.java.studio_Chap_3_Counting_Characters;

import java.util.*;


public class CountingCharacters {

    public static void main(String[] args) {

   /*quote string*/
    String quote = "If the product of two terms is zero then common sense says at least " +
            "one of the two terms has to be zero to start with. So if you move all " +
            "the terms over to one side, you can put the quadratics into a form " +
            "that can be factored allowing that side of the equation to equal zero. " +
            "Once you’ve done that, it’s pretty straightforward from there.";

    /*changed string to a letter array*/
    char[] charactersInString = quote.toLowerCase(Locale.ROOT).toCharArray();


    /*intialize the hashmap to store letter and numbers as a key/value pair*/
    HashMap<Character, Integer> characterMap = new HashMap<>();

    /* looping through the letter array*/
    for (char character : charactersInString) {
        if (characterMap.containsKey(character)) {
            int intCount = characterMap.get(character);
            intCount++;
            characterMap.put(character, intCount);
        }
        /* if the letter is not yet in the hashmap, make a new key, and set the associated value to one*/
        else {
            characterMap.put(character, 1);
        }
    }
    /* print each key and its value*/
        for (Map.Entry<Character, Integer> character : characterMap.entrySet()) {
    System.out.println(character.getKey() + ": " + character.getValue());
        }

    }

}
