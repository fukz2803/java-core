public enum Gender {
    MALE("Nam"), FEMALE("Nu");

    String value;

    Gender(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
