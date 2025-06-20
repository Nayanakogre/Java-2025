package in.xworkz.exception;

public class Example36 {
    public static void main(String[] args) {
        try {
            System.out.println("---------------------try entry-------------");
            throw new RuntimeException("Command cancelled unexpectedly");
        } catch (Throwable e) {
            System.out.println("---------------------catch entry-------------");
            e.printStackTrace();
        }
    }
}
