package com.xworkz.inheritence.single;

public class OnlineCourse {

    protected String courseProvider;
    protected String courseName;
    protected int durationInYear;
    protected String timing;
    protected double priceInK;
    public OnlineCourse()
    {
        System.out.println("Running in OnlineCourse");
    }

    public void onlineCourseDetails()
    {


        System.out.println(courseProvider);
        System.out.println(courseName);
        System.out.println(durationInYear);
        System.out.println(timing);
        System.out.println(priceInK);
    }

}
