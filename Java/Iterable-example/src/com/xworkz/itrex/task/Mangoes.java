//For the below classes, use Iterator methods to print the values :
//        1. Swimmers
//2. Airport
//3. Sim card providers
//4. Seasons
//5. Mangoes
package com.xworkz.itrex.task;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Mangoes {
    public static void main(String[] args) {
        Collection<String> mangoVariety = new LinkedList<String>();
        mangoVariety.add("Alphino");
        mangoVariety.add("Rasapuri");
        mangoVariety.add("Mallika");
        mangoVariety.add("Malgova");
        mangoVariety.add("Keasr");
        mangoVariety.add("Neelam");
        mangoVariety.add("chausa");
        Iterator<String> iterator=mangoVariety.iterator();
        while (iterator.hasNext())
        {
            String mango=iterator.next();
            System.out.println(mango);
        }

    }
}
