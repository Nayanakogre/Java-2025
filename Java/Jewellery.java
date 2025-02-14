public class Jewellery {
    public static void main(String[] args) {

        double goldPricePerGram = 8851;
        double silverPricePerGram = 700;
        String[] jewelleryInfo = {"Jewellery: neckless", "Shop: kalyan jewellers", 
                                  "Meterail: Gold & Silver"};

        while (goldPricePerGram > 8000) {
            System.out.println("Gold price is high.");
            break;
        }
        
        do {
            System.out.println("Silver price is stable.");
        } while (silverPricePerGram > 700);

        for (int i = 0; i < jewelleryInfo.length; i++) {
            System.out.println(jewelleryInfo[i]);
        }
    }
}
