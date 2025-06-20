//IllegalMonitorStateException

package in.xworkz.exception;

public class Example17 extends Exception{

        public static void main(String[] args) {
            try {
                System.out.println("---------------------try entry-------------");
                Object obj = new Object();
                obj.notify(); // calling notify without synchronized block
            } catch (Throwable e) {
                System.out.println("---------------------catch entry-------------");
                e.printStackTrace();
            }
        }
    }