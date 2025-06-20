package in.xworkz.exception;

public class Example8 {
    public static void main(String[] args) {
        Object[] number=new String[5];
        number[0]=10;
        try
        {
            System.out.println("--------------------try entry-----------------");
            System.out.println(number);
        }catch (Throwable obj)
        {
            System.out.println("------------catch entry-------------");
            obj.printStackTrace();
        }
    }

}
