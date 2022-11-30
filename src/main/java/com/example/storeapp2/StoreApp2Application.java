package com.example.storeapp2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApp2Application {

    public static void main(String[] args) {
        SpringApplication.run(StoreApp2Application.class, args);
    }

    //declare a variable called p1 which act as a reference to an object of type Product
    //link the new Product and link the new product to the reference p1
    //make changes using methods to the data stored in Product
    product p1 = new product("ShirtBlue", "A Blue Shirt", 10D, 0.0D, false);

    //declare a variable called p1 which act as a reference to an object of type Product
    //link the new Product and link the new product to the reference p1
    //make changes using methods to the data stored in Product
    product p2 = new product("ShirtBlue", "A Blue Shirt", 10D, 0.0D, false);

    //print out data contain in p1
        System.out.println(p1);

    //declare a variable called cart which act as a reference to an object of type cart
    //link the new cart and link the new cart to the reference cart

    cart cart = new cart();

    //add p1 to cart
        cart.add(p1);

    //add p2 to cart
        cart.add(p2);

    //print out string
        System.out.println("Before");

    //print out what is inside of cart
        System.out.println(cart);

    //print out what is inside of cart
        System.out.println("After");

    // removed p1 using its id from cart
        cart.remove(p1.id);

    // print out latest changes to cart
        System.out.println(cart);
}

}
