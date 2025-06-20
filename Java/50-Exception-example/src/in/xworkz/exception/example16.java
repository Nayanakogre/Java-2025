//EmptyStackException
package in.xworkz.exception;

public class example16 {
    public static void main(String[] args) {
        try {
            System.out.println("---------------------try entry-------------");
            java.util.Stack<Integer> stack = new java.util.Stack<>();
            stack.pop(); // popping from empty stack
        } catch (Throwable e) {
            System.out.println("---------------------catch entry-------------");
            e.printStackTrace();
        }
    }
}
