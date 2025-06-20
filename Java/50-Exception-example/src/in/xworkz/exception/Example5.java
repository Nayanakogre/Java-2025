package in.xworkz.exception;

public class Example5 {
    public static void main(String[] args) {
        int age=-99;
        try
        {
            if(age<0)
            System.out.println("----------try entry-------------");
            System.out.println( age);
        }catch (Throwable obj)
        {
            System.out.println("------------------catch entry-------------------");
            obj.printStackTrace();
        }
    }
}
