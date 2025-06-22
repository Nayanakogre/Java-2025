package com.xworkz.inheritence.single;

public class MicrosoftEdge extends Browser{
    public MicrosoftEdge()
    {
        super.browserName="Microsoft Edge";
        super.relesedBy="Microsoft";
        super.relesedYear=2000;
        super.version="9.2.0";
        super.developer="Microsoft Developer Team";
        super.browserDetails();
        System.out.println("Running in MicroSOft class");
    }
}
