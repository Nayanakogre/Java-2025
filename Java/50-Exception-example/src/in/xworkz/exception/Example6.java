package in.xworkz.exception;

public class Example6 {
    public static void main(String[] args) {
        String rollNumber="jjh165454";
        int roll=Integer.parseInt(rollNumber);
        try {
            System.out.println("----------try entry----------");
            System.out.println(roll);
        }catch (Throwable obj)
        {
            System.out.println("---------------catch entry----------------");
            obj.printStackTrace();
        }
    }
}
