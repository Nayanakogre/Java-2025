package com.xworkz.finalu;

public class Player {
    public Player()
    {
        System.out.println("Running on no arg constructer");
    }

//    '@Override' not applicable to constructo
//    @Override
//    public Player()
//    {
//
//    }
    final void play()
    {
        System.out.println("Running on method play");
    }
//    Method does not override method from its superclass
//    @Override
//    final void play()
//    {
//        System.out.println("Running on method play");
//    }
    public static void playCricket()
    {
        System.out.println("Running on playCricket Method");
    }
//
    public void playKabbadi()
    {
        System.out.println("Running on playKabbad method");
    }
   private void playChess()
   {

   }



}
