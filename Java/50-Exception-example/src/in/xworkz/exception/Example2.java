//ArthemeticException

package in.xworkz.exception;

public class Example2
{
    public static void main(String[] args) {
        int division=10/0;
        try
        {
            System.out.println("-----------------try entry-----------------");
            System.out.println(division);
        }
        catch (Throwable obj)
        {
            System.out.println("-------------catch entry--------------------");
            obj.printStackTrace();
        }
    }
}
