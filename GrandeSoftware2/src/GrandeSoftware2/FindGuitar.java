package GrandeSoftware2;

import java.util.Iterator;
import java.util.List;

public class FindGuitar {
    public static void main(String[] args) {
        Invetory invetory = new Invetory();
        initializeInvetory(invetory);

        GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER,
                "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);

        List<Guitar> matchingGuitars = invetory.search(whatErinLikes);
        if (!matchingGuitars.isEmpty()) {
            System.out.println("Erin, talvez voc� goste dessas guitarras: ");
            for (Iterator<Guitar> i = matchingGuitars.iterator(); i.hasNext(); ) {
                Guitar guitar = i.next();
                GuitarSpec spec = guitar.getSpec();
                System.out.println("Temos uma " +
                        spec.getBuilder() + " " +
                        spec.getModel() + " " +
                        spec.getType() + " guitar\n" +
                        spec.getBackWood() + " na traseira e laterais\n" +
                        spec.getTopWood() + " no tampo.\nEla pode ser sua por US$" +
                        guitar.getPrice() + "!");
            }
        } else {
            System.out.println("Desculpe Erin, n�o temos nada para voc�.");
        }
    }

    private static void initializeInvetory(Invetory invetory) {
        invetory.addGuitar("V95693", 1499.95, Builder.FENDER,
                "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        invetory.addGuitar("V95694", 1499.96, Builder.FENDER,
                "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
    }
}