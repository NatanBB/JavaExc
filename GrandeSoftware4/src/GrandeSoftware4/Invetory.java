package GrandeSoftware4;

import java.util.LinkedList;
import java.util.List;

public class Invetory {
    private List<Instrument> invetory;

    public Invetory() {
        invetory = new LinkedList<Instrument>();
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
        Instrument instrument = null;
        if (spec instanceof GuitarSpec) {
            instrument = new Guitar(serialNumber, price, (GuitarSpec)spec);
        } else if (spec instanceof MandolinSpec) {
            instrument = new Mandolin(serialNumber, price, (MandolinSpec)spec);
        }
        invetory.add(instrument);
    }

    public Instrument getInstrument(String serialNumber) {
        for (Instrument instrument : invetory) {
            if (instrument.getSerialNumber().equals(serialNumber))
                return instrument;
        }
        return null;
    }

    public List<Guitar> search(GuitarSpec searchSpec) {
        List<Guitar> matchingGuitars = new LinkedList<Guitar>();
        for (Instrument instrument : invetory) {
            if (instrument instanceof Guitar) {
                Guitar guitar = (Guitar)instrument;
                if (guitar.getSpec().matches(searchSpec))
                    matchingGuitars.add(guitar);
            }
        }
        return matchingGuitars;
    }

    public List<Mandolin> search(MandolinSpec searchSpec) {
        List<Mandolin> matchingMandolins = new LinkedList<Mandolin>();
        for (Instrument instrument : invetory) {
            if (instrument instanceof Mandolin) {
                Mandolin mandolin = (Mandolin)instrument;
                if (mandolin.getSpec().matches(searchSpec))
                    matchingMandolins.add(mandolin);
            }
        }
        return matchingMandolins;
    }
}