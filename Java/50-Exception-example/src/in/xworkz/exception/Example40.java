//FormatFlagsConversionMismatchException
package in.xworkz.exception;

public class Example40 {
    public static void main(String[] args) {
        try {
            System.out.println("---------------------try entry-------------");
            System.out.printf("%#s", "text"); // invalid flag for conversion
        } catch (Throwable e) {
            System.out.println("---------------------catch entry-------------");
            e.printStackTrace();
        }
    }
}
