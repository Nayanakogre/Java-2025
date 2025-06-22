package com.xworkz;

public interface Anonymous {
    public static void message()
    {
        System.out.println("Running anonymous ");
    }

    public static void main(String[] args) {
        Anonymous anonymous=new Anonymous()
        {
            public void anonymousFunc()
            {
                System.out.println("Hii there how r you!!!!");
            }
        };
    }
}
