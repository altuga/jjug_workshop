package com.kodcu.question12;


import java.util.*;


/**
 * Altug Bilgin Altintas
 * 
 * Effective Java Workshop
 * 
 * Email : altug@kodcu.com
 * Twitter : @altugaltintas
 */

/*
TODO: 
 1 - Run the app.
 2 - Any abnormality ? If yes try fix it - 5 mins
 3 - Instructor will show the solutions
 4 - Refactor and ask questions 
*/
public class Symptom {

    static Collection<Card.Suit> suits = Arrays.asList(Card.Suit.values());
    static Collection<Card.Rank> ranks = Arrays.asList(Card.Rank.values());
    static List<Card> deck = new ArrayList<>();

    public static void main(String[] args) {


        for(Card.Suit suit : suits) {
             for(Card.Rank rank : ranks) {
                 System.out.println(" ...");
             }
        }

        
    }
}
