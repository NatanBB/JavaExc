package GrandeSoftware5;

public enum Type {
	ACOUSTIC, ELECTRIC;

	public String toString() {
		switch (this) {
		case ACOUSTIC:
			return "acoustic";
		case ELECTRIC:
			return "eletric";
		}
		return null;
	}
}