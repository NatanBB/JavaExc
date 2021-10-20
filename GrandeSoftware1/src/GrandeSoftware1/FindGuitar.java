package GrandeSoftware1;

import java.util.Iterator;
import java.util.List;

public class FindGuitar {
    public static void main(String[] args) {
        Invetory invetory = new Invetory();
        initializeInvetory(invetory);

        Guitar whatErinLikes = new Guitar("", 0, Builder.FENDER,
                "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);

        List<Guitar> matchingGuitars = invetory.search(whatErinLikes);
        if (!matchingGuitars.isEmpty()) {
            System.out.println("Erin, talvez você goste dessas guitarras: ");
            for (Iterator<Guitar> i = matchingGuitars.iterator(); i.hasNext(); ) {
                Guitar guitar = (Guitar) i.next();
                System.out.println("Temos uma " +
                        guitar.getBuilder() + " " +
                        guitar.getModel() + " " +
                        guitar.getType() + " guitar\n" +
                        guitar.getBackWood() + " na traseira e laterais\n" +
                        guitar.getTopWood() + " no tampo.\nEla pode ser sua por US$" +
                        guitar.getPrice() + "!");
            }
        } else {
            System.out.println("Desculpe Erin, não temos nada para você.");
        }
    }

    private static void initializeInvetory(Invetory invetory) {
        invetory.addGuitar("V95693", 1499.95, Builder.FENDER,
                "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
    }
}