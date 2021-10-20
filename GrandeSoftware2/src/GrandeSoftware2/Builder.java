package GrandeSoftware2;

public enum Builder {
    FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;

    @Override
    public String toString() {
        switch (this) {
            case FENDER: return "fender";
            case MARTIN: return "martin";
            case GIBSON: return "gibson";
            case COLLINGS: return "collings";
            case OLSON: return "olson";
            case RYAN: return "ryan";
            case PRS: return "prs";
            case ANY: return "any";
        }
        return null;
    }
}