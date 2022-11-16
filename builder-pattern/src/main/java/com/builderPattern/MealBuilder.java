package com.builderPattern;

/*
    Create by Atiye Mousavi 
    Date: 11/5/2022
    Time: 1:02 PM
**/
public class MealBuilder {

    public Meal prepareVegMeal(){
    Meal meal=new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }
    public Meal prepareNonVegMeal(){
        Meal meal=new Meal();
        meal.addItem(new ChikenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
