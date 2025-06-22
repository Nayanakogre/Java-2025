package com.xworkz.tight.coupling;

public class Heart extends HumanBody{
    HumanBody humanBody=new HumanBody();

    public void beat()
    {
        humanBody.function();
        System.out.println("heart is beating");
    }
}
