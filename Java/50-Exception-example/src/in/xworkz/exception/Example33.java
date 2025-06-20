//BufferUnderflowException
package in.xworkz.exception;

public class Example33 {
    public static void main(String[] args) {
        try {
            System.out.println("---------------------try entry-------------");
            java.nio.ByteBuffer buffer = java.nio.ByteBuffer.allocate(1);
            buffer.get(); // OK
            buffer.get(); // underflow
        } catch (Throwable e) {
            System.out.println("---------------------catch entry-------------");
            e.printStackTrace();
        }
    }
}
