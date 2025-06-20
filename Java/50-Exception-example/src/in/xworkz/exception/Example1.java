package in.xworkz.exception;

public class Example1 extends RuntimeException{
    public static void main(String[] args) {
        String name="Nayana";
        try
        {
            System.out.println("----try entry---------------");
            System.out.println(name.charAt(10));
            System.out.println("----try exit---------------");
        }catch (Throwable obj)
        {
            System.out.println("----------------catch entry-------");
            obj.printStackTrace();

        }
    }
}
