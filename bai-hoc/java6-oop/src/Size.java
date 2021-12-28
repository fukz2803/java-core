public enum Size {
    LARGE ("Large"),
    MEDIUM ("Medium"),
    SMALL ("Small"),
    TINY ("Tiny");

    String value;

    Size(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
