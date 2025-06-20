package com.xworkz.runner;

import com.xworkz.task.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductRunner {
    public static void main(String[] args) {
        List<Product> products=new ArrayList<>();
        products.add(new Product("Mobile",20000,101));
        products.add(new Product("tv",10000,102));
        products.add(new Product("laptop",40000,103));
        products.add(new Product("refrigerator",35000,104));
        products.add(new Product("washing machine",15000,105));

        List<Product> sortedPrice=products.stream().sorted(Comparator.comparingDouble(Product::getPrice)).collect(Collectors.toList());
        System.out.println(sortedPrice);
        Comparable<String>

    }
}
