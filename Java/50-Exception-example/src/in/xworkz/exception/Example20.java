//InputMismatchException
package in.xworkz.exception;

public class Example20 {
    public static void main(String[] args) {
        try {
            System.out.println("---------------------try entry-------------");
            java.util.Scanner sc = new java.util.Scanner("abc");
            int value = sc.nextInt(); // expecting integer
        } catch (Throwable e) {
            System.out.println("---------------------catch entry-------------");
            e.printStackTrace();
        }
    }
}
