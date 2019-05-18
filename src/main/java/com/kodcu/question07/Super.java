package com.kodcu.question07;


/**
 * Altug Bilgin Altintas
 * email : altug@kodcu.com
 * Twitter : @altugaltintas
 * Effective Java
 */

public class Super {
    // Broken - constructor invokes an overridable method
    public Super() {
        overrideMe();
    }
    public void overrideMe() {
    }
}