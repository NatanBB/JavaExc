package GrandeSoftware3;

public class GuitarSpec {
    private Builder builder;
    private String model;
    private Type type;
    private int numStrings;
    private Wood backwood;
    private Wood topwood;

    public GuitarSpec(Builder builder, String model, Type type, int numStrings, Wood backwood, Wood topwood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.numStrings = numStrings;
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

    public int getNumStrings() { return this.numStrings; }

    public Wood getBackWood() {
        return this.backwood;
    }

    public Wood getTopWood() {
        return this.topwood;
    }

    public boolean matches(GuitarSpec otherSpec) {
        if (builder != otherSpec.builder) {
            return false;
        }
        if ((model != null) && (!model.equals("")) && (!model.equals(otherSpec.model))) {
            return false;
        }
        if (type != otherSpec.type) {
            return false;
        }
        if (numStrings != otherSpec.numStrings) {
            return false;
        }
        if (backwood != otherSpec.backwood) {
            return false;
        }
        if (topwood != otherSpec.topwood) {
            return false;
        }
        return true;
    }
}