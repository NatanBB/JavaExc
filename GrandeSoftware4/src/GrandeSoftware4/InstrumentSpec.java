package GrandeSoftware4;

public class InstrumentSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood backwood;
    private Wood topwood;

    public InstrumentSpec(Builder builder, String model, Type type, Wood backwood, Wood topwood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backwood = backwood;
        this.topwood = topwood;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackwood() {
        return backwood;
    }

    public Wood getTopwood() {
        return topwood;
    }

    public boolean matches(InstrumentSpec otherSpec) {
        if (builder != otherSpec.builder)
            return false;
        if ((model != null) && (!model.equals("")) && (!model.equals(otherSpec.model)))
            return false;
        if (type != otherSpec.type)
            return false;
        if (backwood != otherSpec.backwood)
            return false;
        return topwood == otherSpec.topwood;
    }
}