
//ArrayIndexOutOfBoundsException
package in.xworkz.exception;

public class Example3 {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5};
        try {
            System.out.println("---------------try entry-------------");
            System.out.println(numbers[10]);
        }catch (Throwable o)
        {
            System.out.println("---------------catch entry-----------");
            o.printStackTrace();
        }
    }
}
