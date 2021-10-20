package GrandeSoftware3;

public class Guitar {
    private String serialNumber;
    private double price;
    private GuitarSpec spec;

    public Guitar(String serialNumber, double price, GuitarSpec spec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public GuitarSpec getSpec() {
        return spec;
    }
}