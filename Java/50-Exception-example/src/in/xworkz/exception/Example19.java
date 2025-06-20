//IndexOutOfBoundsException
package in.xworkz.exception;

public class Example19 {
    public static void main(String[] args) {
        try {
            System.out.println("---------------------try entry-------------");
            java.util.List<String> list = new java.util.ArrayList<>();
            list.get(0); // no elements
        } catch (Throwable e) {
            System.out.println("---------------------catch entry-------------");
            e.printStackTrace();
        }
    }
}
