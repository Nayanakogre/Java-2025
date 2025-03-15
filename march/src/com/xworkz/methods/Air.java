package com.xworkz.methods;

public class Air {
    public double temperature = 25.0;
    public double pressure = 101325.0;
    public double humidity = 60.0;
    public double density = 1.225;
    public double velocity = 5.0;
    public double viscosity = 1.81e-5;
    public double pollutantLevel = 35.0;

    public Air()
    {

    }

    @Override
    public String toString() {
        return "Air{" +
                "temperature=" + temperature +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                ", density=" + density +
                ", velocity=" + velocity +
                ", viscosity=" + viscosity +
                ", pollutantLevel=" + pollutantLevel +
                '}';
    }
}
