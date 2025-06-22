package in.xworkz.exception.custom;

public class Laptop {
    public static void main(String[] args) {
        try {
            blueScreenError();
        }catch (LaptopException laptopException)
        {
            laptopException.printStackTrace();
        }
        finally {
            System.out.println("Go to laptop service shop");
        }
    }
    public static void blueScreenError() throws LaptopException
    {
        throw new LaptopException("Laptop has Blue screen error");
    }
}
