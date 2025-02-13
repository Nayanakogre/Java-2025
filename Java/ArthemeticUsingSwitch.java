public class ArthemeticUsingSwitch {
    public static void main(String[] args) {
       
        int num1 = 20;
        int num2 = 5;
        int choice = 4;
        int result;
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Addition: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Substraction: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Multplication: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Division: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice! Please select a valid option.");
        }
        
        
    }
}
