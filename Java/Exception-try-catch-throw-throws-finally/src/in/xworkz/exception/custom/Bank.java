package in.xworkz.exception.custom;

public class Bank {
    public static void main(String[] args) {
        try {
            checkBalance();

        } catch (BankException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Bank is open");
        }

       // throw new BankException("No account avaliable");
    }

    private static void checkBalance() throws BankException {
        throw new BankException("No account avaliable");
    }


}
