package com.xworkz.methods;

public class Health {
    double temperature;
    int heartRate;
    int bloodPressure;
    double oxygenLevel;
    double bloodSugar;
    double cholesterol;
    double bmi;
    int respiratoryRate;
    double hydrationLevel;
    boolean isFever;
    boolean isDiabetic;
    String healthCondition;

    public Health(double temperature, int heartRate, int bloodPressure,
                  double oxygenLevel, double bloodSugar, double cholesterol,
                  double bmi, int respiratoryRate, double hydrationLevel,
                  boolean isFever, boolean isDiabetic, String healthCondition)
    {
        this.temperature = temperature;
        this.heartRate = heartRate;
        this.bloodPressure = bloodPressure;
        this.oxygenLevel = oxygenLevel;
        this.bloodSugar = bloodSugar;
        this.cholesterol = cholesterol;
        this.bmi = bmi;
        this.respiratoryRate = respiratoryRate;
        this.hydrationLevel = hydrationLevel;
        this.isFever = isFever;
        this.isDiabetic = isDiabetic;
        this.healthCondition = healthCondition;
    }
    public void healthDetails()
    {
        System.out.println("Temprature: " + temperature);
        System.out.println("Heart Rete: " + heartRate);
        System.out.println("Boold Pressur: " +bloodPressure);
        System.out.println("Oxygen Levl: " + oxygenLevel);
        System.out.println("Blood Suger: " + bloodSugar);
        System.out.println("Cholestrol: " + cholesterol);
        System.out.println("BMI: " + bmi);
        System.out.println("Respiratory Rete: " + respiratoryRate);
        System.out.println("Hydration Levl: " + hydrationLevel);
        System.out.println("Is Feever: " + isFever);
        System.out.println("Is Diebetic: " + isDiabetic);
        System.out.println("Helth Conditon: " + healthCondition);

    }

    @Override
    public String toString() {
        return "Health{" +
                "temperature=" + temperature +
                ", heartRate=" + heartRate +
                ", bloodPressure=" + bloodPressure +
                ", oxygenLevel=" + oxygenLevel +
                ", bloodSugar=" + bloodSugar +
                ", cholesterol=" + cholesterol +
                ", bmi=" + bmi +
                ", respiratoryRate=" + respiratoryRate +
                ", hydrationLevel=" + hydrationLevel +
                ", isFever=" + isFever +
                ", isDiabetic=" + isDiabetic +
                ", healthCondition='" + healthCondition + '\'' +
                '}';
    }
}
