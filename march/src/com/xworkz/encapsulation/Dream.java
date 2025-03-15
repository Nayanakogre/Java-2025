package com.xworkz.encapsulation;

public class Dream {
    private String dreamJob;
    private String dreamFood;
    private String dreamTrip;
    private String dreamHobby;
    private String dreamCar;
    private String dreamPlace;
    private String dreamAdeventure;
    private String dreamDishTocook;
    private String dreamHouse;
    private String DreamSkill;

    @Override
    public String toString() {
        return "Dream{" +
                "dreamJob='" + dreamJob + '\'' +
                ", dreamFood='" + dreamFood + '\'' +
                ", dreamTrip='" + dreamTrip + '\'' +
                ", dreamHobby='" + dreamHobby + '\'' +
                ", dreamCar='" + dreamCar + '\'' +
                ", dreamPlace='" + dreamPlace + '\'' +
                ", dreamAdeventure='" + dreamAdeventure + '\'' +
                ", dreamDishTocook='" + dreamDishTocook + '\'' +
                ", dreamHouse='" + dreamHouse + '\'' +
                ", DreamSkill='" + DreamSkill + '\'' +
                '}';
    }
    public Dream()
    {
        System.out.println("Running in no arg constructer");
    }

    public Dream(String dreamJob, String dreamFood, String dreamTrip,
                 String dreamHobby, String dreamCar, String dreamPlace,
                 String dreamAdeventure, String dreamDishTocook, String dreamHouse,
                 String dreamSkill) {
        this.dreamJob = dreamJob;
        this.dreamFood = dreamFood;
        this.dreamTrip = dreamTrip;
        this.dreamHobby = dreamHobby;
        this.dreamCar = dreamCar;
        this.dreamPlace = dreamPlace;
        this.dreamAdeventure = dreamAdeventure;
        this.dreamDishTocook = dreamDishTocook;
        this.dreamHouse = dreamHouse;
        DreamSkill = dreamSkill;
    }

    public void setDreamJob(String dreamJob)
    {
        this.dreamJob = dreamJob;
    }

    public String getDreamJob()
    {
        return dreamJob;
    }

    public void setDreamTrip(String dreamTrip)
    {
        this.dreamTrip = dreamTrip;
    }

    public String getDreamTrip() {
        return dreamTrip;
    }

    public void setDreamFood(String dreamFood)
    {
        this.dreamFood = dreamFood;
    }

    public String getDreamFood()
    {
        return dreamFood;
    }

    public void setDreamHobby(String dreamHobby)
    {
        this.dreamHobby = dreamHobby;
    }

    public String getDreamHobby()
    {
        return dreamHobby;
    }

    public void setDreamCar(String dreamCar)
    {
        this.dreamCar = dreamCar;
    }

    public String getDreamCar()
    {
        return dreamCar;
    }



    public void setDreamPlace(String dreamPlace)
    {
        this.dreamPlace = dreamPlace;
    }

    public String getDreamPlace() {
        return dreamPlace;
    }

    public void setDreamAdeventure(String dreamAdeventure)
    {
        this.dreamAdeventure = dreamAdeventure;
    }

    public String getDreamAdeventure()
    {
        return dreamAdeventure;
    }

    public void setDreamDishTocook(String dreamDishTocook)
    {
        this.dreamDishTocook = dreamDishTocook;
    }

    public String getDreamDishTocook()
    {
        return dreamDishTocook;
    }

    public void setDreamHouse(String dreamHouse)
    {
        this.dreamHouse = dreamHouse;
    }

    public String getDreamHouse()
    {
        return dreamHouse;
    }

    public void setDreamSkill(String dreamSkill)
    {
        DreamSkill = dreamSkill;
    }

    public String getDreamSkill()
    {
        return DreamSkill;
    }
}
