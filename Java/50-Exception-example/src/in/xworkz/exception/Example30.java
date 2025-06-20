//UncheckedIOException
package in.xworkz.exception;

public class Example30 {
    public static void main(String[] args) {
        try {
            System.out.println("---------------------try entry-------------");
            throw new java.io.UncheckedIOException(new java.io.IOException("Unchecked IO"));
        } catch (Throwable e) {
            System.out.println("---------------------catch entry-------------");
            e.printStackTrace();
        }
    }
}
