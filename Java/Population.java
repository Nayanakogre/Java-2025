public class Population {
    public static void main(String[] args) {

        long populationInCr = 140;
        long growthRate = 2;
        String[] populationInfo = {"Population: India", "Year: 2024","Duration:5 months"};

        while (populationInCr > 100) {
            System.out.println("The population is high.");
            break;
        }
        
        do {
            System.out.println("The growth rate is moderate.");
        } while (growthRate > 2);

        for (int i = 0; i < populationInfo.length; i++) {
            System.out.println(populationInfo[i]);
        }
    }
}
