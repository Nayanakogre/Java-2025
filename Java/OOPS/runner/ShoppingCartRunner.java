package com.xworkz.runner;

import com.xworkz.overloading.ShoppingCart;

public class ShoppingCartRunner {
    public static void main(String[] args) {
        ShoppingCart.addItemToCart("Apple");
        System.out.println("--------------------------------------------");
        ShoppingCart.addItemToCart(new String[]{"Rice","Grains","Coffe powder","Millets","Sambar powder"});
        System.out.println("--------------------------------------------");
        ShoppingCart.addItemToCart(1,"Butter");
        System.out.println("--------------------------------------------");
        ShoppingCart.addItemToCart("Milk","5%");
    }
}
