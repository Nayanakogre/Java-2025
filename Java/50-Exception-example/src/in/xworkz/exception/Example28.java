//IllformedLocaleException
package in.xworkz.exception;

public class Example28 {
    public static void main(String[] args) {
        try {
            System.out.println("---------------------try entry-------------");
            java.util.Locale.Builder builder = new java.util.Locale.Builder();
            builder.setLanguage("12"); // invalid language code
        } catch (Throwable e) {
            System.out.println("---------------------catch entry-------------");
            e.printStackTrace();
        }
    }
}
