package com.example.storeapp2;

import java.util.ArrayList;
import java.util.UUID;
import java.util.stream.Collectors;

public class cart {

    //created an arrayList to store items into the cart
    ArrayList<product> listOfProducts;

    //create a new method for the array
    public cart() {
        //creating a new ArrayList by reference
        this.listOfProducts = new ArrayList<>();
    }
    //creating the add feature
    // p = product
    public void add(product p){
        //
        this.listOfProducts.add(p);
    }

    //creating the remove feature
    //removes the product using its ID
    public void remove(UUID productId){
        //
        this.listOfProducts = new ArrayList<>
                //
                (this.listOfProducts.stream().filter(
                        p -> {
                            //
                            return p.id != productId;
                            //
                        }).collect(Collectors.toList()));
    }

    //create override
    //create toString to help solve the reference to memory default
    //
    public String toString(){
        //
        String out = "";
        //for loop
        for(product p: this.listOfProducts){
            out += p.toString() + '\n';
        }
        return out;

    }

}
