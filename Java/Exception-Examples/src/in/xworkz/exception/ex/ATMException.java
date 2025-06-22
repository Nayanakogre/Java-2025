package in.xworkz.exception.ex;

public class ATMException extends RuntimeException {
    public ATMException(String message)
    {
super(message);
    }

    public static void main(String[] args) {
double balnace=0;
        int pin=67890;
        String pinLength=Integer.toString(pin);
        if(balnace<1000)
        {
            throw new ATMException("Ammount can not be withdrawn plase maintain min balance");
        }
        if(pinLength.length()!=4)
        {
            throw new ATMException("Pin length should alaways be eqaul to 4 ");
        }
    }
}
