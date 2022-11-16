package com.builderPattern;

/*
    Create by Atiye Mousavi 
    Date: 11/5/2022
    Time: 12:02 PM
**/
public abstract class ColdDrink implements Item {
    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}
