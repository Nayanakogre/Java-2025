//NullPointerException
package in.xworkz.exception;

public class Example4 {
    public static void main(String[] args) {
        String message=null;
        try
        {
            System.out.println("------------------try entry----------------");
            System.out.println(message.toString());
        }catch (Throwable obj)
        {
            System.out.println("--------------------catch entry----------------");
            obj.printStackTrace();
        }
    }
}
