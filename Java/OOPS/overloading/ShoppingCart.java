//Task 18-02-2025
//2. You are tasked with building an Online Shopping System that allows users to manage their shopping cart. The system needs to support adding items to the cart in different ways. You will implement method overloading to handle these scenarios, such as adding a single item, adding multiple items, adding an item with a specific quantity, or adding an item with a discount.
//
//Requirements:
//Create a class named ShoppingCart.
//
//Implement an overloaded method addItemToCart that allows:
//
//Adding a single product to the cart.
//Adding multiple products to the cart at once.
//Adding a product with a specific quantity (e.g., if a user wants to buy more than one of the same item).
//Adding a product with a discount applied.
//The system should print an appropriate message indicating the items that have been added to the cart, including the quantity or discount if applicable.
//
//For each method call:
//
//When adding a single product, display: "Product X has been added to the cart."
//When adding multiple products, display: "Product X, Product Y, ... have been added to the cart."
//When adding an item with quantity, display: "Quantity Z x Product X has been added to the cart."
//When adding an item with a discount, display: "Product X has been added to the cart with Y% discount."


package com.xworkz.overloading;

public class ShoppingCart {
    public static void addItemToCart(String item)
    {
        System.out.println(item  +" "+" has been added to the cart ");
    }
    public static void addItemToCart(String[] items)
    {
        for(String item:items) {
            System.out.println(item +" ");
        }
        System.out.println("has succefully added to the cart");
    }
    public static void addItemToCart(int quantity,String item)
    {
        System.out.println("Quantity "+quantity +" on product "+item +" has been added to the cart");
    }
    public static void addItemToCart(String item,String discount)
    {
        System.out.println("Discount "+discount +"  on the product " +item +" has been added");
    }

}
