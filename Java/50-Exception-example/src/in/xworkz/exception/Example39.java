//IllegalFormatConversionException
package in.xworkz.exception;

public class Example39 {
    public static void main(String[] args) {
        try {
            System.out.println("---------------------try entry-------------");
            System.out.printf("%d", "text"); // wrong type for format specifier
        } catch (Throwable e) {
            System.out.println("---------------------catch entry-------------");
            e.printStackTrace();
        }
    }
}
