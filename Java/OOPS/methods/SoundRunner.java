package com.xworkz.methods;

public class SoundRunner {
    public static void main(String[] args) {
        Sound sound=new Sound();
        sound.setSoundProperties(75.0, 440.0, 343.0,
                0.78, 3.5, "Music", "Guitar",
                7.5, 0.002, false);
        System.out.println(sound.volume);
        System.out.println(sound.frequency);
        System.out.println(sound.speed);
        System.out.println(sound.wavelength);
        System.out.println(sound.duration);
        System.out.println(sound.type);
        System.out.println(sound.source);
        System.out.println(sound.pitch);
        System.out.println(sound.intensity);
        System.out.println(sound.isEcho);

    }
}
