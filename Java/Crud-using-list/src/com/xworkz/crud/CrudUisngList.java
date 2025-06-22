package com.xworkz.crud;

import java.util.ArrayList;
import java.util.List;

public class CrudUisngList {
    public static void main(String[] args) {
        List<String> beverages=new ArrayList<String>();

            //adding element to the the arraylist
        beverages.add("Coffe");
        beverages.add("Tea");
        beverages.add("Cola");
        beverages.add("Black coffe");
        beverages.add("Soda");
        beverages.add("Cold drink");
        beverages.add("Green tea");
        beverages.add("fresh juice");
        beverages.add("Mock tail");
        System.out.println(beverages);



        for(int i=0;i<beverages.size();i++)
        {
            //beverages.remove(1);
            System.out.println("i :"+i +" "+beverages.remove(1));
        }
        beverages.add(0,"green tea");
        System.out.println(beverages);



    }
}
