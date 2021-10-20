package GrandeSoftware1;

public class Guitar {
    private String serialNumber;
    private double price;
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;

    public Guitar(String serialNumber, double price, Builder builder,
                  String model, Type type, Wood backwood, Wood topwood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backwood;
        this.topWood = topwood;
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

    public Builder getBuilder() {
        return this.builder;
    }

    public String getModel() {
        return this.model;
    }

    public Type getType() {
        return this.type;
    }

    public Wood getBackWood() {
        return this.backWood;
    }

    public Wood getTopWood() {
        return this.topWood;
    }
}