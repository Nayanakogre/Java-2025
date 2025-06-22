package com.xworkz.polymorphisim.runner;

import com.xworkz.polymorphisim.HotStar;

public class HotStarRunner {
    public static void main(String[] args) {
        HotStar hotStar=new HotStar();

        hotStar.hotStarDetails();
        hotStar.hotStarDetails("JioHotStar");
        hotStar.hotStarDetails(67.98);
        hotStar.hotStarDetails("JioHotStar","Jio");
        hotStar.hotStarDetails("JioHotStar",67.98,"Jio","nayana",800);

    }
}
