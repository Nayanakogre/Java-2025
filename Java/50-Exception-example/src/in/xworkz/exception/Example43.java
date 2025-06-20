//UnknownFormatConversionException
package in.xworkz.exception;

public class Example43 {
    public static void main(String[] args) {
        try {
            System.out.println("---------------------try entry-------------");
            System.out.printf("%Q", "test"); // unknown format
        } catch (Throwable e) {
            System.out.println("---------------------catch entry-------------");
            e.printStackTrace();
        }
    }
}
