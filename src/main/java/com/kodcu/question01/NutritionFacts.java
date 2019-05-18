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
    private  int calories ; // optional
    private  int fat ;  // optional
    private  int sodium ; // optional
    private  int carbohydrate = 0; // optional

    public NutritionFacts(int servingSize, int servings) {
        this.servingSize = servingSize;
        this.servings = servings;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    

    @Override
    public String toString() {
        return "NutritionFacts{" + "servingSize=" + servingSize + ", servings=" + servings + ", calories=" + calories + ", fat=" + fat + ", sodium=" + sodium + ", carbohydrate=" + carbohydrate + '}';
    }

 
    

    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts(10, 90);
        nutritionFacts.setCarbohydrate(100);
        nutritionFacts.setFat(10);
        
        nutritionFacts.setFat(11);
        System.out.println(nutritionFacts);
    }
    
    
}