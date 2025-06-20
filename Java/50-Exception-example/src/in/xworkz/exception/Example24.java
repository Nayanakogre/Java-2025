//TypeNotPresentException
package in.xworkz.exception;

public class Example24 {
    public static void main(String[] args) {
        try {
            System.out.println("---------------------try entry-------------");
            throw new TypeNotPresentException("TypeName", new Throwable());
        } catch (Throwable e) {
            System.out.println("---------------------catch entry-------------");
            e.printStackTrace();
        }
    }
}
