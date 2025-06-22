package in.xworkz.exception.custom;

public class Mobile {
    public static void main(String[] args) {
        try
        {
            hang();
        }catch (HangException he)
        {
            he.printStackTrace();
        }
        finally {
            System.out.println("Still you can use mobile");
        }

    }
    public static  void hang() throws HotelException
    {
        throw new HangException("Mobile is hanging");
    }
}
