package com.xworkz.crud;

public abstract class  AbstrctTv extends TVChannels  {
    public AbstrctTv() {
        super();
    }

    public abstract void save(TVChannels tvChannels);
    public abstract void update(int chanelNo,TVChannels tvChannels );
    public abstract void delete(int chanelNo,TVChannels tvChannels);
    public abstract void read();
    public abstract void searchByChannelNo(int chanelNo);
    public abstract TVChannels searchByChannelName(String ChannelName);
}
