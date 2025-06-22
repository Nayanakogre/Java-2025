package in.xworkz.exception.custom;

public class Hostel {
    public static void main(String[] args) {
        try {
            hostelCLosed();
        }
        catch (HotelException h)
        {
            h.printStackTrace();
        }
        finally {
            System.out.println("Go to home hostel closed");
        }
    }
    public static void hostelCLosed() throws HotelException
    {
        throw new HotelException("Hostel is closed");
    }
}
