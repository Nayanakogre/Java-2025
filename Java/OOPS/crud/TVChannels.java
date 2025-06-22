package com.xworkz.crud;

import java.util.Objects;

public  class TVChannels {
    private int chanelNo;
    private String review;
    private int ratingInStars;
    private String ChannelName;

    public int getChanelNo() {
        return chanelNo;
    }

    @Override
    public String toString() {
        return "TVChannels{" +
                "chanelNo=" + chanelNo +
                ", review='" + review + '\'' +
                ", ratingInStars=" + ratingInStars +
                ", ChannelName='" + ChannelName + '\'' +
                '}';
    }

    public String getChannelName() {
        return ChannelName;
    }

    public void setChannelName(String channelName) {
        ChannelName = channelName;
    }

    public void setChanelNo(int chanelNo) {
        this.chanelNo = chanelNo;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public int getRatingInStars() {
        return ratingInStars;
    }

    public void setRatingInStars(int ratingInStars) {
        this.ratingInStars = ratingInStars;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof TVChannels)) return false;
        TVChannels that = (TVChannels) o;
        return chanelNo == that.chanelNo && ratingInStars == that.ratingInStars && Objects.equals(review, that.review) && Objects.equals(ChannelName, that.ChannelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chanelNo, review, ratingInStars, ChannelName);
    }

    public TVChannels() {
        //System.out.println("Running in no arg constructer");
    }
}
