//IllegalThreadStateException
package in.xworkz.exception;

public class Example15 {
    public static void main(String[] args) {
        try {
            System.out.println("---------------------try entry-------------");
            Thread t = new Thread();
            t.start();
            t.start(); // starting same thread again
        } catch (Throwable e) {
            System.out.println("---------------------catch entry-------------");
            e.printStackTrace();
        }
    }
}
