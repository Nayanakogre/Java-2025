package in.xworkz.exception;

public class Example13 {
    public static void main(String[] args) {
        try {
            System.out.println("---------------------try entry-------------");
            Object[] arr = new String[5];
            arr[0] = 10;
        } catch (Throwable e) {
            System.out.println("---------------------catch entry-------------");
            e.printStackTrace();


        }
    }
}
