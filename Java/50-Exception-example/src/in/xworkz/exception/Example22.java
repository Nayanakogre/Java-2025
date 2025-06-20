//MissingResourceException
package in.xworkz.exception;

public class Example22 {
    public static void main(String[] args) {
        try {
            System.out.println("---------------------try entry-------------");
            java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("nonexistent");
            String value = bundle.getString("key");
        } catch (Throwable e) {
            System.out.println("---------------------catch entry-------------");
            e.printStackTrace();
        }
    }
}
