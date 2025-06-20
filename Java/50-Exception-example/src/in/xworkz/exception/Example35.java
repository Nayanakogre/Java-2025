//UnsupportedCharsetException
package in.xworkz.exception;

public class Example35 {
    public static void main(String[] args) {
        try {
            System.out.println("---------------------try entry-------------");
            java.nio.charset.Charset.forName("unsupported-charset"); // not supported
        } catch (Throwable e) {
            System.out.println("---------------------catch entry-------------");
            e.printStackTrace();
        }
    }
}
