package GrandeSoftware2;

public class GuitarSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood backwood;
    private Wood topwood;

    public GuitarSpec(Builder builder, String model, Type type, Wood backwood, Wood topwood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backwood = backwood;
        this.topwood = topwood;
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
        return this.backwood;
    }

    public Wood getTopWood() {
        return this.topwood;
    }
}