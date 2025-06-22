package com.xworkz.overloading;

public class Shop {
    public String itemName;
    public double totalPrice;
    String brandName;
    int[] prices;
    String couponCode;
    double price;
    int[] price1;
    int[] price2;
    int[] price3;

//    public Shop()
//    {
//
//    }

    public  void bill(String itemName,double totalPrice)
    {
        double gst=this.totalPrice+(totalPrice*18)/100;
        System.out.println("GST Ammount : "+gst);
        this.totalPrice=this.totalPrice+gst;
        System.out.println("Total Price :"+this.totalPrice);
    }
    public void bill(String brandName,String itemName,double totalPrice)
    {
        if(this.brandName=="Frill" || this.brandName=="Thrill")
        {
            this.totalPrice=this.totalPrice-(this.totalPrice*0.25);
            System.out.println("Discount of 50% "+this.totalPrice);
        }
    }
    public void bill(int[] prices)
    {
        int max=Integer.MAX_VALUE;
        for(int i=0;i<this.prices.length;i++)
        {
            this.prices[i]=this.prices[i]+(this.prices[i]*18)/100;
            if(this.prices[i]>max)
            {
                max=this.prices[i];
                System.out.println("Maximium Value :"+max);
            }
        }
    }
    public void bill(String couponCode,double price,String itemName)
    {
        if(this.couponCode=="2024Ut)")
        {
            this.price=this.price-(this.price*0.25);
            System.out.println(this.price);

        }
        if(this.couponCode=="202345hgd" && this.itemName=="T-Shirt")
        {
            this.price=this.price-(this.price*0.33);
            System.out.println(this.price);
        }
        else {
            this.price=this.price-(this.price*0.10);
            System.out.println(this.price);
        }
    }
    public void bill(int[] price1,int[] price2,int[] price3)
    {
        for (int i=0;i<this.price1.length;i++)
        {
            for(int j=0;j<this.price2.length;j++)
            {
                if(this.price1[i]==this.price2[j])
                {

                }
            }
            for(int k=0;k<this.price3.length;k++)
            {
                if(this.price1[i]==this.price3[k])
                {

                }
            }
            System.out.println(price1[i]);
        }

    }

}
