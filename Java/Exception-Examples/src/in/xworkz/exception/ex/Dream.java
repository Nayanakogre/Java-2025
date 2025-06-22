package in.xworkz.exception.ex;

public class Dream extends Exception{
    public Dream(String invalidException) {
    }

    public static void main(String[] args) throws Dream {
        int age=17;
       throw new Dream("Invalid exception");
    }

}
