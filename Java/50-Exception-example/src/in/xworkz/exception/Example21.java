//SecurityException
package in.xworkz.exception;

public class Example21 {
    public static void main(String[] args) {
        try {
            System.out.println("---------------------try entry-------------");
            System.setSecurityManager(new SecurityManager());
            System.getSecurityManager().checkExit(1); // check permission
        } catch (Throwable e) {
            System.out.println("---------------------catch entry-------------");
            e.printStackTrace();
        }
    }
}
