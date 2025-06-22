import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class SolarSystem {
    public static void main(String[] args) {
        Set<String> planets= new HashSet<>();
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupitar");
        planets.add("Saturn");
        planets.add("Uranious");
        planets.add("Neptune");
        planets.add("Pluto");
        planets.add("Pluto");
        planets.add("Pluto");
        planets.add("Mercury");
        //Iterator<iterator=planets.iterator();
        Iterator<String> iterator=planets.iterator();
        while (iterator.hasNext())
        {
            String planet=iterator.next();
            System.out.println(planet);
        }

    }
}
