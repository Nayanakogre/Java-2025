package com.xworkz.inheritence.single;

public class Browser {
    protected String browserName;
    protected String relesedBy;
    protected int relesedYear;
    protected String version;
    protected String developer;

    public Browser()
    {
        System.out.println("Running in Browser class");
    }
    public void browserDetails()
    {
        System.out.println(browserName);
        System.out.println(relesedBy);
        System.out.println(relesedYear);
        System.out.println(version);
        System.out.println(developer);
    }
}
