package com.xworkz.association;

import com.xworkz.association.runner.SolarSystem;

import static java.lang.Object.*;

public class Sun {
private String SunName;
    private String sunName;

    public void setSunName(String sunName) {
        this.sunName=sunName;
    }

    
public String getSunName() {
        return sunName;
    }

    

    @Override
    public boolean equals(Object obj)
    {
        if(obj==null)
            return false;

        if(this==obj)
            return true;

        if(!(obj instanceof Sun))
            return false;

        Sun su=(Sun)obj;

        if(!(this.getSunName()!=null&&this.getSunName().equals(su.getSunName())))
        {
            return false;
        }
        return true;
    }
}
