package GrandeSoftware5;

import java.util.LinkedList;
import java.util.List;

public class Inventory {
	private List<Instrument> inventory;

	public Inventory() {
		inventory = new LinkedList<Instrument>();
	}

	public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
		Instrument instrument = new Instrument(serialNumber, price, spec) {
		};
		inventory.add(instrument);
	}

	public Instrument get(String serialNumber) {
		for (Instrument instrument : inventory) {
			if (instrument.getserialNumber().equals(serialNumber)) {
				return instrument;
			}
		}
		return null;
	}

	public List<Instrument> search(InstrumentSpec searchSpec) {
		List<Instrument> matchingInstruments = new LinkedList<Instrument>();
		for (Instrument instrument : inventory) {
			if (instrument.getSpec().matches(searchSpec)) {
				matchingInstruments.add(instrument);
			}
		}

		return matchingInstruments;
	}

}