package com.driver;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private Boolean isCheeseAdded;
    private Boolean isToppingAdded;
    private Boolean isPaperBagAdded;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        isCheeseAdded=false;
        isToppingAdded=false;
        isPaperBagAdded=false;
        this.bill="";
        // your code goes here
        if(isVeg==true){
            this.price = 300;
        }
        else{
            this.price=400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded==false){
            isCheeseAdded=true;
            price += 80;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingAdded==false){
            isToppingAdded=true;
            if(isVeg==true){
                price += 70;
            }
            else{
                price += 120;
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isPaperBagAdded==false){
            this.isPaperBagAdded=true;
            price += 20;
        }
    }

    public String getBill(){
        // your code goes here
        StringBuilder sb=new StringBuilder();
        sb.append("Base Price Of The Pizza: ").append(isVeg ? 300 : 400).append("\n");
        if(isCheeseAdded==true){
            sb.append("Extra Cheese Added: 80").append("\n");
        }
        if(isToppingAdded==true){
            sb.append("Extra Toppings Added: ").append(isVeg ?70 : 120).append("\n");
        }
        if(isPaperBagAdded==true){
            sb.append("Paperbag Added: 20").append("\n");
        }
        sb.append("Total Price: ").append(this.price).append("\n");
        bill=sb.toString();
        return bill;
    }
}
