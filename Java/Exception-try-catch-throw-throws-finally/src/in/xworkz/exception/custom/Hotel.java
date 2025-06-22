package in.xworkz.exception.custom;

public class Hotel {
    public static void main(String[] args) {
        try
        {
            closed();
        }catch (HotelException h)
        {
            h.printStackTrace();
        }
        finally {
            System.out.println("Go to home and cock");
        }

    }
    public static void closed() throws HotelException
    {
        throw new HotelException("Hotel is closed");
    }
}
