//MissingFormatArgumentException
package in.xworkz.exception;

public class Example31 {
    public static void main(String[] args) {
        try {
            System.out.println("---------------------try entry-------------");
            System.out.printf("Hello %s %s", "World"); // one argument missing
        } catch (Throwable e) {
            System.out.println("---------------------catch entry-------------");
            e.printStackTrace();
        }
    }
}
