package GrandeSoftware5;

public enum Style {
    A, F;

    @Override
    public String toString() {
        switch (this) {
            case A: return "a";
            case F: return "f";
        }
        return null;
    }
}