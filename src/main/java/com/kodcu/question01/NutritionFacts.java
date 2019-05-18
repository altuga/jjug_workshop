package com.kodcu.question01;

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
 1 - Initialize (create) the class according to the fields below - 5 minutes
 2 - Instructor will show the solutions
 3 - Refactor and ask questions
*/
public class NutritionFacts {
    private final int servingSize ; // must
    private final int servings   ; // must
    private final int calories ; // optional
    private final int fat ;  // optional
    private final int sodium ; // optional
    private final int carbohydrate = 0; // optional

    public NutritionFacts(int servingSize, int servings) {
       this(servingSize, servings, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories) {
        this(servingSize, servings, calories, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat) {
       this(servingSize, servings, calories, fat, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
    }

    @Override
    public String toString() {
        return "NutritionFacts{" + "servingSize=" + servingSize + ", servings=" + servings + ", calories=" + calories + ", fat=" + fat + ", sodium=" + sodium + ", carbohydrate=" + carbohydrate + '}';
    }

 
    

    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts(10, 90, 80, 90);
        System.out.println(nutritionFacts);
    }
    
    
}