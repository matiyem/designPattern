package com.builderPattern;

import java.util.ArrayList;
import java.util.List;

/*
    Create by Atiye Mousavi 
    Date: 11/5/2022
    Time: 12:50 PM
**/
public class Meal {
    private List<Item> items=new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }
    public float getCost(){
        float cost=0.0f;
        for (Item item :items){
            cost +=item.price();
        }
        return cost;
    }
    public void showItems(){
        for (Item item:items){
            System.out.print("Item : "+item.name());
            System.out.print(", packing : " + item.packing().pack());
            System.out.print (", Price : " +item.price());
        }
    }
}
