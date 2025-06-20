//DateTimeException
package in.xworkz.exception;

public class Example32 {
    public static void main(String[] args) {
        try {
            System.out.println("---------------------try entry-------------");
            java.time.LocalDate.of(2023, 2, 30); // invalid date
        } catch (Throwable e) {
            System.out.println("---------------------catch entry-------------");
            e.printStackTrace();
        }
    }
}
