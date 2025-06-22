package in.xworkz.exception.ex;

public class PhoneNumberException extends RuntimeException{

    public PhoneNumberException(String s) {
        super(s);
    }

    public static void main(String[] args) {


    
    long phone=900789566L;
    String phoneLength=Long.toString(phone);
    if(phoneLength.length()!=10)
    {
        throw new PhoneNumberException("Lengtth is not equal to 10");

    }
    }

}
