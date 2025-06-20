//EnumConstantNotPresentException
package in.xworkz.exception;

public class Example25 {
    enum Color {
        RED, BLUE;
    }

    public static void main(String[] args) {
        try {
            System.out.println("---------------------try entry-------------");
            throw new EnumConstantNotPresentException(Color.class, "GREEN");
        } catch (Throwable e) {
            System.out.println("---------------------catch entry-------------");
            e.printStackTrace();
        }
    }
}
