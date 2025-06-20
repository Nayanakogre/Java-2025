//IllegalCharsetNameException
package in.xworkz.exception;

public class Example34 {
    public static void main(String[] args) {
        try {
            System.out.println("---------------------try entry-------------");
            java.nio.charset.Charset.forName("!!invalid!!"); // invalid charset name
        } catch (Throwable e) {
            System.out.println("---------------------catch entry-------------");
            e.printStackTrace();
        }
    }
}
