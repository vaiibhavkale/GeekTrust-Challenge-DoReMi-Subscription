package com.geektrust.backend.entities;

public abstract class Subscription {
    protected Integer validityInMonths;
    protected Integer price;
    public Integer getValidityInMonths() {
        return validityInMonths;
    }
    public Integer getPrice() {
        return price;
    }
    
    public Subscription(int validityInMonths, int price, int getValidityInMonths){
        this.validityInMonths = validityInMonths;
        this.price = price;
        this.getValidityInMonths = validityInMonths;
    }
    
    public void int getValidityInMonths(){
        return validityInMonths;
    }
    
    public int setValidityInMonths(int validityInMonths){
        this.validityInMoths = validityInMonths;
    }
    
     public void int getPrice(){
        return price;
    }
    
    public int setPrice(int price){
        this.price = price;
    }
    
    public void int getValidityInMonths(){
        return getValidityInMonths;
    }

    public int setValidityInMonths(int getValidityInMonths){
        this.getValidityInMonths = getValidityInMonths;
    }
}
