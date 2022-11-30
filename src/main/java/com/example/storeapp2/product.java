package com.example.storeapp2;


import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

//extends means that you have a parent/child relations going
public class product extends Object {

    //creates a UUID for the product id
    UUID id;
    //Makes the product name private so that it cannot be tampered with
    private String productName;
    // name is stored as a variable type string
    String displayName;
    // tamper-proof price using type double for prices
    //The capital "Double" allow you to take advantage
    //of advance features of the type
    //TODO look up what are the advance features for types that are capitalized
    private Double price;
    //tamper-proof sale percent with a type double for sale prices
    private Double salePercent;
    //Boolean to toggle if product is on sale or not
    public Boolean onSale;

    //constructor made using all the
    public product(String productName, String displayName, Double price, Double salePercent, Boolean onSale) {
        //assigns a random id to product using UUID
        this.id = UUID.randomUUID();
        //
        this.setProductName(productName);
        //
        this.displayName = displayName;
        //
        this.setPrice(price);
        //
        this.setSalePercent(salePercent);
        //
        this.onSale = onSale;
    }

    //creating a getter setter method
    public String getProductName() {
        //
        return productName;
    }

    //
    public void setProductName(String productName) {
        //converts the string to all lower cases
        //TODO find out how the replacement was utilized
        this.productName = productName.toLowerCase().replace("", "");

    }

    //
    public void setPrice(Double price) {
        //
        if(price > 0) this.price = price;
            //
        else this.price = 0D;
    }

    public Double getSalePercent(){
        //
        return salePercent;
    }

    //
    public void setSalePercent(Double salePercent){
        this.salePercent = salePercent;
    }

    //Create Override
    @Override
    public String toString() {
        //
        return "Product{" +
                //
                "product_name='" + productName + '\'' +
                //
                ", display_name='" + displayName + '\'' +
                //
                ", price=" + price +
                //
                ", sale_percent=" + salePercent +
                '}';
    }

}