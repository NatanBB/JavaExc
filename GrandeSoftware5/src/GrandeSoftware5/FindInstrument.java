package GrandeSoftware5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FindInstrument {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		Map<String, Enum> properties = new HashMap<String, Enum>();
		properties.put("builder", Builder.GIBSON);
		properties.put("backwood", Wood.MAPLE);
		InstrumentSpec clientSpec = new InstrumentSpec(properties);

		List<?> matchingInstruments = inventory.search(clientSpec);
		if (!matchingInstruments.isEmpty()) {
			System.out.println("You might like these instruments:");
			for (Iterator<?> i = matchingInstruments.iterator(); i.hasNext();) {
				Instrument instrument = (Instrument) i.next();
				InstrumentSpec spec = instrument.getSpec();
				System.out.println(
						"We have a " + spec.getProperty("InstrumentType") + " with the following properties:");
				for (Iterator<?> j = spec.getProperties().keySet().iterator(); j.hasNext();) {
					String propertyName = (String) j.next();
					if (propertyName.equals("instrumentType"))
						continue;
					System.out.println("    " + propertyName + ": " + spec.getProperty(propertyName));
				}
				System.out.println("    You can have this " + spec.getProperty("InstrumentType") + " for $"
						+ instrument.getPrice() + "\n---");
			}
		} else {
			System.out.println("Sorry, we have nothing for you.");
		}

	}

	private static void initializeInventory(Inventory inventory) {
		Map<String, Comparable> properties = new HashMap<String, Comparable>();
		properties.put("InstrumentType", InstrumentType.GUITAR);
		properties.put("builder", Builder.GIBSON);
		properties.put("model", "CJ");
		properties.put("numStrings", 6);
		properties.put("type", Type.ACOUSTIC);
		properties.put("topwood", Wood.INDIAN_ROSE_WOOD);
		properties.put("backwood", Wood.MAPLE);
		inventory.addInstrument("11277", 3999.95, new InstrumentSpec(properties));
		
		properties.put("InstrumentType", InstrumentType.GUITAR);
		properties.put("builder", Builder.MARTIN);
		properties.put("model", "D-18");
		properties.put("numStrings", 6);
		properties.put("type", Type.ACOUSTIC);
		properties.put("topwood", Wood.ADIRONDACK);
		properties.put("backwood", Wood.MAHOGANY);
		inventory.addInstrument("122784", 5495.95, new InstrumentSpec(properties));
		
		properties.put("InstrumentType", InstrumentType.GUITAR);
		properties.put("builder", Builder.FENDER);
		properties.put("model", "stratocastor");
		properties.put("numStrings", 6);
		properties.put("type", Type.ELECTRIC);
		properties.put("topwood", Wood.ALDER);
		properties.put("backwood", Wood.ALDER);
		inventory.addInstrument("V95693", 1499.95, new InstrumentSpec(properties));
		
		properties.put("InstrumentType", InstrumentType.GUITAR);
		properties.put("builder", Builder.FENDER);
		properties.put("model", "stratocastor");
		properties.put("numStrings", 6);
		properties.put("type", Type.ELECTRIC);
		properties.put("topwood", Wood.ALDER);
		properties.put("backwood", Wood.ALDER);
		inventory.addInstrument("V9512", 1549.95, new InstrumentSpec(properties));
		
		properties.put("InstrumentType", InstrumentType.GUITAR);
		properties.put("builder", Builder.GIBSON);
		properties.put("model", "SG'61 Reissue");
		properties.put("numStrings", 6);
		properties.put("type", Type.ELECTRIC);
		properties.put("topwood", Wood.MAHOGANY);
		properties.put("backwood", Wood.MAHOGANY);
		inventory.addInstrument("82765501", 1890.95, new InstrumentSpec(properties));
		
		properties.put("InstrumentType", InstrumentType.GUITAR);
		properties.put("builder", Builder.GIBSON);
		properties.put("model", "Les Paul");
		properties.put("numStrings", 6);
		properties.put("type", Type.ELECTRIC);
		properties.put("topwood", Wood.MAPLE);
		properties.put("backwood", Wood.MAPLE);
		inventory.addInstrument("70108276", 2295.95, new InstrumentSpec(properties));
	
		properties.put("InstrumentType", InstrumentType.MANDOLIN);
		properties.put("builder", Builder.GIBSON);
		properties.put("model", "F5-G");
		properties.put("type", Type.ACOUSTIC);
		properties.put("topwood", Wood.MAPLE);
		properties.put("backwood", Wood.MAPLE);
		properties.remove("numStrings");
		properties.put("style", Style.A);
		inventory.addInstrument("9019920", 5495.99, new InstrumentSpec(properties));

		properties.put("InstrumentType", InstrumentType.BANJO);
		properties.put("builder", Builder.GIBSON);
		properties.put("model", "RB-3");
		properties.put("type", Type.ACOUSTIC);
		properties.put("backwood", Wood.MAPLE);
		properties.put("numStrings", 5);
		properties.remove("style");
		inventory.addInstrument("8900231", 2945.95, new InstrumentSpec(properties));
	}
	
}