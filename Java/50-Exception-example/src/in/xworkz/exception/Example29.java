//NullPointerException
package in.xworkz.exception;

public class Example29 {
    public static void main(String[] args) {
        try {
            System.out.println("---------------------try entry-------------");
            java.util.spi.LocaleServiceProvider provider = java.util.spi.LocaleServiceProvider.class.cast(null);
            provider.getAvailableLocales(); // null object
        } catch (Throwable e) {
            System.out.println("---------------------catch entry-------------");
            e.printStackTrace();
        }
    }
}
