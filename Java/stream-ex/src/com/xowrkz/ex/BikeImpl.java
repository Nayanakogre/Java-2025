package com.xowrkz.ex;

import java.util.ArrayList;
import java.util.LinkedList;

public class BikeImpl {
    public static void main(String[] args) {
        LinkedList<BikesDto> bikes=new LinkedList<>();
        bikes.add(new BikesDto("Hero",101));
        bikes.add((new BikesDto("Honda",201)));
        bikes.add((new BikesDto("TVS",105)));
        bikes.add((new BikesDto("Royal enfield",109)));
        bikes.add((new BikesDto("Yamah",701)));
        bikes.add((new BikesDto("KTM",301)));
        bikes.add((new BikesDto("Jawa Moto",501)));
        bikes.add((new BikesDto("Bajaj",901)));
        bikes.add((new BikesDto("TVS jupiter",601)));
        bikes.add(new BikesDto("Hero",101));
        System.out.println(bikes.getLast());
        bikes.removeFirstOccurrence("Hero");
        System.out.println(bikes);



    }
}
