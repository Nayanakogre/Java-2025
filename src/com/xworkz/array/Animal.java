package com.xworkz.array;

public  class Animal {

    static String[] animalNames = {"Elephats", "Bevers", "Tiger", "Dog", "Cat", "Cow", "Buffulo", "Cow"};

    public static void animalCount() {

        System.out.println("Count of Animal :" + animalNames.length);

    }

    public static void animalSearch() {
        for (int index = 0; index < animalNames.length; index++) {
            if (animalNames[index] == "Tiger") {
                System.out.println("Yess serching animal is present");
            }
        }
    }

    public static void occurence() {
        int count = 0;
        for (int index = 0; index < animalNames.length; index++)
        {
            if (animalNames[index] == "Cow") {
                count++;
            }
        }
        System.out.println("Total Occurence is :"+count);
    }
}
