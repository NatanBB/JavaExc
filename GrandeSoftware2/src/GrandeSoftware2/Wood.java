package GrandeSoftware2;

public enum Wood {
    INDIAN_ROSE_WOOD, BRAZILIAN_ROSE_WOOD, MAHOGANY, MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA;

    @Override
    public String toString() {
        switch (this) {
            case INDIAN_ROSE_WOOD: return "indian_rose_wood";
            case BRAZILIAN_ROSE_WOOD: return "brazilian_rose_wood";
            case MAHOGANY: return "mahogany";
            case MAPLE: return "maple";
            case COCOBOLO: return "cocobolo";
            case CEDAR: return "cedar";
            case ADIRONDACK: return "adirondack";
            case ALDER: return "alder";
            case SITKA: return "sitka";
        }
        return null;
    }
}