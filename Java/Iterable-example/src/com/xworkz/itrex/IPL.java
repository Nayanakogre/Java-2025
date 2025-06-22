package com.xworkz.itrex;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IPL {
    public static void main(String[] args) {
        List<String> teams=new LinkedList<>();
        teams.add("RCB");
        teams.add("DC");
        teams.add("MI");
        teams.add("CSK");
        teams.add("KKR");
        teams.add("PBKS");
        teams.add("GT");
        teams.add("LSG");
        teams.add("RR");
        teams.add("SRH");
        Iterator<String> iterator=teams.iterator();
        while (iterator.hasNext())
        {
            String teamNames=iterator.next();
            System.out.println(teamNames);
        }
    }
}
