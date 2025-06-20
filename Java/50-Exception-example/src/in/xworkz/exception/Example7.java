package in.xworkz.exception;

public class Example7 {
    public static void main(String[] args) {
        int[] arr = new int[-5];
        try
        {
            System.out.println("-----------try entry---------------");
            System.out.println(arr);
        }catch (Throwable obj)
        {
            System.out.println("--------------------catch entry------------");
            obj.printStackTrace();
        }
    }
}
