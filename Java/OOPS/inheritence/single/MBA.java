package com.xworkz.inheritence.single;

public class MBA extends OnlineCourse {
    public MBA()
    {

        super.courseProvider="Jain University";
        super.courseName="MBA in Finance";
        super.durationInYear=2;
        super.timing="Day";
        super.priceInK=200;
        super.onlineCourseDetails();
        System.out.println("Running in MBA class");
    }

}
