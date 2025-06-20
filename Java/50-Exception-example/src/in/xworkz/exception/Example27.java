package in.xworkz.exception;

public class Example27 {
    public static void main(String[] args) {
        try {
            System.out.println("---------------------try entry-------------");
            throw new java.lang.reflect.MalformedParametersException();
        } catch (Throwable e) {
            System.out.println("---------------------catch entry-------------");
            e.printStackTrace();
        }
    }
}
