package GrandeSoftware5;

public abstract class Instrument {
	private String serialNumber;
	private double price;
	private InstrumentSpec spec;

	public Instrument(String serialNumber, double price, InstrumentSpec spec) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = spec;
	}

	public String getserialNumber() {
		return serialNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double newprice) {
		this.price = newprice;
	}

	public InstrumentSpec getSpec() {
		return spec;
	}
}