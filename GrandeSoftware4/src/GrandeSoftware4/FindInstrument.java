package GrandeSoftware4;

import java.util.Iterator;
import java.util.List;

public class FindInstrument {

	public static void main(String[] args) {
		Invetory invetory = new Invetory();
		initializeInvetory(invetory);
		
		GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER,
                "Stratocastor", Type.ELECTRIC, 5, Wood.ALDER, Wood.ALDER);
		
		List<Guitar> matchingGuitars = invetory.search(whatErinLikes);
        if (!matchingGuitars.isEmpty()) {
            System.out.println("Erin, talvez você goste dessas guitarras: ");
            for (Iterator<Guitar> i = matchingGuitars.iterator(); i.hasNext(); ) {
                Guitar guitar = (Guitar) i.next();
                GuitarSpec spec = (GuitarSpec)guitar.getSpec();
                System.out.println("\nTemos uma " +
                        spec.getBuilder() + " " +
                        spec.getModel() + " " +
                        spec.getType() + " guitar:\n" +
                        spec.getNumStrings() + " cordas\n" +
                        spec.getBackwood() + " na traseira e laterais\n" +
                        spec.getTopwood() + " no tampo \nEla pode ser sua por US$" +
                        guitar.getPrice() + "!");
            }
        } else {
            System.out.println("\nDesculpe Erin, não temos nada para você.");
        }
        
        System.out.println("\n------------------------------");
        
        MandolinSpec whatLilyLikes = new MandolinSpec(Builder.GIBSON,
                "Stratocastor", Type.ACOUSTIC, Wood.BRAZILIAN_ROSE_WOOD,
                Wood.BRAZILIAN_ROSE_WOOD, Style.A);
		
		List<Mandolin> matchingMandolin = invetory.search(whatLilyLikes);
        if (!matchingMandolin.isEmpty()) {
            System.out.println("\nLily, talvez você goste desses mandolins: ");
            for (Iterator<Mandolin> i = matchingMandolin.iterator(); i.hasNext(); ) {
            	Mandolin mandolin = (Mandolin) i.next();
                MandolinSpec spec = (MandolinSpec)mandolin.getSpec();
                System.out.println("\nTemos um " +
                        spec.getBuilder() + " " +
                        spec.getModel() + " " +
                        spec.getType() + " mandolin:\n" +
                        spec.getBackwood() + " na traseira e laterais\n" +
                        spec.getTopwood() + " no tampo \nStyle " +
                        spec.getStyle() + "\nEla pode ser sua por US$" +
                        mandolin.getPrice() + "!");
            }
        } else {
            System.out.println("\nDesculpe Lily, não temos nada para você.");
        }
		
	}
	
	private static void initializeInvetory(Invetory invetory) {
        GuitarSpec spec = new GuitarSpec(Builder.FENDER,
                "Stratocastor", Type.ELECTRIC, 5, Wood.ALDER, Wood.ALDER);
        MandolinSpec spec2 = new MandolinSpec(Builder.GIBSON,
        		"Stratocastor", Type.ACOUSTIC, Wood.BRAZILIAN_ROSE_WOOD,
        		Wood.BRAZILIAN_ROSE_WOOD, Style.A);
        invetory.addInstrument("V95693", 1499.95, spec);
        invetory.addInstrument("V95694", 1599.99, spec);
        invetory.addInstrument("V95695", 1499.96, spec2);
    }

}