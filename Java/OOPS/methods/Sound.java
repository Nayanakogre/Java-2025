package com.xworkz.methods;

public class Sound {
    public double volume;
    public double frequency;
    public double speed;
    public double wavelength;
    public double duration;
    public String type;
    public String source;
    public double pitch;
    public double intensity;
    public boolean isEcho;


        public void setSoundProperties(double volume, double frequency, double speed,
                                       double wavelength, double duration, String type,
                                       String source, double pitch, double intensity,
                                       boolean isEcho) {
        this.volume = volume;
        this.frequency = frequency;
        this.speed = speed;
        this.wavelength = wavelength;
        this.duration = duration;
        this.type = type;
        this.source = source;
        this.pitch = pitch;
        this.intensity = intensity;
        this.isEcho = isEcho;
    }
}
