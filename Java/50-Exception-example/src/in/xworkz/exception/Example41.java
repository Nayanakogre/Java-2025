//DuplicateFormatFlagsException
package in.xworkz.exception;

public class Example41 {
    public static void main(String[] args) {
        try {
            System.out.println("---------------------try entry-------------");
            System.out.printf("%--d", 100); // duplicate flag
        } catch (Throwable e) {
            System.out.println("---------------------catch entry-------------");
            e.printStackTrace();
        }
    }
}
