package in.xworkz.exception;

public class Example37 {
    public static void main(String[] args) {


     try {
        System.out.println("---------------------try entry-------------");
        java.nio.channels.Selector.open().selectNow(); // force illegal usage
    } catch (Throwable e) {
        System.out.println("---------------------catch entry-------------");
        e.printStackTrace();
    }
}
}
