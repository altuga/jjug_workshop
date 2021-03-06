package com.kodcu.question07;


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
 2 - Try to figure the output and try fix it - 5 mins
 3 - Instructor will show the solutions
 4 - Refactor and ask questions 
*/
import java.time.Instant;

public final class Sub extends Super {

    // Blank final, set by constructor
    private final Instant instant;

    Sub() {
        instant = Instant.now();
    }

    // Overriding method invoked by superclass constructor
    @Override
    public void overrideMe() {
        System.out.println(instant);
    }
    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.overrideMe();
    }
}