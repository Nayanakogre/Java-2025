package com.xworkz.itrex;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Movies {
    public static void main(String[] args) {
        List<String> moviesName=new LinkedList<>();
        moviesName.add("Gaali Pata");
        moviesName.add("Milana");
        moviesName.add("Chichore");
        moviesName.add("Ugram");
        moviesName.add("Hondisi bareyari");
        moviesName.add("KGF");
        moviesName.add("3 Idiots");
        moviesName.add("Yaare koogadali");
        moviesName.add("Lucky baskar");
        moviesName.add("Ustad hotel");
        Iterator<String> iterator=moviesName.iterator();
        while (iterator.hasNext())
        {
            String movie=iterator.next();
            System.out.println(movie);
        }
    }
}
