public class Hotel {
    public static void main(String[] args) {

        double mealPrice = 500;
        double discountRate = 10;
        int[] availableDishes = {1, 2, 3, 4, 5};

        while (mealPrice > 400) {
            System.out.println("Meal price is high.");
            break;
        }
        
        do {
            System.out.println("Discount rate is moderate.");
        } while (discountRate > 10);

        for (int i = 0; i < availableDishes.length; i++) {
            System.out.println("Available Dish ID: " + availableDishes[i]);
        }
    }
}
