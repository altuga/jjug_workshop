package com.kodcu.question10;


/**
 * Altug Bilgin Altintas
 * email : altug@kodcu.com
 * Effective Java
 */

/*
TODO: 
 1 - Run the app.
 2 - Any abnormality ? If yes try fix it - 5 mins
 3 - Instructor will show the solutions
 4 - Refactor and ask questions 
*/
public class Money {

    public static void main(String[] args) {
        double funds = 1.00;
        int itemsBought = 0;
        for (double price = 0.10; funds >= price; price += 0.10) {
            funds -= price;
            itemsBought++;
        }
        System.out.println(itemsBought + " items bought.");
        System.out.println("Change: $" + funds);
    }
}
