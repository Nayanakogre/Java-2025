package in.xworkz.exception;

public class Example9 {
    public static void main(String[] args) {
        try
        {
            System.out.println("----------try entry-------------");
            System.out.println(java.time.LocalDate.of(2025, 2, 30));
        }catch (Throwable obj)
        {
            System.out.println("-----catch entry---------");
            obj.printStackTrace();

        }
    }
}