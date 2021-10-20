package GrandeSoftware4;

public class GuitarSpec extends InstrumentSpec{
    private int numStrings;

    public GuitarSpec(Builder builder, String model, Type type, int numStrings, Wood backwood, Wood topwood) {
        super(builder, model, type, backwood, topwood);
        this.numStrings = numStrings;
    }

    public int getNumStrings() {
        return numStrings;
    }

    @Override
    public boolean matches(InstrumentSpec otherSpec) {
        if (!super.matches(otherSpec))
            return false;
        if (!(otherSpec instanceof GuitarSpec))
            return false;
        GuitarSpec spec = (GuitarSpec)otherSpec;
        return numStrings == spec.numStrings;
    }
}