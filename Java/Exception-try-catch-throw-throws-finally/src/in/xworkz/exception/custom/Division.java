package in.xworkz.exception.custom;

public class Division {
    public static void main(String[] args) {

        try {
            divideByZero();
        }catch (ArithmeticException a)
        {
            System.out.println("Error!dividing a number by zero is not allowed");
        }
        finally {
            System.out.println("Change denominator except 0");
        }
    }
    public static void divideByZero() throws ArithmeticException
    {
        int num=10;
        int dnum=0;
        int result=num/dnum;
        System.out.println("result");
        throw new ArithmeticException();
    }
}
