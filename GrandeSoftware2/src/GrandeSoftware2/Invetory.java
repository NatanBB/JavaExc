package GrandeSoftware2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Invetory {
    private List<Guitar> guitars;

    public Invetory() {
        guitars = new LinkedList<Guitar>();
    }

    public void addGuitar(String serialNumber, double price, Builder builder,
                          String model, Type type, Wood backwood, Wood topWood) {
        Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backwood, topWood);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar)i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        } return null;
    }

    public List<Guitar> search(GuitarSpec searchSpec) {
        List<Guitar> matchingGuitars = new LinkedList<Guitar>();
        for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar)i.next();
            GuitarSpec guitarSpec = guitar.getSpec();
            if (searchSpec.getBuilder() != guitarSpec.getBuilder()) {
                continue;
            }
            String model = searchSpec.getModel().toLowerCase();
            if ((model != null) && (!model.equals("")) && (!model.equals(guitarSpec.getModel().toLowerCase()))) {
                continue;
            }
            if (searchSpec.getType() != guitarSpec.getType()) {
                continue;
            }
            if (searchSpec.getBackWood() != guitarSpec.getBackWood()) {
                continue;
            }
            if (searchSpec.getTopWood() != guitarSpec.getTopWood()) {
                continue;
            }
            matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }
}