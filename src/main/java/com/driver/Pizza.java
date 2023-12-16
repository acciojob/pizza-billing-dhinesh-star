package com.driver;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private List<String> billList=new ArrayList<>();
    private Boolean isCheeseAdded;
    private Boolean isToppingAdded;
    private Boolean isPaperBagAdded;
    /*toppingAddedIdx is to keep track of the topping added
    index extra cheese above it*/
    private Integer toppingAddedIdx=-1;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        isCheeseAdded=false;
        isToppingAdded=false;
        isPaperBagAdded=false;
        this.bill="";
        // your code goes here
        if(isVeg==true){
            this.price = 300;
            billList.add("Base Price Of The Pizza: 300");
        }
        else{
            this.price=400;
            billList.add("Base Price Of The Pizza: 400");
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
            if(toppingAddedIdx==-1) {
                billList.add("Extra Cheese Added: 80");
            }
            else{
                billList.add(toppingAddedIdx,"Extra Cheese Added: 80");
            }
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingAdded==false){
            isToppingAdded=true;
            toppingAddedIdx=billList.size();
            if(isVeg==true){
                price += 70;
                billList.add("Extra Toppings Added: 70");
            }
            else{
                price += 120;
                billList.add("Extra Toppings Added: 120");
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isPaperBagAdded==false){
            this.isPaperBagAdded=true;
            price += 20;
            billList.add("Paperbag Added: 20");
        }
    }

    public String getBill(){
        // your code goes here
        for(String Bill:billList){
            bill += Bill+"\n";
        }
        bill +="Total Price: "+getPrice();
        return this.bill.trim();
    }
}
