package com.xworkz;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random =new Random();
        int randomChoice=random.nextInt(5);
        boolean choice=random.nextBoolean();
        System.out.println(choice);
        switch(randomChoice)
        {
            case 1:
                System.out.println("Random is number generated is 1");
                break;
            case 2:
                System.out.println("Random is number generated is 2");
                break;
            case 3:
                System.out.println("Random is number generated is 3");
                break;
            case 4:
                System.out.println("Random is number generated is 4");
                break;
            case 5:
                System.out.println("Random is number generated is 5");
                break;

        }


    }
}
