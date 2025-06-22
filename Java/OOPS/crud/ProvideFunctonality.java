package com.xworkz.crud;

import java.util.Objects;

public class ProvideFunctonality extends AbstrctTv {
    public static TVChannels[] listOfChannel;
    int index = 0;

    @Override
    public void save(TVChannels tvChannels) {
        //System.out.println("Running on implemeted method");
        //here tvchannel is instance
        if ((this.listOfChannel != null) && (tvChannels != null)) {
            if (this.index < this.listOfChannel.length) {
                listOfChannel[index] = tvChannels;
                index++;
                System.out.println("Items added successfully");
            } else {
                System.out.println("array is full");
            }
        } else {
            System.out.println("Give item properly");
        }

    }

    @Override
    public void update(int c, TVChannels tvChannels) {
        System.out.println("Running on implemeted method");

    }

    @Override
    public void delete(int id, TVChannels tvChannels) {
        System.out.println("Running on implemeted method");

    }

    @Override
    public void read() {
        System.out.println("Running on Read method");
        for (TVChannels listOfChannel1 : listOfChannel) {
            System.out.println(listOfChannel1);
        }

    }

    @Override
    public void searchByChannelNo(int chanelNo) {
        for (TVChannels listOfChannel1 : listOfChannel) {

            if (listOfChannel1 != null && listOfChannel1.getChanelNo() == chanelNo) {
                System.out.println("Chanel found :" + listOfChannel1);
                break;
            } else {
                System.out.println("no channels found");
                break;
            }

        }


    }


    @Override
    public TVChannels searchByChannelName(String channelName) {
        if (channelName == null) {
            return null;
        }
        for (TVChannels tvChannel : this.listOfChannel) {
            if (tvChannel != null && tvChannel.getChannelName() != null &&
                    tvChannel.getChannelName().equals(channelName)) {
                System.out.println("Channel found: " + tvChannel);
                return tvChannel; //
            }
        }
        System.out.println("No channel found with name: " + channelName);
        return null;
    }



}

