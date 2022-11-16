package com.builderPattern;

/*
    Create by Atiye Mousavi 
    Date: 11/5/2022
    Time: 11:59 AM
**/
public abstract class Burger implements Item  {


    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price() ;
}
