package com.xworkz.association;

public class Moon {
    public String moonName;

    public String getMoonName() {
        return moonName;
    }

    public void setMoonName(String moonName) {
        this.moonName = moonName;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj==null)
        {
            return false;
        }
        if(this==obj)
        {
            return true;
        }
        if(!(obj instanceof Moon))
            return false;

        Moon m=(Moon)obj;

        if(!(this.getMoonName()!=null && this.getMoonName().equals(m.getMoonName())))
        {
            return false;
        }
        return true;
    }
}
