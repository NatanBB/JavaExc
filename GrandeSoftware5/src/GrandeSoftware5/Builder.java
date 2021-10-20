package GrandeSoftware5;

public enum Builder {
    FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY, SELMER;

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
		default:
			break;
        }
        return null;
    }
}