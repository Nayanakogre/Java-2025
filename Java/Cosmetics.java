public class Cosmetics {
    public static void main(String[] args) {

        double productPrice = 1000;
        int quantity = 50;
        String[] cosmeticPrices = {"Lipstick: 250", "Foundation: 200", "Moisturizer: 221", "Kajal: 50", "Toner: 500"};

        // Print product price message once
        if (productPrice > 800) {
            System.out.println("Product price is high.");
        }

        // Print quantity message once
        if (quantity < 100) {
            System.out.println("Quantity is moderate.");
        }

        // Print cosmetics prices
        System.out.println("Cosmetics Price List:");
        for (int i = 0; i < cosmeticPrices.length; i++) {
            System.out.println(cosmeticPrices[i]);
        }
    }
}
