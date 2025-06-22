package com.xworkz.crud;

import java.util.Scanner;

public class TvChannelsRunner extends ProvideFunctonality {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number to save info :");
        int number=scanner.nextInt();
        listOfChannel=new TVChannels[number];
        ProvideFunctonality provideFunctonality=new ProvideFunctonality();
        TVChannels tvChannels=new TVChannels();
        TVChannels tvChannels1=new TVChannels();
        TVChannels tvChannels2=new TVChannels();

        System.out.println("Enter Channel name :");
        tvChannels.setChannelName(scanner.next());
        System.out.println("Enter channel number :");
        tvChannels.setChanelNo(scanner.nextInt());
        //scanner.nextLine();
        System.out.println("Enter The Review");
        tvChannels.setReview(scanner.next());
        System.out.println("Enter the Rating out of 5 stars");
        tvChannels.setRatingInStars(scanner.nextInt());
        //scanner.nextLine();

        System.out.println("Enter Channel name :");
        tvChannels1.setChannelName(scanner.next());
        System.out.println("Enter channel number :");
        tvChannels1.setChanelNo(scanner.nextInt());
        //scanner.nextLine();
        System.out.println("Enter The Review");
        tvChannels1.setReview(scanner.next());
        System.out.println("Enter the Rating out of 5 stars");
        tvChannels1.setRatingInStars(scanner.nextInt());
        //scanner.nextLine();

        System.out.println("Enter Channel name :");
        tvChannels2.setChannelName(scanner.next());
        System.out.println("Enter channel number :");
        tvChannels2.setChanelNo(scanner.nextInt());
        //scanner.nextLine();
        System.out.println("Enter The Review");
        tvChannels2.setReview(scanner.next());
        System.out.println("Enter the Rating out of 5 stars");
        tvChannels2.setRatingInStars(scanner.nextInt());
        //scanner.nextLine();



//

        provideFunctonality.save(tvChannels);
        provideFunctonality.save(tvChannels2);
        provideFunctonality.save(tvChannels1);
        provideFunctonality.save(tvChannels);
        provideFunctonality.save(tvChannels);
        provideFunctonality.save(tvChannels);
        System.out.println("Enter the searching channel Number :");
        provideFunctonality.searchByChannelNo(scanner.nextInt());
        System.out.println("Enter the searching channale Name :");
        provideFunctonality.searchByChannelName(scanner.next());
//        provideFunctonality.delete(1,tvChannels);
      //provideFunctonality.read();
//
//
    }
}
