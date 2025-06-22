package com.xworkz.interfaceex2;

public interface Project {

    String projectName="Potato leaf dieasease  classfication";
    int teamSize=4;
    int durationInMonth=4;
    String Mentor="abgvcfd";

    public void projectDetails();
    public void requirement();
    public void duration();
    public void teamsizedetils();
    public void teamMemmbersDetails();
    public void teamDeatils();
    public void softwareDetails();
    public void frontEndDetails();
    public void backendDetails();
    public void apiDetails();

    public static void hardwareDettails()
    {
        System.out.println("Running in Project");
    }
    public static void guideDetails()
    {
        System.out.println("Running in Project");
    }
    public static void mentorDetails()
    {
        System.out.println("Running in Project");
    }
    public static void collegeDetails()
    {
        System.out.println("Running in Project");
    }
    public static void departmentDetails()
    {
        System.out.println("Running in Project");
    }
    default void titileInfo()
    {
        System.out.println("Running in Project");
    }
    default void synoposisInfo()
    {
        System.out.println("Running in Project");
    }
    default void synopisreport()
    {
        System.out.println("Running in Project");
    }
    default void plase1Report()
    {
        System.out.println("Running in Project");
    }
    default void phase2Info()
    {
        System.out.println("Running in Project");
    }
    default void finalReport()
    {
        System.out.println("Running in Project");
    }


}
