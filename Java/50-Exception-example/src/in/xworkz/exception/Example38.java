//ReadOnlyBufferException
package in.xworkz.exception;

public class Example38 {
    public static void main(String[] args) {
        try {
            System.out.println("---------------------try entry-------------");
            java.nio.ByteBuffer buffer = java.nio.ByteBuffer.allocate(10).asReadOnlyBuffer();
            buffer.put((byte) 1); // can't modify read-only buffer
        } catch (Throwable e) {
            System.out.println("---------------------catch entry-------------");
            e.printStackTrace();
        }
    }
}
