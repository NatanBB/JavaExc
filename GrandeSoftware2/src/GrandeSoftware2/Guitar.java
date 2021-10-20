package GrandeSoftware2;

public class Guitar {
    private String serialNumber;
    private double price;
    private GuitarSpec spec;

    public Guitar(String serialNumber, double price, Builder builder,
                  String model, Type type, Wood backwood, Wood topwood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = new GuitarSpec(builder, model, type, backwood, topwood);
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