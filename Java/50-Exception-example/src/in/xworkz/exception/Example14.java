package in.xworkz.exception;

public class Example14 extends Exception{
    public static void main(String[] args) {
        try {
            System.out.println("---------------------try entry-------------");
            Object obj = new Integer(10);
            String s = (String) obj;
        } catch (Throwable e) {
            System.out.println("---------------------catch entry-------------");
            e.printStackTrace();


        }

    }
}
